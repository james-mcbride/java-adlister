import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "IncorrectServlet", urlPatterns = "/incorrect")
public class Incorrect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        request.getRequestDispatcher("outcome.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        request.setAttribute("outcome", "Incorrect!");
        request.getRequestDispatcher("outcome.jsp").forward(request, response);
    }


}