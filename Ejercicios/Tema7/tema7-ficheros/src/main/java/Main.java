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

        /* Ejercicio 2
        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.next();
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = scanner.next();
        gestorFicheros.contarApariciones(path, palabra);
        */

        /* Ejercicio 3
        System.out.println("Introduce la ruta del archivo de origen: ");
        String pathOrigen = scanner.next();
        System.out.println("Introduce la ruta del archivo de destino: ");
        String pathDestino = scanner.next();
        gestorFicheros.copiarArchivo(pathOrigen, pathDestino);
         */

        /* Ejercicio 4
        System.out.println("Introduce la ruta del archivo: ");
        String path = scanner.next();
        gestorFicheros.obtenerInformacion(path);
         */

        /* Ejercicio 5
        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.next();
        gestorFicheros.contarLineas(path);
         */

        /* Ejercicio 6
        System.out.println("Introduce la ruta del archivo:");
        String path = scanner.next();
        gestorFicheros.escribirCsv(path);
        gestorFicheros.leerFichero(path);
         */

        /* Ejercicio 7
        System.out.println("Introduce la ruta del fichero:");
        String path = scanner.next();
        gestorFicheros.explorarDirectorio(path);
         */

        // El ejercicio 8 puedo hacerlo con un HashMap de palabras que incluya su frecuencia. Después, ordeno la lista de claves según los valores en orden descendente

        System.out.println("Introduce la ruta del archivo:");
        String path = scanner.next();
        gestorFicheros.contarPalabras(path);

    }

}
