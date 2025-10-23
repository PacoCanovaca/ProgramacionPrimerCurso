import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio10 {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el salario por hora:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Introduce las horas trabajadas:");
        int workedHours = scanner.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false):");
        boolean workExtraHours = scanner.nextBoolean();
        int normalHours;
        int extraHours;
        if (workedHours > 40) {
            extraHours = workedHours - 40;
            normalHours = workedHours - extraHours;
        } else {
            extraHours = 0;
            normalHours = workedHours;
        }
        boolean appliedExtraHours = workedHours > 40 && workExtraHours;
        double normalHoursSalary = normalHours * hourlyRate;
        double extraHoursSalary = extraHours * getExtraHoursRate(hourlyRate);
        double totalSalary = normalHoursSalary + extraHoursSalary;
        System.out.println("Horas normales: " + normalHours);
        System.out.println("Horas extra: " + extraHours);
        System.out.println("¿Trabajaste más de 40 horas?: " + (workedHours > 40));
        System.out.println("¿Tienes derecho a horas extra?: " + workExtraHours);
        System.out.println("¿Se aplican horas extra?: " + appliedExtraHours);
        System.out.printf("Salario por horas normales: %.2f€%n", normalHoursSalary);
        System.out.printf("Salario por horas extra: %.2f€%n", extraHoursSalary);
        System.out.printf("Salario total: %.2f€%n", totalSalary);

    }

    public static double getExtraHoursRate(double rate) {
        return rate*2;
    }

}
