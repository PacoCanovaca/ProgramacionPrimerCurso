package Ejercicio6;

public class Column {

    public int[][] createMatrix() {
        int[][] matrix = new int[3][4];
        System.out.println("Matriz:");
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) ((Math.random() * 50) + 1);
                System.out.print(row[i] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public void highestNumberEachColumn(int[][] matrix) {
        int length = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            length ++;
        }
        int[] highestNumbers = new int[length];
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] > highestNumbers[i]) {
                    highestNumbers[i] = row[i];
                }
            }
        }
        for (int i = 0; i < highestNumbers.length; i++) {
            System.out.printf("%nMayor de columna %d: %d", i, highestNumbers[i]);
        }
    }

}
