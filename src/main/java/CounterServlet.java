import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/count1")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        counter += 1;response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>The count is " + counter + ".</h1>");
    }
}
