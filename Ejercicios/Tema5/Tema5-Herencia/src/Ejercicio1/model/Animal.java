package Ejercicio1.model;

public abstract class Animal {

    private String nombre;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.printf("Animal: %s, %d años%n", nombre, edad);
    }

    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
