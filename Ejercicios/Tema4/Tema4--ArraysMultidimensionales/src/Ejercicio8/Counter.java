package Ejercicio8;

public class Counter {

    public int[][] createMatrix() {
        int[][] matrix = new int[4][5];
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

    public void countOddAndEven(int[][] matrix) {
        int oddCounter = 0;
        int evenCounter = 0;
        for (int[] row : matrix) {
            for (int item : row) {
                if (item % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }
            }
        }
        System.out.printf("%nNúmeros pares: %d", evenCounter);
        System.out.printf("%nNúmeros impares: %d", oddCounter);
    }

}
