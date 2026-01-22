package Ejercicio2.model;

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Coche: %s %s, %d puertas%n", super.getMarca(), super.getModelo(), numeroPuertas);
    }

}
