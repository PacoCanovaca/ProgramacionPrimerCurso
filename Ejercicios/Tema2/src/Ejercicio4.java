import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int userNumber = scanner.nextInt();
        System.out.println("El número " + userNumber + " es " + oddOrEven(userNumber));
    }

    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }

}
