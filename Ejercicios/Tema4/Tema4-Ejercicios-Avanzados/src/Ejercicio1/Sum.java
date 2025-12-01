package Ejercicio1;

import java.util.Scanner;

public class Sum {

    private int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) ((Math.random() * 50) + 1);
                System.out.print(row[i] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    private int[][] addTwoArrays(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        return sum;
    }

    public void printSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de filas:");
        int rows = scanner.nextInt();
        System.out.println("Introduce el número de columnas:");
        int columns = scanner.nextInt();
        System.out.println("Matriz 1:");
        int[][] firstMatrix = createMatrix(rows, columns);
        System.out.println("Matriz 2:");
        int[][] secondMatrix = createMatrix(rows, columns);
        System.out.println("Suma de matrices:");
        addTwoArrays(firstMatrix, secondMatrix, rows, columns);
    }

}
