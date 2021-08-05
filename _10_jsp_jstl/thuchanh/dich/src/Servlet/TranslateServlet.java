package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet",urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map = new HashMap<>();
        map.put("hello","xin chào");
        map.put("bye","tạm biệt");
        map.put("name","tên");

        String english = request.getParameter("english");
        String result = map.get(english);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (result!= null){
            writer.println("<p>result " + english + "=" + result);
        }else {
            writer.println("<p>no");
        }
        writer.println("</html>");

    }
}
