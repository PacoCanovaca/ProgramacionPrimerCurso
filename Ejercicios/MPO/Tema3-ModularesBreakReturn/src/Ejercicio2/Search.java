package Ejercicio2;

import java.util.Arrays;

public class Search {

    public int searchNumber(int[] numbers, int target) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            int item = numbers[i];
            if (target == item) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int[] generateArray() {
        int length = (int) ((Math.random() * 5) + 5);
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            int number = (int) ((Math.random() * 20) + 1);
            numbers[i] = number;
        }
        return numbers;
    }
}
