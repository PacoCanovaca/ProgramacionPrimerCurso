package Biblioteca;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;
    private boolean terminado;

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
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
