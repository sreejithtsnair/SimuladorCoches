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
import java.util.List;

@WebServlet("/lista")
public class ListaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session.getAttribute("is_logged") != null) {
            //obtenga de pesistencia lista caches
            List<Coche> laLista = AlmacenCoches.getCoches();

            //pasar al jsp para que lo pinte
            req.setAttribute("listaCoche", laLista);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/lista.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }

    }

}
