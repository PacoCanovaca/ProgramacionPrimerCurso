import java.util.Scanner;

public class Main {

    static void main() {

        // Ejercicio 1
        Persona persona1 = new Persona("Juan", 25);
        System.out.printf("Nombre: %s%nEdad: %d%n%n", persona1.nombre, persona1.edad);

        // Ejercicio 2
        Persona persona2 = new Persona("Ana", 30);
        System.out.println("Datos iniciales:");
        System.out.printf("Nombre: %s%nEdad: %d%n", persona2.getNombre(), persona2.getEdad());
        persona2.setNombre("María");
        persona2.setEdad(28);
        System.out.println("\nDatos modificados:");
        System.out.printf("Nombre: %s%nEdad: %d%n%n", persona2.getNombre(), persona2.getEdad());

        // Ejercicio 3
        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        System.out.printf("Rectángulo con base %.1f y altura %.1f%n", rectangulo1.getBase(), rectangulo1.getAltura());
        System.out.printf("Área: %.1f%n", rectangulo1.calcularArea());
        System.out.printf("Perímetro: %.1f%n%n", rectangulo1.calcularPerimetro());

        // Ejercicio 4
        Libro libro1 = new Libro();
        System.out.printf("Libro 1: %s, %s, %d páginas%n", libro1.getTitulo(), libro1.getAutor(), libro1.getPaginas());
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");
        System.out.printf("Libro 2: %s, %s, %d páginas%n", libro2.getTitulo(), libro2.getAutor(), libro2.getPaginas());
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        System.out.printf("Libro 3: %s, %s, %d páginas%n%n", libro3.getTitulo(), libro3.getAutor(), libro3.getPaginas());

        // Ejercicio 5
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Juan García", 1500);
        cuentaBancaria1.depositar(500);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("María López", 800);
        cuentaBancaria2.retirar(200);
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria("Pedro Martín", 1200);
        cuentaBancaria3.depositar(300);

        // Ejercicio 6
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante("Laura Fernández", 25);
        estudiante1.setNota(scanner);

        // Ejercicio 7
        Producto producto1 = new Producto("Teclado", 45.99, 10);
        System.out.println(producto1.toString());
        Producto producto2 = new Producto("Ratón", 25.50, 25);
        System.out.println(producto2.toString());
        Producto producto3 = new Producto("Monitor", 299.99, 5);
        System.out.println(producto3.toString());

    }

}
