import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();
        System.out.println("¿Tienes carnet de conducir? (true/false):");
        boolean haveDrivingLicense = scanner.nextBoolean();
        System.out.println("¿Eres mayor de 21?: " + isOlderThan21(age));
        System.out.println("¿Tienes carnet?: " + haveDrivingLicense);
        System.out.println("¿Puedes alquilar un coche?: " + canLoan(age, haveDrivingLicense));

    }

    public static boolean isOlderThan21(int age) {
        return age >= 21;
    }

    public static boolean canLoan(int age, boolean haveLicense) {
        return isOlderThan21(age) && haveLicense;
    }

}
