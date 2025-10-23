import java.util.Scanner;

public class Ejercicio8 {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int secondNumber = scanner.nextInt();
        System.out.println("Introduce el tercer número:");
        int thirdNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber + thirdNumber;
        double average = (double) addition / 3;
        double result = (double) (firstNumber * secondNumber) / thirdNumber;
        System.out.println("Suma de los tres números: " + addition);
        System.out.println("Promedio: " + average);
        System.out.println("Resultado de (número1 * número2) / número3: " + result);

    }

}
