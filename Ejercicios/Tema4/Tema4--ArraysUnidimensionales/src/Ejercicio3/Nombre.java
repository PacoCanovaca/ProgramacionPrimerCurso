package Ejercicio3;

import java.util.Scanner;

public class Nombre {

    String[] nombres = new String[6];

    public void mostrarNombres(String[] listaNombres) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.printf("Introduce el nombre %d: ", i+1);
            listaNombres[i] = scanner.next();
        }
        System.out.println("Nombres introducidos:");
        for (String item : listaNombres) {
            System.out.println(item);
        }
        scanner.close();
    }

}
