package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de bebidas (entre 0 y 20):");
        int drinks = scanner.nextInt();
        System.out.println("Número de bocadillos (entre 0 y 20):");
        int sandwiches = scanner.nextInt();
        System.out.println("Precio de cada bebida (entre 0,00 y 3,00):");
        double drinkPrice = scanner.nextDouble();
        System.out.println("Precio de cada bocadillo (entre 0,00 y 5,00):");
        double sandwichPrice = scanner.nextDouble();
        System.out.println("Número de alumnos (entre 1 y 10):");
        int students = scanner.nextInt();

        Calculator operaciones = new Calculator();
        double drinksTotal = operaciones.productPrice(drinks, drinkPrice);
        double sandwichesTotal = operaciones.productPrice(sandwiches, sandwichPrice);
        double totalPrice = drinksTotal + sandwichesTotal;
        double pricePerStudent = operaciones.pricePerPerson(totalPrice, students);

        System.out.printf("\nSubtotal bebidas: %.2f€%n", drinksTotal);
        System.out.printf("Subtotal bocadillos: %.2f€%n", sandwichesTotal);
        System.out.printf("Total de la compra: %.2f€%n", totalPrice);
        System.out.printf("Cantidad por alumno: %.2f€%n", pricePerStudent);


        scanner.close();
    }

}
