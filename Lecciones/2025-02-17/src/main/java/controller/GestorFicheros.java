package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorFicheros {

    public void crearFichero(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la creación del fichero");
        }
    }

    public void crearCarpeta(String path) {
        File file = new File(path);
        file.mkdirs();
    }

    public void escribirCaracteres(String path) {
        File file = new File(path);
        FileWriter writer = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime qué mensaje quieres guardar: ");
        String mensaje = scanner.nextLine();

        try {
            writer = new FileWriter(file, true);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                writer.write(letra);
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void escribirLineas(String path) {
        File file = new File(path);
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println("Esta línea es un ejemplo de la nueva forma de escribir");
            printWriter.println("Ahora se puede hacer la escritura de forma conjunta");
            printWriter.println();
            printWriter.println();
            printWriter.println();
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado del escritor");
            }
        }
    }

}
