package Ejercicio7;

public class Invert {

    public int[][] createMatrix() {
        int[][] matrix = new int[3][4];
        System.out.println("Matriz original (3x4):");
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) ((Math.random() * 20) + 1);
                System.out.print(row[i] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public void transposeMatrix(int[][] originalMatrix) {
        int rows = 0;
        int columns = 0;
        for (int[] row : originalMatrix) {
            rows++;
        }
        for (int i = 0; i < originalMatrix[0].length; i++) {
            columns++;
        }
        int[][] invertedMatrix = new int[columns][rows];
        System.out.printf("%nMatriz transpuesta (%dx%d):%n", columns, rows);
        for (int i = 0; i < invertedMatrix.length; i++) {
            for (int j = 0; j < invertedMatrix[0].length; j++) {
                invertedMatrix[i][j] = originalMatrix[j][i];
                System.out.print(invertedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
