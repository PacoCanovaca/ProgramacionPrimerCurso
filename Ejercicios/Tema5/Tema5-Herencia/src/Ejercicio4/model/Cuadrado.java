package Ejercicio4.model;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Círculo con radio %.1f%n", lado);
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.printf("Área: %.2f%n%n", area);
    }
}
