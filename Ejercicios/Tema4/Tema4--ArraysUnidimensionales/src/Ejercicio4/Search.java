package Ejercicio4;

import java.util.Scanner;

public class Search {
    int[] numbers = {5, 12, 8, 3, 15, 9, 6};

    public void searchNumber(int[] numbersList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número a buscar:");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numbersList.length; i++) {
            if (number == numbersList[i]) {
                System.out.printf("El número %d está en la posición %d", number, i);
                return;
            }
        }
        System.out.printf("El número %d no se encuentra en el array", number);

    }


}
