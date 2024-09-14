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
import javax.servlet.http.HttpSession;
import logica.claseUsuario;

// Clase que maneja la lista de reservas
@WebServlet(name = "ListaReservasServlet", urlPatterns = {"/ListaReservasServlet"})
public class ListaReservasServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // Método para manejar solicitudes GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Crea una lista vacía de reservas
        List<claseUsuario> listaReservas = new ArrayList<>();
        
        // Simula una lista de base de datos
        listaReservas.add(new claseUsuario(1, "Sergio Lopez", "12/09/24", "Oficina #2", "2"));
        listaReservas.add(new claseUsuario(2, "Cristian Vargas", "13/09/24", "Sala de descanso #1", "1"));
        listaReservas.add(new claseUsuario(3, "Andrea Castro", "14/09/24", "Sala reuniones #4", "3"));
        
        // Obtiene la sesión del usuario
        HttpSession misesion = request.getSession();
        
        // Almacena la lista de reservas en la sesión
        misesion.setAttribute("listaReservas", listaReservas);
        
        // Redirige a la página de mostrar reservas
        response.sendRedirect("mostrarReservas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}