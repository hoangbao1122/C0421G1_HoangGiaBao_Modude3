package Servlet;

import Bean.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Hoàng Gia Bảo","2000/11/23","da nang", "https://vtv1.mediacdn.vn/thumb_w/650/2020/4/20/one-piece-anime-hiatus-15873776419971960853722.jpg"));
        list.add(new Customer("Bảo Gia Hoàng","2000/11/23","da nang", "https://vtv1.mediacdn.vn/thumb_w/650/2020/4/20/one-piece-anime-hiatus-15873776419971960853722.jpg"));
        request.setAttribute("CustomerListServlet",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
