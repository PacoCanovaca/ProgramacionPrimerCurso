package Ejercicio2;

import java.util.Scanner;

public class Menu {

    private int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }
        return array;
    }

    private void printArray(int[] array) {
        System.out.println("Array:");
        for (int item : array) {
            System.out.print(item + "\t");
        }
        System.out.println("\n\n");
    }

    private void moveLeft(int[] array, int position) {
        int element = array[position];
        int leftElement = array[position-1];
        array[position] = leftElement;
        array[position-1] = element;
        System.out.println("\n\n");
    }

    private void moveRight(int[] array, int position) {
        int element = array[position];
        int rightElement = array[position+1];
        array[position] = rightElement;
        array[position+1] = element;
        System.out.println("\n\n");
    }

    private void reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length; i > 0 ; i--) {
            int reverseIndex = reverseArray.length - i;
            reverseArray[reverseIndex] = array[i-1];
        }
        for (int i = 0; i < reverseArray.length; i++) {
            array[i] = reverseArray[i];
        }
        System.out.println("\n\n");
    }

    private boolean manageMenu(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- MENU ---\n1. Imprimir array\n2. Mover elemento a la izquierda\n3. Mover elemento a la derecha\n4. Invertir\n5. Salir");
        System.out.print("Introduce la opción: ");
        int option = scanner.nextInt();
        System.out.printf("Has elegido la opción %d%n", option);
        switch (option) {
            case 1 -> {
                System.out.println("Imprimiendo array...");
                printArray(array);
            }
            case 2 -> {
                System.out.print("Introduce la posición del elemento que quieres mover a la izquierda (mínimo 1, máximo 9): ");
                int position = scanner.nextInt();
                moveLeft(array, position);
            }
            case 3 -> {
                System.out.print("Introduce la posición del elemento que quieres mover a la derecha (mínimo 0, máximo 8): ");
                int position = scanner.nextInt();
                moveRight(array, position);
            }
            case 4 -> {
                System.out.println("Invirtiendo array...");
                reverseArray(array);
                System.out.println("Array invertido");
            }
            case 5 -> {
                System.out.println("Saliendo... te dejo el array impreso una última vez:");
                printArray(array);
                return false;
            }
        }
        return true;
    }

    public void generateMenu() {
        int[] array = createArray();
        boolean continueLoop;
        do {
            continueLoop = manageMenu(array);
        } while (continueLoop);
    }

}
