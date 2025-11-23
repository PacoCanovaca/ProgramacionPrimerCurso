package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.print("Introduce un número (0 o negativo para terminar): ");
        int sumando = scanner.nextInt();

        while (sumando > 0) {
            suma += sumando;
            System.out.println("Suma actual: " + suma);
            System.out.print("Introduce un número (0 o negativo para terminar): ");
            sumando = scanner.nextInt();
        }

        System.out.println("Programa terminado. Suma total: " + suma);



        scanner.close();

    }
}
