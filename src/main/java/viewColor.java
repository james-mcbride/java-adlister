import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class viewColor extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        String color = request.getParameter("color");
        request.setAttribute("color", color);
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }


}