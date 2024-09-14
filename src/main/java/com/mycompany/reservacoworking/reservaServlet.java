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

// Clase que maneja la reserva de espacios de trabajo
@WebServlet(name = "reservaServlet", urlPatterns = {"/reservaServlet"})
public class reservaServlet extends HttpServlet {

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
        // Obtiene los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String espacioTrabajo = request.getParameter("espacioTrabajo");
        String duracion = request.getParameter("duracion");

        // Verifica que ninguno de los campos esté vacío
        if (nombre.isEmpty() || fecha.isEmpty() || espacioTrabajo.isEmpty() || duracion.isEmpty()) {
            // Si algún campo está vacío, muestra un mensaje de error
            String mensaje = "Error, todos los campos tienen que ser llenados.";
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('" + mensaje + "'); window.location.href='index.jsp';</script>");
        } else {
            // Si todos los campos están llenos, procesa la reserva
            String mensaje = "Reserva confirmada para " + nombre + " el " + fecha + " en " + espacioTrabajo + " por " + duracion + " horas.";
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('" + mensaje + "'); window.location.href='index.jsp';</script>");
        }
    }

    // Método para obtener información del servlet
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}