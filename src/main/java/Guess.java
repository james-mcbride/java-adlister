import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "Guess", urlPatterns = "/guess")
public class Guess extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        System.out.println(request.getParameter("number"));
        int guess = Integer.parseInt(request.getParameter("number"));
        int randomNum= (int) (Math.round(Math.random()*2)+1);
        System.out.println("random number: "+randomNum);
        if (guess==randomNum){
            response.sendRedirect("correct");

        } else{
            response.sendRedirect("incorrect");
        }
    }


}