package Ejercicio13;

import java.util.Scanner;
import Ejercicio13.model.Calculator;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        System.out.println("Introduce el día de la semana (1-7):");
        int dayNumber = scanner.nextInt();
        String day = calculator.dayOfTheWeek(dayNumber);

        System.out.println("Edad: " + age + " años.");
        System.out.println("Día de la semana: " + day);
        System.out.printf("Precio de la entrada (con descuentos aplicados): %.2f€%n", calculator.finalPrice(age, dayNumber));



        scanner.close();

    }

}
