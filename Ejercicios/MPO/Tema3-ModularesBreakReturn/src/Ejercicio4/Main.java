package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Mark mark = new Mark();
        double[] marksList = {7, 5, 10, 14, 8, -5};
        System.out.printf("La nota media de las notas válidas es: %.2f%n", mark.getAverage(marksList));
        double[] marksList2 = {7, 5, 10, 14, 8, -5, 10.00000034, -0.00000000000001};
        System.out.printf("La nota media de las notas válidas es: %.2f%n", mark.getAverage(marksList2));
    }
}
