package controller;

import model.Service.IUserService;
import model.Service.UserServiceImpl;
import model.bean.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controller.UserServlet", urlPatterns = {"/users",""})
public class UserServlet extends HttpServlet {
   private final IUserService iUserService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;

            case "edit":
                break;

            case "delete":
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
                break;
            case "edit":
//                Do somthing
                break;
            case "delete":
                //                Do somthing
                break;
            default:
                listUser(request, response);
                break;
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> list = this.iUserService.findAll();
        request.setAttribute("listAll", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
//Kh??ng ph???i l???i b??i l??m, c??i n??y l???i v??? version, Kh??ng h??? tr???, n??n n?? ko load ???????c controller, version JVM n??y ??ang ??? version 55.