package com.ricardo.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session.getAttribute("is_logged") == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/lista");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user_email = "r@r.com";
        String user_password = "xxx";

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (email != null && email.equals(user_email) && password != null && password.equals(user_password)) {
            HttpSession session = req.getSession();
            session.setAttribute("emil", user_email);
            session.setAttribute("is_logged", true);
            resp.sendRedirect(req.getContextPath() + "/lista");
        } else {
            req.setAttribute("error", "error");
            doGet(req, resp);
        }

    }

}
