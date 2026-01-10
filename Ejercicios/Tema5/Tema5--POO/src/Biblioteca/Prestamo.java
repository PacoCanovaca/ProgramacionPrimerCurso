package Biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private int numeroPrestamo;
    private boolean terminado;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo) {
        System.out.printf("Usuario %s (Socio %d) intenta tomar prestado %s%n", usuario.getNombre(), usuario.getNumeroSocio(), libro.getTitulo());
        if (libro.isDisponible()) {
            this.libro = libro;
            this.usuario = usuario;
            this.fechaPrestamo = fechaPrestamo;
            terminado = false;
            System.out.println("✓ Préstamo realizado el " + fechaPrestamo + "\n");
            libro.setDisponible(false);
        } else {
            this.libro = null;
            this.usuario = null;
            this.fechaPrestamo = null;
            terminado = true;
            System.out.println("✗ El libro no está disponible\n");
        }
    }

    public void devolverLibro() {
        System.out.printf("%nUsuario %s devuelve %s%n", usuario.getNombre(), libro.getTitulo());
        System.out.println("✓ Libro devuelto\n");
        libro.setDisponible(true);
        terminado = true;
    }



}
