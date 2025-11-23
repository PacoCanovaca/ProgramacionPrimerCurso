package Ejercicio2;

public class Entero {

    int[] numerosEnteros = new int[6];

    public void mostrarNumeros(int[] listaNumero) {
        int nuevoNumero = 0;
        System.out.println("Recorriendo el array:");
        for (int i = 0; i < listaNumero.length; i++) {
            nuevoNumero += 10;
            numerosEnteros[i] = nuevoNumero;
            System.out.printf("Posición %d: %d%n", i, numerosEnteros[i]);
        }
    }

    public void mostrarNumeros2(int[] listaNumero) {
        System.out.println("Recorriendo el array:");
        for (int i = 0; i < listaNumero.length; i++) {
            numerosEnteros[i] = (i + 1) * 10;
            System.out.printf("Posición %d: %d%n", i, numerosEnteros[i]);
        }
    }

}
