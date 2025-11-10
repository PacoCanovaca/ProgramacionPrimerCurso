package Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();
        System.out.printf("Recorriendo números del 1 al %d...%n", num);

        ParOImpar parImpar = new ParOImpar();
        System.out.printf("Números pares encontrados: %d%nNúmeros impares encontrados: %d", parImpar.contarPares(num), parImpar.contarImpares(num));

        scanner.close();

    }

}
