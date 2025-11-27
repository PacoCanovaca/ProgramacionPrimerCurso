package Ejercicio7;

public class Fibonacci {
    public void generateFibonacci(int limit) {
        int number = 0;
        int lastNumber = 0;
        int index = 0;
        while (true) {
            if (index == 0) {
                System.out.println(number);
                number = 1;
            } else {
                System.out.println(number);
                number = number + lastNumber;
                lastNumber = number - lastNumber;
            }
            index++;
            if (index == limit) {
                break;
            }
        }
    }
}
