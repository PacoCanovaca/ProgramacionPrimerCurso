package Ejercicio9;

public class Factorial {

    public int getFactorial(int numero) {

        int factorial = 1;
        String message = "1";

        for (int i = 2; i <= numero; i++) {
            factorial *= i;
            message = i + " x " + message;
        }

        System.out.println(message);
        return factorial;

    }

}
