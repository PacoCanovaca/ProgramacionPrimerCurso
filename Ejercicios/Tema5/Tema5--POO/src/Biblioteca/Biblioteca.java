package Biblioteca;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@NoArgsConstructor

public class Biblioteca {
    private ArrayList<Libro> biblioteca = new ArrayList<Libro>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();

    // Añadir libro a la biblioteca (siempre en disponible)

    public void anadirLibro(Scanner scanner) {
        System.out.print("Introduce el título: ");
        String titulo = scanner.next();
        System.out.print("Introduce el autor: ");
        String autor = scanner.next();
        System.out.print("Introduce el ISBN: ");
        String ISBN = scanner.next();
        biblioteca.add(new Libro(titulo, autor, ISBN, true));
        System.out.println("Libro añadido");
    }

    // Mostrar libros disponibles

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles: ");
        for (Libro libro : biblioteca) {
            if (libro.isDisponible()) {
                System.out.printf("- %s (%s) ISBN: %s%n", libro.getTitulo(), libro.getAutor(), libro.getISBN());
            }
        }
        System.out.println();
    }

    // Crear usuario

    public void anadirUsuario(Scanner scanner) {
        System.out.print("Nombre del usuario: ");
        String nombre = scanner.next();
        int numeroSocio;
        if (listaUsuarios.size() == 0) {
            numeroSocio = 1;
        } else {
            numeroSocio = listaUsuarios.getLast().getNumeroSocio() + 1;
        }
        listaUsuarios.add(new Usuario(nombre, numeroSocio));
    }

    // todo Crear préstamo

    public void hacerPrestamo() {

    }

    // todo Devolver libro prestado
    

    // todo Gestionar biblioteca
    public void gestionarBiblioteca(Scanner scanner) {
        System.out.print("¿Cuántos libros hay en la biblioteca?: ");
        int libros = scanner.nextInt();
        for (int i = 0; i < libros; i++) {
            System.out.printf("Libro %d:%n", i+1);
            anadirLibro(scanner);
        }
        int opcion;
        do {
            System.out.printf("%n--MENÚ--%n\t1. Mostrar libros disponibles%n\t2. Hacer un préstamo%n\t3. Devolver un libro%n\t4. Añadir un libro a la biblioteca%n\t5. Salir%n%n");
            System.out.print("Introduce tu opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    mostrarLibrosDisponibles();
                }
                case 2 -> {

                }
            }
        } while (opcion != 5);
    }



}
