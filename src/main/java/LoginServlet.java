import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Boolean loggedIn=(Boolean) session.getAttribute("loggedIn");
        if (loggedIn==null){
            loggedIn=false;
        }
        if (loggedIn) {
                response.sendRedirect("/profile");
        } else{
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        boolean validAttempt = !username.equals("") && !password.equals("");
        session.setAttribute("loggedIn", validAttempt);
        session.setAttribute("username", username);
        if (validAttempt) {
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
