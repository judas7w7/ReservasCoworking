<%@page import="java.util.List"%> <!-- Importa la clase List de Java -->
<%@page import="logica.claseUsuario"%> <!-- Importa la clase claseUsuario de la lógica del negocio -->
<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- Configura el tipo de contenido y codificación de la página -->
<!DOCTYPE html> <!-- Declaración del tipo de documento HTML -->
<html> <!-- Elemento raíz del documento HTML -->
    <head> <!-- Sección de metadatos del documento -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <!-- Configura el tipo de contenido y codificación de la página -->
        <title>Mostrar Usuarios</title> <!-- Título de la página -->
        <link rel="stylesheet" href="css/style_mostrarReserva.css"> <!-- Enlaza el archivo de estilos CSS -->
    </head>
    <body> <!-- Sección de contenido del documento -->
        <header> <!-- Sección de encabezado -->
            <h1 class="title">Lista de reservas</h1> <!-- Título de la sección -->
        </header>
        <main> <!-- Sección principal del contenido -->
            <%
                List<claseUsuario> listaReservas = (List) request.getSession().getAttribute("listaReservas"); //Obtiene la lista de reservas de la sesión
                int cont = 1; // Inicializa un contador
                for (claseUsuario usu : listaReservas) { //Itera sobre la lista de reservas
            %>

             <section class="reservation-section"> <!-- Sección de reserva -->
                <p><b> N° Reserva <%=usu.getId()%> </b></p> <!-- Muestra el número de reserva -->
                <p>Nombre: <%=usu.getNombre()%> </p> <!-- Muestra el nombre del usuario -->
                <p>Fecha: <%=usu.getFecha()%> </p> <!-- Muestra el fecha asignada -->
                <p>Espacio de trabajo: <%=usu.getEspacioTrabajo()%> </p> <!-- Muestra el espacio de trabajo -->
                <p>Duración: <%=usu.getDuracion()%> </p> <!-- Muestra la duración para la reserva -->

                <form action="EliminarReservaServlet" method="POST" name="eliminarReserva"> <!-- Formulario para eliminar la reserva -->
                    <input type="hidden" name="idReserva" value="<%=usu.getId()%>"> <!-- Campo oculto con el ID de la reserva -->
                    <button type="submit" class="btn-submit">Eliminar reserva</button> <!-- Botón para eliminar la reserva -->
                </form>
            </section>

            <%
                cont = cont + 1; //Incrementa el contador 
            }
            %>

            <section class="button-section"> <!-- Sección de botones -->
                <h1>Volver al menu</h1> <!-- Título de la sección -->
                <p>click en el siguiente botón</p>
                <form action="index.jsp" method="GET"> <!-- Formulario para volver al menú principal -->
                    <button type="submit" class="btn-submit">Volver al Menú</button> <!-- Botón para volver al menú -->
                </form>
            </section>
        </main>
    </body>
</html>