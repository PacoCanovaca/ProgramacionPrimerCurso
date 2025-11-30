package Ejercicio9;

public class Multiplication {

    public void generateMultiplicationTable() {
        int[][] multiplicationTable = new int[10][10];
        System.out.println("Tabla de multiplicar (10x10):");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
