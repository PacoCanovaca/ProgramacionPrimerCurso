import model.Ejercicios;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();

        /* Ejercicio 1
        boolean completado = false;
        do {
            try{
                System.out.print("Introduce el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = scanner.nextInt();
                int resultado = ejercicios.dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
                completado = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero. Inténtalo de nuevo.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error y no se ha podido completar la operación. Inténtalo de nuevo.");
                scanner = new Scanner(System.in);
            }
        } while (!completado);
         */

        /* Ejercicio 2
        int[] numeros = new int[]{10, 20, 30, 40, 50};
        boolean encontrado = false;
        do {
            try {
                System.out.println("Array: [10, 20, 30, 40, 50]");
                System.out.print("Introduce la posición (0-4): ");
                int posicion = scanner.nextInt();
                System.out.printf("Elemento en posición %d: %d", posicion, numeros[posicion]);
                encontrado = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Posición fuera de los límites del array. Inténtalo de nuevo.\n");
                scanner = new Scanner(System.in);
            } catch (Exception e) {
                System.out.println("Error genérico. Inténtalo de nuevo.\n");
                scanner = new Scanner(System.in);
            }
        } while (!encontrado);
         */

        /* Ejercicio 3
        boolean transformado = false;
        do {
            try {
                System.out.print("Introduce un número: ");
                String text = scanner.next();
                int num = ejercicios.transformarTextoANumero(text);
                System.out.printf("Has introducido el número %d%n", num);
                transformado = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Eso no es un número válido. Inténtalo de nuevo.\n");
                scanner = new Scanner(System.in);
            }
        } while (!transformado);
         */

    }
}
