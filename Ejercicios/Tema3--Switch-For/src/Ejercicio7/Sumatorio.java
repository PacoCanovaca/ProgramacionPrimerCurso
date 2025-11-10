package Ejercicio7;

public class Sumatorio {

    public int obtenerSumatorio(int numero) {
        String message = "Sumando 1";
        int suma = 1;

        for (int i = 2; i <= numero; i++) {
            message = message + " + " + i;
            suma += i;
        }

        System.out.println(message);
        return suma;
    }

}
