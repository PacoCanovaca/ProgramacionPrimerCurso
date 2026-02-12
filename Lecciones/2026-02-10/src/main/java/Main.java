import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        // operacionesFicheros.leerDatosFichero();
        // operacionesFicheros.leerHijos("src/main/java/ressources");
        /* try {
            operacionesFicheros.crearFicheros("src/main/java/ressources");
        } catch (IOException e) {
            System.out.println("Fallo en la escritura: ");
            System.out.println(e.getMessage());
        } */
        // operacionesFicheros.crearDirectorio("src/main/java/ressources");
        // operacionesFicheros.lecturaASCII("src/main/java/ressources/ficheros/ejemplo.txt");
        // operacionesFicheros.lecturaLinea("src/main/java/ressources/ficheros/ejemplo.txt");
        operacionesFicheros.lectorCodigos("src/main/java/ressources/ficheros/codigo.txt");


    }

}
