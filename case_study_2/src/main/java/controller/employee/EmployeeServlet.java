package controller.employee;

import model.Service.employee.IEmployeeService;
import model.Service.employee.EmployeeServiceImpl;
import model.bean.Customer.Customer;
import model.bean.employee.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request,response);
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
                showFormCreate(request,response);
                break;
            case "delete":
                deleteEmp(request,response);
                break;
            default:
                request.setAttribute("listEmp", this.iEmployeeService.list());
                request.getRequestDispatcher("view/Employee.jsp").forward(request,response);
                break;
        }
    }
    private void create(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("nameEmp");
        String birthday = request.getParameter("birthdayEmp");
        String idCard = request.getParameter("idCardEmp");
        String salary = request.getParameter("salaryEmp");;
        String phone =request.getParameter("phoneEmp");
        String email = request.getParameter("emailEmp");
        String address = request.getParameter("addressEmp");
        int position = Integer.parseInt(request.getParameter("positionEmp"));
        int education = Integer.parseInt(request.getParameter("educationEmp"));
        int division = Integer.parseInt(request.getParameter("divisionEmp"));
        String userName = request.getParameter("userNameEmp");

        Employee employee = new Employee(name,birthday,idCard,salary,phone,email,address,position,education,division,userName);
        this.iEmployeeService.create(employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("case-study/employee/createEmployee.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormCreate(HttpServletRequest request,HttpServletResponse response){

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("case-study/employee/createEmployee.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteEmp(HttpServletRequest request,HttpServletResponse response){
        Integer id = Integer.parseInt(request.getParameter("empId"));
        this.iEmployeeService.delete(id);
        List<Employee> list = this.iEmployeeService.list();
        request.setAttribute("listEmp",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/Employee.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
