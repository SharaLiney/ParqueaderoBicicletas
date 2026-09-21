package edu.unilibre.datos;

public class Propietario {
    private String identificacion;
    private String nombre;

    public String obtenerIdentificacion() {
        return identificacion;
    }
    public String obtenerNombre() {
        return nombre;
    }

    public void modificarIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public Propietario (String identificacion, String nombre){
        this.identificacion=identificacion;
        this.nombre = nombre;
    }
}
