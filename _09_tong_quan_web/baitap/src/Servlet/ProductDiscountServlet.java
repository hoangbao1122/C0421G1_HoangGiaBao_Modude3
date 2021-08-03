package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDiscountServlet",urlPatterns =  "/discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String description = request.getParameter("description");
            int price = Integer.parseInt(request.getParameter("price"));
            int percent = Integer.parseInt(request.getParameter("percent"));

            double discount = price * percent * 0.01;

            request.setAttribute("chietkhau",discount);
            request.getRequestDispatcher("result.jsp").forward(request,response);

    }
}
