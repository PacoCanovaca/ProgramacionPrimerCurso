package Ejercicio4;

import java.util.Scanner;

public class Search {
    int[][] matrix = {{12, 45, 23, 67, 89}, {34, 56, 78, 90, 11}, {22, 33, 44, 55, 66}};

    private void printMatrix(int[][] matrixToPrint) {
        System.out.println("Matriz:");
        for (int[] row : matrixToPrint) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void searchNum(int[][] matrixToSearch) {
        printMatrix(matrixToSearch);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el número a buscar: ");
        int number = scanner.nextInt();
        for (int i = 0; i < matrixToSearch.length; i++) {
            for (int j = 0; j < matrixToSearch[i].length; j++) {
                if (matrixToSearch[i][j] == number) {
                    System.out.printf("El número %d se encuentra en la posición [%d][%d]", number, i, j);
                    return;
                }
            }
        }
        System.out.printf("El número %d no se encuentra en la matriz", number);
    }

}
