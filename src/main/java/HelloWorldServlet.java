import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (userName!= null) {
            out.println("<h1>Hello " + userName + "!</h1>");
        } else{
            out.println("<h1>Hello World!</h1>");

        }
    }

}
