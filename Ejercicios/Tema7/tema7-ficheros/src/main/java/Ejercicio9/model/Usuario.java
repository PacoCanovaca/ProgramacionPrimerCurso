package Ejercicio9.model;

public class Usuario {

    private final String nombre, apellido, dni;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void mostrarDatos() {
        System.out.printf("- %s %s. DNI: %s%n", nombre, apellido, dni);
    }

}
