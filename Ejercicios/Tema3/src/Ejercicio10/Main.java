package Ejercicio10;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu altura en cm:");
        int heightCm = scanner.nextInt();
        if (heightCm < 120) {
            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm");
        } else if (heightCm >= 120 && heightCm <= 200) {
            System.out.println("Puedes subir a la atracción.");
        } else {
            System.out.println("No puedes subir a la atracción. Altura máxima: 200 cm");
        }

        scanner.close();
    }

}
