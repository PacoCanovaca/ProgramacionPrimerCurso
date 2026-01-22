package Ejercicio4.model;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Círculo con radio %.1f%n", radio);
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (radio * radio);
        System.out.printf("Área: %.2f%n%n", area);
    }
}
