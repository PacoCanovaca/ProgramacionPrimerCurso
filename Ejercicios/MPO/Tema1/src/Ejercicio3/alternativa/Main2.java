package Ejercicio3.alternativa;

import java.util.Scanner;

public class Main2 {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Decenas de millar:");
        String decenasMillar = scanner.next();
        System.out.print("Unidades de millar:");
        String unidadesMillar = scanner.next();
        System.out.print("Centenas:");
        String centenas = scanner.next();
        System.out.print("Decenas:");
        String decenas = scanner.next();
        System.out.print("Unidades:");
        String unidades = scanner.next();
        int numero = Integer.parseInt(decenasMillar+unidadesMillar+centenas+decenas+unidades);
        System.out.println("Número introducido: " + numero);

    }

}
