package Ejercicio1.model;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.printf("%s hace: Miau Miau%n%n", super.getNombre());
    }
}
