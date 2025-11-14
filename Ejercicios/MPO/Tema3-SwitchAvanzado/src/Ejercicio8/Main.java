package Ejercicio8;

import java.util.Scanner;

public class Main {
    static void main() {
        // **Objetivo:** Crear un programa que identifique el tipo de archivo según su extensión.
        //
        //**Requisitos:**
        //
        //1. Declara una variable `String extension` (por ejemplo: "jpg", "pdf", "txt", "mp3").
        //2. Usa un `switch` para agrupar extensiones similares: Imágenes (jpg, png, gif), Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
        //3. Muestra el tipo de archivo y el programa recomendado para abrirlo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la extensión del archivo en minúsculas: ");
        String extension = scanner.next();

        switch (extension) {
            case "jpg", "png", "gif" -> System.out.println("Imagen. Utiliza Google Photos");
            case "pdf", "doc", "txt" -> System.out.println("Documento. Utiliza Adobe Acrobat");
            case "mp3", "wav" -> System.out.println("Audio. Utiliza Windows Audio Player");
            case "mp4", "avi" -> System.out.println("Vídeo. Utiliza Windows Media Player");
            default -> System.out.println("Extensión errónea.");
        }

        scanner.close();

    }
}
