package Ejercicio3;

public class Pair {

    public int[] generateArray() {
        int length = (int) ((Math.random() * 5) + 5);
        int[] numbers = new int[length];
        System.out.print("\nGenerando array: ");
        for (int i = 0; i < numbers.length; i++) {
            int number = (int) ((Math.random() * 20) + 1);
            numbers[i] = number;
            System.out.print(number + " ");
        }
        return numbers;
    }

    public void showEven(int[] numbers) {
        System.out.print("\nMostrando números pares: ");
        for (int item : numbers) {
            if (item % 2 == 1) {
                continue;
            } else {
                System.out.print(item + " ");
            }
        }
    }
}
