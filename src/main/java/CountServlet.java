import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Count", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    int counter=0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println(input);
        if (input !=null) {
            counter=0;
        } else{
            counter++;
        }
        out.println("At present the value of the counter is " + counter);


    }
}

