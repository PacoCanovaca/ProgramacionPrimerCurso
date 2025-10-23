import java.util.Scanner;

public class Ejercicio9 {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        double firstExam = scanner.nextDouble();
        System.out.println("Introduce la nota del segundo examen:");
        double secondExam = scanner.nextDouble();
        System.out.println("Introduce la nota del tercer examen:");
        double thirdExam = scanner.nextDouble();
        System.out.println("Nota media: " + getAverage(firstExam, secondExam, thirdExam));
        boolean pass = getAverage(firstExam, secondExam, thirdExam) >= 5;
        System.out.println("¿Ha aprobado?: " + pass);
        boolean notable = getAverage(firstExam, secondExam, thirdExam) >= 7;
        System.out.println("¿Tiene notable?: " + notable);
        boolean sobresaliente = getAverage(firstExam, secondExam, thirdExam) >= 9;
        System.out.println("¿Tiene sobresaliente?: " + sobresaliente);
    }

    public static double getAverage(double first, double second, double third) {
        return (first + second + third) / 3;
    }

}
