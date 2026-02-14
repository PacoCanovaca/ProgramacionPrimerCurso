import java.util.Scanner;

public class Main {

    static void main() {

        GestorFicheros gestorFicheros = new GestorFicheros();
        Scanner scanner = new Scanner(System.in);

        /* Ejercicio 1
        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.next();
        gestorFicheros.leerFichero(path);
         */

        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.next();
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = scanner.next();
        gestorFicheros.contarApariciones(path, palabra);

    }

}
