package Ejercicio2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número objetivo:");
        int number = scanner.nextInt();

        Search search = new Search();
        int[] newArray = search.generateArray();
        System.out.println("Elementos del array: ");
        for (int item : newArray) {
            System.out.println(item);
        }
        System.out.printf("Índice del número objetivo en el array: %d", search.searchNumber(newArray, number));

        scanner.close();
    }
}
