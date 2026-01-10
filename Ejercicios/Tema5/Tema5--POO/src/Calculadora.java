public class Calculadora {

    public static void sumar(int num1, int num2) {
        int suma = num1 + num2;
        System.out.printf("Suma: %d + %d = %d%n", num1, num2, suma);
    }

    public static void restar(int num1, int num2) {
        int resta = num1 - num2;
        System.out.printf("Resta: %d - %d = %d%n", num1, num2, resta);
    }

    public static void multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        System.out.printf("Multiplicación: %d * %d = %d%n", num1, num2, multiplicacion);
    }

    public static void dividir(int num1, int num2) {
        double division = (double) num1 / num2;
        System.out.printf("División: %d / %d = %.1f%n", num1, num2, division);
    }

    public static void elevarAPotencia(int base, int exponente) {
        int potencia = 1;
        if (exponente != 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        System.out.printf("Potencia: %d ^ %d = %d%n%n", base, exponente, potencia);
    }
}
