package Ejercicio9;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (Math.pow(altura, 2));
        String clasificacion = "Desconocida";

        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            clasificacion = "Normal";
        } else if (imc >= 25 && imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }

        System.out.printf("Tu IMC es %.1f y tu clasificación es %s", imc, clasificacion.toLowerCase());

        scanner.close();
    }
}
