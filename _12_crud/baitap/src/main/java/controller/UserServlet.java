package controller;

import model.Service.IUserService;
import model.Service.Impl.UserService;
import model.bean.User;
import model.reponsitory.IUserRepository;
import model.reponsitory.impl.UserReponsitoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controller.UserServlet", urlPatterns = {"/users", ""})
public class UserServlet extends HttpServlet {
    private final IUserService iUserService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;

            case "update":
                update(request, response);
                break;
            case "delete":
                break;
            case "search":
                searchCountry(request,response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "update":
                formEdit(request, response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "search":
//                showFormSearch(request,response);
                break;
            case "orderBy":
                orderBy(request,response);
                break;
            default:
                request.setAttribute("listAll", this.iUserService.listAll());
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
            String name = request.getParameter("nameUser");
            String phone = request.getParameter("phoneUser");
            String email = request.getParameter("emailUser");
            String address = request.getParameter("addressUser");
            String country = request.getParameter("countryUser");

            User user = new User(name, phone, email, address, country);
            this.iUserService.insert(user);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/InsertInto.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/InsertInto.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("userId"));
        String name = request.getParameter("nameUser");
        String phone = request.getParameter("phoneUser");
        String email = request.getParameter("emailUser");
        String address = request.getParameter("addressUser");
        String country = request.getParameter("country");

        User user = new User(id,name, phone, email, address, country);
        this.iUserService.update(user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/updateUser.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void formEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("userId"));
        User edit = this.iUserService.findById(id);
        request.setAttribute("editUser", edit);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/updateUser.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        Integer idUser = Integer.parseInt(request.getParameter("userId"));
        this.iUserService.detete(idUser);
        List<User> delete = this.iUserService.listAll();
        request.setAttribute("listAll", delete);
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher1.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchCountry(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("search");
        List<User> user = this.iUserService.search(country);
        request.setAttribute("listAll", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void showFormSearch(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/search.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void orderBy(HttpServletRequest request, HttpServletResponse response) {
        List<User> list = this.iUserService.orderBy();
        request.setAttribute("listAll", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}