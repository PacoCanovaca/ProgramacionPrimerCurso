package Ejercicio5;

public class Count {
    int[] intNumbers = new int[10];

    public void assignValues(int[] numbersList) {
        System.out.println("Array:");
        for (int i = 0; i < numbersList.length; i++) {
            numbersList[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", numbersList[i]);
        }
    }

    public void countOver50(int[] numbersList) {
        int count = 0;
        for (int item : numbersList) {
            if (item > 50) {
                count++;
            }
        }
        System.out.printf("%nCantidad de números mayores que 50: %d", count);
    }

}
