package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en euros:");
        double euros = scanner.nextDouble();
        System.out.println("¿A qué moneda quieres hacer la conversión? (introduce el número correspondiente):\n1. Dólar\n2. Libra\n3. Yen\n4. Peso");
        int moneda = scanner.nextInt();

        Conversion conversion = new Conversion();
        conversion.hacerConversion(euros, moneda);

        scanner.close();

    }
}
