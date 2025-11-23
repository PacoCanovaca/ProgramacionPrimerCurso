package Ejercicio10;

import java.util.Scanner;

public class Cashier {
    public void doOperations(int initialBalance) {
        Scanner scanner = new Scanner(System.in);
        int balance = initialBalance;
        int option;
        do {
            System.out.print("--- MENÚ ---\n1. Consultar saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir\nElige una opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> System.out.printf("Tu saldo actual es: %d€%n%n", balance);
                case 2 -> {
                    System.out.print("¿Cuánto deseas retirar?: ");
                    int moneyRetired = scanner.nextInt();
                    while (moneyRetired > balance || moneyRetired <= 0) {
                        if (moneyRetired > balance) {
                            System.out.printf("Fondos insuficientes. Tu saldo es %d€%n", balance);
                        } else {
                            System.out.println("La cantidad introducida debe ser positiva (mayor que 0)");
                        }
                        System.out.print("¿Cuánto deseas retirar?: ");
                        moneyRetired = scanner.nextInt();
                    }
                    balance -= moneyRetired;
                    System.out.printf("Retiro exitoso. Has retirado %d€%nNuevo saldo: %d€%n%n", moneyRetired, balance);
                }
                case 3 -> {
                    System.out.print("¿Cuánto deseas depositar?: ");
                    int moneyAdded = scanner.nextInt();
                    while (moneyAdded <= 0) {
                        System.out.print("Debes depositar una cantidad positiva (mayor a 0)\n¿Cuánto deseas depositar?: ");
                        moneyAdded = scanner.nextInt();
                    }
                    balance += moneyAdded;
                    System.out.printf("Depósito exitoso. Has depositado %d€%nNuevo saldo: %d€%n%n", moneyAdded, balance);
                }
                case 4 -> System.out.printf("Gracias por usar el cajero. Tu saldo final es %d€%n¡Hasta luego!", balance);
                default -> System.out.println("La opción indicada no está entre las disponibles\n");
            }
        } while (option != 4);
        scanner.close();
    }
}
