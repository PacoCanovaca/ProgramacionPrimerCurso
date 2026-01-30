package controller;

import lombok.Getter;
import model.Audio;
import model.ElementoMultimedia;
import model.Libro;
import model.Video;

import java.util.ArrayList;
import java.util.Scanner;

@Getter

public class ControladorColeccion {

    private ArrayList<ElementoMultimedia> coleccion = new ArrayList<>();
    private int nextId = 1;
    Scanner scanner = new Scanner(System.in);

    public ControladorColeccion(){}

    private ElementoMultimedia crearLibro(String titulo, String formato, double tamanio) {
        System.out.println("Introduce el autor:");
        String autor = scanner.next();
        System.out.println("Introduce el ISBN:");
        String isbn = scanner.next();
        System.out.println("Introduce el número de páginas:");
        int paginas = scanner.nextInt();
        return new Libro(titulo, formato, tamanio, autor, isbn, paginas);
    }

    private ElementoMultimedia crearVideo(String titulo, String formato, double tamanio) {
        System.out.println("Introduce el director:");
        String director = scanner.next();
        System.out.println("¿Cuántos actores hay?:");
        int nActores = scanner.nextInt();
        String[] actores = new String[nActores];
        for (int i = 0; i < actores.length; i++) {
            System.out.println("Introduce el nombre del actor " + (i+1) + ":");
            actores[i] = scanner.next();
        }
        return new Video(titulo, formato, tamanio, director, actores);
    }

    private ElementoMultimedia crearAudio(String titulo, String formato, double tamanio) {
        System.out.println("Introduce la duración en segundos:");
        int duracionSegundos = scanner.nextInt();
        System.out.println("Introduce el soporte:");
        String soporte = scanner.next();
        return new Audio(titulo, formato, tamanio, duracionSegundos, soporte);
    }

    public void registrarElemento() {
        ElementoMultimedia nuevoElemento;
        System.out.println("¿Qué tipo de elemento quieres registrar?\n1. Libro\n2. Video\n3. Audio");
        int tipo = scanner.nextInt();
        System.out.println("Introduce el título:");
        String titulo = scanner.next();
        System.out.println("Introduce el formato:");
        String formato = scanner.next();
        System.out.println("Introduce el tamaño:");
        double tamanio = scanner.nextDouble();
        switch (tipo) {
            case 1 -> nuevoElemento = crearLibro(titulo, formato, tamanio);
            case 2 -> nuevoElemento = crearVideo(titulo, formato, tamanio);
            case 3 -> nuevoElemento = crearAudio(titulo, formato, tamanio);
            default -> {
                System.out.println("Caso no contemplado\n");
                return;
            }
        }
        coleccion.add(nuevoElemento);
        nuevoElemento.setId(nextId);
        nextId++;
        System.out.println("¡Elemento Multimedia añadido!\n");
    }

    public void eliminarElemento() {
        System.out.println("Introduce el id del elemento que quieras eliminar");
        int id = scanner.nextInt();
        for (ElementoMultimedia item : coleccion) {
            if (item.getId() == id) {
                coleccion.remove(item);
                System.out.println("Elemento Multimedia eliminado.\n");
                return;
            }
        }
        System.out.println("Elemento no encontrado.\n");
    }

    public void listarElementos() {
        System.out.println("---Lista de elementos---");
        for (ElementoMultimedia item : coleccion) {
            item.mostrarDatos();
        }
    }

    public void buscarPorAutor() {
        System.out.println("Introduce el autor: ");
        String autor = scanner.next();
        System.out.println("Lista de libros de " + autor + ":");
        boolean hayLibros = false;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i) instanceof Libro) {
                Libro libro = (Libro) coleccion.get(i);
                if (autor.equalsIgnoreCase(libro.getAutor())) {
                    System.out.println("- " + libro.getTitulo());
                    hayLibros = true;
                }
            }
        }
        if (!hayLibros) {
            System.out.println("No se han encontrado libros de " + autor);
        }
        System.out.println();
    }

    public void buscarPorDirector() {
        System.out.println("Introduce el director: ");
        String director = scanner.next();
        System.out.println("Lista de películas de " + director + ":");
        boolean hayVideos = false;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i) instanceof Video) {
                Video video = (Video) coleccion.get(i);
                if (director.equalsIgnoreCase(video.getDirector())) {
                    System.out.println("- " + video.getTitulo());
                    hayVideos = true;
                }
            }
        }
        if (!hayVideos) {
            System.out.println("No se han encontrado películas de " + director);
        }
        System.out.println();
    }

    private boolean buscarActor(Video video, String actorBuscado) {
        for (String actor : video.getActores()) {
            if (actorBuscado.equalsIgnoreCase(actor)) {
                System.out.println("- " + video.getTitulo());
                return true;
            }
        }
        return false;
    }

    public void buscarPorActor() {
        System.out.println("Introduce el actor: ");
        String actor = scanner.next();
        System.out.println("Lista de películas de " + actor + ":");
        boolean hayVideos = false;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i) instanceof Video) {
                Video video = (Video) coleccion.get(i);
                if (buscarActor(video, actor)) {
                    hayVideos = true;
                }
            }
        }
        if (!hayVideos) {
            System.out.println("No se han encontrado películas de " + actor);
        }
        System.out.println();
    }

}
