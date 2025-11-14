package Ejercicio7;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nivel");
        int puntuacion = scanner.nextInt();
        String level = "Desconocido";

        if (puntuacion >= 0 && puntuacion <= 100) {
            level = "Principiante";
        } else if (puntuacion > 100 && puntuacion <= 500) {
            level = "Intermedio";
        } else if (puntuacion > 500 && puntuacion <= 1000) {
            level = "Avanzado";
        } else if (puntuacion > 1000 && puntuacion <= 5000) {
            level = "Experto";
        } else if (puntuacion > 5000) {
            level = "Experto";
        }
        System.out.println("Nivel: " + level);

        scanner.close();

    }
}
