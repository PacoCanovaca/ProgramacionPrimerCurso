package Ejercicio2;

import java.util.Scanner;

public class ManualMatrix {
    int[][] matrix = new int[2][4];

    public void introduceElements(int[][] emptyMatrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < emptyMatrix.length; i++) {
            for (int j = 0; j < emptyMatrix[i].length; j++) {
                System.out.printf("Introduce el valor para posición [%d][%d]: ", i, j);
                int value = scanner.nextInt();
                emptyMatrix[i][j] = value;
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        System.out.println("Matrix resultante:");
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
