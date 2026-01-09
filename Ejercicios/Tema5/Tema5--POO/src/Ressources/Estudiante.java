package Ressources;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.printf("Estudiante: %s, %d años%n", nombre, edad);
    }

    public void setNota(Scanner scanner) {
        double nuevaNota;
        do {
            System.out.printf("Introduce la nota de %s: ", nombre);
            nuevaNota = scanner.nextDouble();
            if (nuevaNota < 0 || nuevaNota > 10) {
                System.out.println("La nota introducida debe estar entre 0 y 10");
            } else {
                nota = nuevaNota;
            }
            System.out.printf("Nota actual: %.2f%n%n", nota);
        } while (nuevaNota < 0 || nuevaNota > 10);
    }
}
