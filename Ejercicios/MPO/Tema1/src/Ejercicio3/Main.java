package Ejercicio3;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Decenas de millar:");
        int decenasMillar = scanner.nextInt();
        System.out.print("Unidades de millar:");
        int unidadesMillar = scanner.nextInt();
        System.out.print("Centenas:");
        int centenas = scanner.nextInt();
        System.out.print("Decenas:");
        int decenas = scanner.nextInt();
        System.out.print("Unidades:");
        int unidades = scanner.nextInt();
        int numero = (decenasMillar*10000)+(unidadesMillar*1000)+(centenas*100)+(decenas*10)+unidades;
        System.out.println("Número introducido: " + numero);
    }

}
