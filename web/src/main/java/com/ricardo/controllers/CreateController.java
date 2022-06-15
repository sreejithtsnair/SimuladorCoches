package com.ricardo.controllers;

import com.ricardo.models.coche.Coche;
import com.ricardo.persistencia.AlmacenCoches;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/create")
public class CreateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session.getAttribute("is_logged") != null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/create.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session.getAttribute("is_logged") != null) {

            String marca = req.getParameter("marca");
            String tipo = req.getParameter("tipo");
            String velocidad = req.getParameter("velocidad");
            int velocidad_int = 0;
            String power = req.getParameter("power");
            int power_int = 0;

            try {
                velocidad_int = Integer.parseInt(velocidad);
                power_int = Integer.parseInt(power);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Coche newCoche = new Coche(marca, tipo, velocidad_int, power_int);

            if (newCoche.validate()) {
                AlmacenCoches.addCoche(newCoche);
                resp.sendRedirect(req.getContextPath() + "/lista");
            } else {
                req.setAttribute("error", "Coche imcompleto!!");
                req.setAttribute("datos", newCoche);
                doGet(req, resp);
            }
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }

    }
}
