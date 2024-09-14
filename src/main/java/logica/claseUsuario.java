package logica;

public class claseUsuario {

    // Atributos de la clase
    int id;
    private String nombre;
    private String fecha;
    private String espacioTrabajo;
    private String duracion;

    // Constructor vacío
    public claseUsuario() {
    }

    // Constructor con parámetros
    public claseUsuario(int id, String nombre, String fecha, String espacioTrabajo, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.espacioTrabajo = espacioTrabajo;
        this.duracion = duracion;
    }

    // Métodos getters y setters para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspacioTrabajo() {
        return espacioTrabajo;
    }

    public void setEspacioTrabajo(String espacioTrabajo) {
        this.espacioTrabajo = espacioTrabajo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

}
