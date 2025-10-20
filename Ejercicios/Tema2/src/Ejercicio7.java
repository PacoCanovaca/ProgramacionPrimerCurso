import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("¿Eres estudiante? (true/false):");
        boolean isStudent = scanner.nextBoolean();
        boolean isUnder26 = edad < 26;
        boolean specialDiscount = isStudent && isUnder26;
        System.out.println("¿Eres menor de 26 años?: " + isUnder26);
        System.out.println("¿Eres estudiante?: " + isStudent);
        System.out.println("¿NO eres estudiante?: " + !isStudent);
        System.out.println("¿Tienes descuento joven?: " + isUnder26);
        System.out.println("¿Tienes descuento estudiante?: " + isStudent);
        System.out.println("¿Tienes descuento especial?: " + specialDiscount);

    }

}
