<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- Configura el tipo de contenido y codificación de la página -->
<!DOCTYPE html> <!-- Declaración del tipo de documento HTML -->
<html> <!-- Elemento raíz del documento HTML -->
    <head> <!-- Sección de metadatos del documento -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <!-- Configura el tipo de contenido y codificación de la página -->
        <title>Reservas</title> <!-- Título de la página -->
        <link rel="stylesheet" href="css/style_index.css"> <!-- Enlaza el archivo de estilos CSS -->
    </head>
    <body> <!-- Sección de contenido del documento -->
        <header> <!-- Sección de encabezado -->
            <h1 class="title">Reserva tu espacio de coworking</h1> <!-- Título de la sección -->
        </header>
        <main> <!-- Sección principal del contenido -->
            <section class="form-section"> <!-- Sección del formulario -->      
                <form action="reservaServlet" method="POST"><!-- Formulario que envía datos a reservaServlet -->
                    <div class="form-group"> <!-- Grupo de campos del formulario -->
                        <label for="nombre">Nombre:</label> <!-- Etiqueta del campo de nombre -->
                        <input type="text" id="nombre" name="nombre" class="form-control"> <!-- Campo de texto para ingresar el nombre -->
                    </div>
                    <div class="form-group">
                        <label for="fecha">Fecha:</label>
                        <input type="date" id="fecha" name="fecha" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="espacioTrabajo">Espacio de trabajo:</label>
                        <input type="text" id="espacioTrabajo" name="espacioTrabajo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="duracion">Duración (En horas):</label>
                        <input type="text" id="duracion" name="duracion" class="form-control">
                    </div>
                    <button type="submit" class="btn-submit">Enviar</button> <!-- Botón para enviar el formulario -->
                </form>

            </section>
            <section class="list-section"> <!-- Sección del formulario -->  
                <h1 class="title">Ver lista de reservas</h1> <!-- Titulo para lista de reservas --> 
                <p>Click en el siguiente botón</p> <!-- Parrafo para indicar el pasa a seguir --> 
                <form action="ListaReservasServlet" method="GET"> <!-- Formulario digiendo al servlet con metodo get --> 
                    <button type="submit" class="btn-submit">Mostrar datos</button> <!-- boton para subir la informacion con el texto mostrar datos --> 
                </form>
            </section>
        </main>
    </body>
</html>