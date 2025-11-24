package Ejercicio6;

public class Float {
    double[] doubleNumbers = {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};

    public void getAverage(double[] numbersList) {
        double suma = 0;
        for (double item : numbersList) {
            suma += item;
        }
        System.out.printf("Suma total: %.1f%n", suma);
        System.out.printf("Promedio: %f", suma / numbersList.length);
    }

}
