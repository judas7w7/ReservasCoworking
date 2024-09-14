package com.mycompany.reservacoworking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.claseUsuario;

@WebServlet(name = "EliminarReservaServlet", urlPatterns = {"/EliminarReservaServlet"})
public class EliminarReservaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // Método para manejar solicitudes POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtiene la lista de reservas de la sesión
        List<claseUsuario> listaReservas = (List) request.getSession().getAttribute("listaReservas");
        // Obtiene el índice de la reserva desde el formulario
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        // Elimina la reserva de la lista haciendo comparaciones de Id
        for (claseUsuario usu : listaReservas) {
            if (usu.getId() == idReserva) {
                listaReservas.remove(usu);
                break;
            }
        }
        // Redirige a la página de lista de reservas
        request.getSession().setAttribute("listaReservas", listaReservas);
        response.sendRedirect("mostrarReservas.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}