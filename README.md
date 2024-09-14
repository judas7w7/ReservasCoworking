# ReservasCoworking

# Descripción
  Este archivo contiene instrucciones para configurar el entorno de desarrollo para un proyecto Java web utilizando XAMPP. Asegúrate de seguir cada paso cuidadosamente para asegurar que todo esté configurado        correctamente.

# Requisitos
  JDK: Instalar la versión 19 o superior.
  Apache Tomcat: Necesitarás Apache Tomcat como servidor de aplicaciones.
  XAMPP: Incluye Apache y MySQL, necesarios para crear la base de datos.
  MySQL: Versión 8.0.17.
  Dependencia: Asegúrate de agregar la dependencia de MySQL en tu proyecto Java.
  Configuración Tomcat: Agrega la siguiente configuración en el archivo tomcat-users.xml para el usuario tomcat con la contraseña jimmy:
  Copiar código
  <role rolename="manager-gui"/>
  <user password="jimmy" roles="manager-gui, manager-script,admin" username="tomcat"/>
  <user password="tomcat" roles="manager-script,admin" username="jimmy"/>

# Instalación

1) XAMPP
Descarga XAMPP desde el sitio oficial: XAMPP Downloads.
Sigue las instrucciones del instalador para instalar XAMPP en tu sistema.
Una vez instalado, inicia los servicios de Apache y MySQL desde el panel de control de XAMPP.

2) Instalar JDK
Descarga el JDK desde el sitio oficial de Oracle.
Sigue las instrucciones del instalador para instalar el JDK en tu sistema (no olvides configurar las variables JAVA_HOME y el PATH).

3) Configurar Apache Tomcat
Descarga Apache Tomcat desde el sitio oficial: Apache Tomcat Downloads.
Extrae el archivo descargado a un directorio de tu elección (por ejemplo, C:\apache-tomcat-9.x).

4) MySql
Descarga el MySQL Connector mysql-connector-java-8.0.17.
Realiza la configuración del servidor de bases de datos en tu proyecto Java.
Configurar la Conexión a la Base de Datos

Accede a phpMyAdmin desde http://localhost/phpmyadmin.
Crea una nueva base de datos llamada reservas.
Configura tu archivo de conexión de base de datos en el proyecto Java (normalmente en web.xml o en un archivo de configuración de tu aplicación). Asegúrate de usar las credenciales y el nombre de la base de datos correctos.

# Iniciar el Servidor y Probar

Asegúrate de que Apache Tomcat esté corriendo.
Abre tu navegador y visita http://localhost:8080/ProyectoReservaCoworking para verificar que tu aplicación se está ejecutando correctamente.

# Solución de Problemas
Problema: La aplicación no se despliega en Tomcat.
Solución: Verifica el archivo server.xml en el directorio conf de Tomcat y asegúrate de que no haya conflictos de puertos. Revisa los archivos de registro (logs) para errores específicos.

Problema: No se puede conectar a la base de datos.
Solución: Revisa la configuración en tu archivo de conexión de base de datos. Asegúrate de que los detalles (nombre de la base de datos, usuario, contraseña) sean correctos y que el servidor MySQL esté en funcionamiento.
