package Ejercicio4;

import Ejercicio4.model.Circulo;
import Ejercicio4.model.Cuadrado;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);

        circulo.mostrarDatos();
        circulo.calcularArea();

        cuadrado.mostrarDatos();
        cuadrado.calcularArea();

    }
}
