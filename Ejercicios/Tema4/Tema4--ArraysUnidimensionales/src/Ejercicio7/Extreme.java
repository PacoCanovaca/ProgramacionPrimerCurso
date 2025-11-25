package Ejercicio7;

public class Extreme {
    int[] numbers = {15, 8, 23, 4, 19, 12};
    public void findHighLow(int[] numbersList) {
        int highest = numbersList[0];
        int lowest = numbersList[0];
        for (int number : numbersList) {
            if (number > highest) {
                highest = number;
            } else if (number < lowest) {
                lowest = number;
            }
        }
        System.out.printf("El número mayor es: %d%n", highest);
        System.out.printf("El número menor es: %d%n", lowest);
    }
}
