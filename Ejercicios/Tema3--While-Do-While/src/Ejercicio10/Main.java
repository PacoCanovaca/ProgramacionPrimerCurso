package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        int initBalance = 1000;
        System.out.printf("--- CAJERO AUTOMÁTICO ---%nSaldo inicial: %d€%n%n", initBalance);
        Cashier cashier = new Cashier();
        cashier.doOperations(initBalance);
    }
}
