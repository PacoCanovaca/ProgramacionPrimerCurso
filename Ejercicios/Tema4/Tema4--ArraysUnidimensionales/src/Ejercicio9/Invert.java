package Ejercicio9;

public class Invert {
    int[] numbers = {2, 4, 6, 8, 10, 12, 14};
    public void reverseNumbersList(int[] numbersList) {
        String originalArray = "";
        String reversedArray = "";
        for (int i = 0; i < numbersList.length; i++) {
            originalArray += numbersList[i] + " ";
        }
        for (int i = numbersList.length - 1; i >= 0; i--) {
            reversedArray += numbersList[i] + " ";
        }
        System.out.printf("Array original: [ %s]%n", originalArray);
        System.out.printf("Array invertido: [ %s]%n", reversedArray);
    }
}
