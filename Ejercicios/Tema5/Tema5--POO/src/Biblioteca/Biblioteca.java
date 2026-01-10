package Biblioteca;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

    // Crear préstamo

    public void hacerPrestamo(Scanner scanner) {
        System.out.print("Introduce el número de socio: ");
        int numeroSocio = scanner.nextInt();
        Usuario usuario = null;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNumeroSocio() == numeroSocio) {
                usuario = listaUsuarios.get(i);
                return;
            }
        }
        if (usuario == null) {
            System.out.printf("El número de socio introducido no corresponde a ningún usuario existente. Inténtalo de nuevo.");
            return;
        }
        System.out.print("Introduce el ISBN del libro: ");
        String ISBN = scanner.next();
        Libro libro = null;
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).getISBN().equalsIgnoreCase(ISBN)) {
                libro = biblioteca.get(i);
                return;
            }
        }
        if (libro == null) {
            System.out.printf("El ISBN introducido no corresponde a ningún libro existente. Inténtalo de nuevo.");
            return;
        }
        listaPrestamos.add(new Prestamo(libro, usuario, LocalDate.now()));

    }

    // todo Devolver libro prestado

    public void devolverLibro(Scanner scanner) {
        
    }

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
            System.out.printf("%n--MENÚ--%n\t1. Añadir un libro%n\t2. Mostrar libros disponibles%n\t3. Añadir usuario%n\t4. Prestar un libro%n\t5. Devolver un libro%n%n");
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
