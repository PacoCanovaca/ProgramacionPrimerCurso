package Ejercicio5;

import Ejercicio5.model.Desarrollador;
import Ejercicio5.model.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ana García", 40000, 10000);
        Desarrollador desarrollador = new Desarrollador("Luis Martínez", 35000, "Java");

        gerente.mostrarDatos("Gerente");
        desarrollador.mostrarDatos("Desarrollador");

    }
}
