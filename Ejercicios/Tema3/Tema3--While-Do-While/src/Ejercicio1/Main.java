package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();
        System.out.println("Contando con while:");
        int counter = 1;

        while (counter <= 5) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter);
            counter++;
        }

        System.out.println("Fin del conteo");

        scanner.close();

    }
}
