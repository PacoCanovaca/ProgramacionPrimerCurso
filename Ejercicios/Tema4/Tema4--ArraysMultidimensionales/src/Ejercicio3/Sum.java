package Ejercicio3;

public class Sum {
    int[][] matrix = new int[4][4];

    public void generateMatrix(int[][] emptyMatrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < emptyMatrix.length; i++) {
            for (int j = 0; j < emptyMatrix[i].length; j++) {
                emptyMatrix[i][j] = (int) ((Math.random() * 16) + 1);
                System.out.print(emptyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumElements(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }

}
