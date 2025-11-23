package Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();

        Sumatorio sumatorio = new Sumatorio();
        System.out.printf("La suma de números del 1 al %d es: %d", num, sumatorio.obtenerSumatorio(num));

        scanner.close();

    }

}
