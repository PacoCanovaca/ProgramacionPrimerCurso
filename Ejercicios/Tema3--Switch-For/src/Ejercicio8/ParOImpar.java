package Ejercicio8;

public class ParOImpar {

    public int contarImpares(int numero) {
        int contadorImpares = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

    public int contarPares(int numero) {
        int contadorPares = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

}
