package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de la compra (entre 0,00 y 500,00):");
        double totalWithoutIva = scanner.nextDouble();
        System.out.println("IVA (entre 0 y 25):");
        int iva = scanner.nextInt();

        Calculator operaciones = new Calculator();
        double totalPrice = operaciones.totalPrice(totalWithoutIva, iva);
        double ivaCost = operaciones.ivaPrice(totalWithoutIva, iva);

        System.out.printf("\nCompra: %.2f€%n", totalPrice);
        System.out.printf("IVA: %.2f€%n", ivaCost);


        scanner.close();

    }

}
