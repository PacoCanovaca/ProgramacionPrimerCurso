package Ejercicio2;

import Ejercicio2.model.Coche;
import Ejercicio2.model.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo toyota = new Vehiculo("Toyota", "Corolla");
        Coche ford = new Coche("Ford", "Focus", 5);
        Coche seat = new Coche("Seat", "Ibiza", 3);

        toyota.mostrarDatos();
        ford.mostrarDatos();
        seat.mostrarDatos();

    }
}
