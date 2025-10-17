import java.util.Scanner;

public class Ejercicio {
    /* Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar) */

    private Scanner lecturaTeclado;

    public void ejercicio1() {
        // 1. Introducir valores
        // 2. Guardar en variables
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuántos bocatas vas a pedir?");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuántas bebidas vas a pedir?");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuánto cuesta cada bocata?");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuánto cuesta cada bebida?");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuántas personas entran en la cuenta?");
        int personas = lecturaTeclado.nextInt();
        // 3. Realizar datos
        double precioBocatas = numeroBocatas*precioBocata;
        double precioBebidas = numeroBebidas*precioBebida;
        double costeTotal = precioBocatas+precioBebidas;
        double precioPersona = costeTotal/personas;
        // 4. Mostrar datos
        System.out.printf("El precio de los bocatas es %.2f € %n", precioBocatas);
        System.out.printf("El precio de las bebidas es %.2f € %n", precioBebidas);
        System.out.printf("El precio total es %.2f € %n", costeTotal);
        System.out.printf("El precio por persona es %.2f € %n", precioPersona);
        lecturaTeclado.close();
    }
}
