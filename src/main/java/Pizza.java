import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class Pizza extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        String address = request.getParameter("address");
        request.setAttribute("address", address);
        String sizeCrust = request.getParameter("sizeAndCrust");
//        String cheese = request.getParameter("amountOfCheese");
//        String sauce=request.getParameter("typeOfSauce");
//        String sauceAmount=request.getParameter("amountOfSauce");
//        String toppings=request.getParameter("beef");
        String cheese = request.getParameter("amountOfCheese");
        String sauce=request.getParameter("typeOfSauce");
        String sauceAmount=request.getParameter("amountOfSauce");
        String beef=request.getParameter("beef");
        String ham=request.getParameter("ham");
        String bacon=request.getParameter("bacon");
        String steak=request.getParameter("steak");
        String peppers=request.getParameter("peppers");
        String onions=request.getParameter("onions");
        String mushrooms=request.getParameter("mushrooms");
        String jalepenos=request.getParameter("jalepenos");



        System.out.println("type of sauce: " + sauce);
        System.out.println("amount of sauce: "+ sauceAmount);
        System.out.println("amount of cheese: "+cheese);
        System.out.println("size and crust: "+sizeCrust);
        System.out.println("address: "+address);
        System.out.println("toppings: ");
        if (beef!=null){
            System.out.println(beef);
        }
        if (ham!=null){
            System.out.println(ham);
        }
        if (bacon!=null){
            System.out.println(bacon);
        }
        if (steak!=null){
            System.out.println(steak);
        }
        if (peppers!=null){
            System.out.println(peppers);
        }
        if (mushrooms!=null){
            System.out.println(mushrooms);
        }
        if (jalepenos!=null){
            System.out.println(jalepenos);
        }
        if (onions!=null){
            System.out.println(onions);
        }


        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }


}
