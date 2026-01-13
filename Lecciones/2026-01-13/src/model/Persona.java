package model;

public abstract class Persona {
    private String nombre, apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // TODO darle una vuelta de abstracción
    public void saludar() {
        System.out.println("Vamos a saludar");
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
