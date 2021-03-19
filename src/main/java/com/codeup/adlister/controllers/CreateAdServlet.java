package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.api.Session;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
passwords-exercise
        HttpSession session = request.getSession();
        if (session.getAttribute("user")==null){
            response.sendRedirect("/login");
            return;
        };

\        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
 passwords-exercise
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Ad ad = new Ad(
            user.getId(), // for now we'll hardcode the user id
        User user = (User) request.getSession().getAttribute("user");
        Ad ad = new Ad(
            user.getId(),
            request.getParameter("title"),
            request.getParameter("description")
        );
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
    }
}
