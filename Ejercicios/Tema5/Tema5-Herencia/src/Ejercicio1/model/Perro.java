package Ejercicio1.model;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.printf("%s hace: Guau Guau%n%n", super.getNombre());
    }
}
