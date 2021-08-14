package controller.Customer;

import model.Service.Customer.CustomerServiceImpl;
import model.Service.Customer.ICustomerService;
import model.bean.Customer.Customer;
import model.bean.Customer.CustomerType;
import model.repository.Impl.customer.CustomerTypeImpl;
import model.repository.Impl.customer.ICustomerType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@javax.servlet.annotation.WebServlet(name = "Servlet", urlPatterns = {"/customer"})
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    private ICustomerService interfaceService = new CustomerServiceImpl();
    private ICustomerType iCustomerType = new CustomerTypeImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "edit":
                editCus(request, response);
                break;
            default:
                break;

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                deleteCus(request,response);
                break;
            default:
                request.setAttribute("listAll", this.interfaceService.listAll());
                request.getRequestDispatcher("view/Customer.jsp").forward(request, response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameCus");
        Integer type = Integer.valueOf(request.getParameter("type"));
        String birthday = request.getParameter("birthdayCus");
        String gender = request.getParameter("genderCus");
        String card = request.getParameter("card_id");
        String phone = request.getParameter("phoneCus");
        String email = request.getParameter("emailCus");
        String address = request.getParameter("addressCus");

        Customer customer = new Customer(name, type, birthday, gender, card, phone, email, address);
        this.interfaceService.create(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("case-study/customer/createCustomer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {

//        request.setAttribute("custype",this.iCustomerType.listAll());
        showCusType(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("case-study/customer/createCustomer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCusType(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("custype", this.iCustomerType.listAll());
    }

    private void deleteCus(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("CusId"));
        this.interfaceService.deleteCus(id);
        List<Customer> customers = this.interfaceService.listAll();
        request.setAttribute("listAll", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/Customer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCus(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("CusId"));
        String name = request.getParameter("nameCus");
        Integer type = Integer.valueOf(request.getParameter("type"));
        String birthday = request.getParameter("birthdayCus");
        String gender = request.getParameter("genderCus");
        String card = request.getParameter("card_id");
        String phone = request.getParameter("phoneCus");
        String email = request.getParameter("emailCus");
        String address = request.getParameter("addressCus");
        Customer customer = new Customer(id, type, name, birthday, gender, card, phone, email, address);
        this.interfaceService.edit(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("case-study/customer/editCustomer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("CusId"));
        Customer edit = this.interfaceService.findId(id);
        showCusType(request, response);
        request.setAttribute("cusEdit", edit);
        RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("case-study/customer/editCustomer.jsp");
        try {
            requestDispatcher2.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

