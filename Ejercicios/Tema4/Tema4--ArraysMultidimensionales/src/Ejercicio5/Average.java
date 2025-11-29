package Ejercicio5;

public class Average {
    double[][] floatMatrix = {{5.5, 7.2, 6.8}, {8.1, 9.3, 7.5}, {4.2, 5.6, 6.1}, {7.8, 8.9, 9.2}};

    private void printMatrix(double[][] matrixToPrint) {
        System.out.println("Matriz:");
        for (double[] row : matrixToPrint) {
            for (double number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void getRowsAverage(double[][] matrix) {
        printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            double total = 0;
            for (double item : matrix[i]) {
                total += item;
            }
            double average = total / matrix[i].length;
            System.out.printf("%nPromedio de la fila %d: %.2f", i, average);
        }
    }

}
