package Ejercicio3;

import Ejercicio3.model.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante laura = new Estudiante("Laura", 20, 2);
        Estudiante carlos = new Estudiante("Carlos", 19, 1);

        laura.presentarse();
        carlos.presentarse();

    }
}
