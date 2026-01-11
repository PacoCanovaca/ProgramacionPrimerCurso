package Biblioteca;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

@NoArgsConstructor

public class Biblioteca {
    private static ArrayList<Libro> biblioteca = new ArrayList<Libro>();
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private static ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();

    // Añadir libro a la biblioteca (siempre en disponible)

    private static void anadirLibro(Scanner scanner) {
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

    private static void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles: ");
        for (Libro libro : biblioteca) {
            if (libro.isDisponible()) {
                System.out.printf("- %s (%s) ISBN: %s%n", libro.getTitulo(), libro.getAutor(), libro.getISBN());
            }
        }
        System.out.println();
    }

    // Crear usuario

    private static void anadirUsuario(Scanner scanner) {
        System.out.print("Nombre del usuario: ");
        String nombre = scanner.next();
        int numeroSocio;
        if (listaUsuarios.isEmpty()) {
            numeroSocio = 1;
        } else {
            numeroSocio = listaUsuarios.getLast().getNumeroSocio() + 1;
        }
        listaUsuarios.add(new Usuario(nombre, numeroSocio));
    }

    // Buscar usuario

    private static Usuario buscarUsuario(Scanner scanner) {
        System.out.print("Introduce el número de socio: ");
        int numeroSocio = scanner.nextInt();
        Usuario usuario = null;
        for (Usuario item : listaUsuarios) {
            if (item.getNumeroSocio() == numeroSocio) {
                usuario = item;
                System.out.println("Usuario encontrado.");
                break;
            }
        }
        return usuario;
    }

    // Buscar libro

    private static Libro buscarLibro(Scanner scanner) {
        System.out.print("Introduce el ISBN del libro: ");
        String ISBN = scanner.next();
        Libro libro = null;
        for (Libro item : biblioteca) {
            if (item.getISBN().equalsIgnoreCase(ISBN)) {
                libro = item;
                System.out.println("Libro encontrado.");
                break;
            }
        }
        return libro;
    }

    // Crear préstamo

    private static void hacerPrestamo(Scanner scanner) {
        Usuario usuario = buscarUsuario(scanner);
        if (usuario == null) {
            System.out.println("El número de socio introducido no corresponde a ningún usuario existente. Inténtalo de nuevo.");
            return;
        }
        Libro libro = buscarLibro(scanner);
        if (libro == null) {
            System.out.println("El ISBN introducido no corresponde a ningún libro existente. Inténtalo de nuevo.");
            return;
        }
        Prestamo prestamo = new Prestamo(libro, usuario, LocalDate.now());
        prestamo.setNumeroPrestamo(listaPrestamos.size() + 1);
        listaPrestamos.add(prestamo);
    }

    // Buscar préstamo

    private static Prestamo buscarPrestamo(Scanner scanner) {
        System.out.print("Introduce el número de préstamo: ");
        int numeroPrestamo = scanner.nextInt();
        Prestamo prestamo = null;
        for (Prestamo item : listaPrestamos) {
            if (item.getNumeroPrestamo() == numeroPrestamo) {
                prestamo = item;
                System.out.println("Préstamo encontrado.");
                break;
            }
        }
        return prestamo;
    }

    // Devolver libro prestado

    private static void devolverLibro(Scanner scanner) {
        Prestamo prestamo = buscarPrestamo(scanner);
        if (prestamo == null) {
            System.out.println("El número de préstamo introducido no corresponde a ningún préstamo existente. Inténtalo de nuevo.");
            return;
        }
        prestamo.devolverLibro();
    }

    // Gestionar biblioteca

    public static void gestionarBiblioteca(Scanner scanner) {
        System.out.print("¿Cuántos libros hay en la biblioteca?: ");
        int libros = scanner.nextInt();
        for (int i = 0; i < libros; i++) {
            System.out.printf("Libro %d:%n", i+1);
            anadirLibro(scanner);
        }
        int opcion;
        do {
            System.out.printf("%n--MENÚ--%n\t1. Añadir un libro%n\t2. Mostrar libros disponibles%n\t3. Añadir usuario%n\t4. Prestar un libro%n\t5. Devolver un libro%n\t6. Salir%n%n");
            System.out.print("Introduce tu opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> anadirLibro(scanner);
                case 2 -> mostrarLibrosDisponibles();
                case 3 -> anadirUsuario(scanner);
                case 4 -> hacerPrestamo(scanner);
                case 5 -> devolverLibro(scanner);
                case 6 -> System.out.println("Saliendo...");
            }
        } while (opcion != 6);
    }
}
