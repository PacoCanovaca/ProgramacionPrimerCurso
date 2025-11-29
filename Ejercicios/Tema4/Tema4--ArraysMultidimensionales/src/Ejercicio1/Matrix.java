package Ejercicio1;

public class Matrix {

    int[][] matrixOrdered = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void printMatrix(int[][] matrix) {
        System.out.println("Matrix 3x3:");
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
