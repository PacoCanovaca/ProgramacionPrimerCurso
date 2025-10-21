public class Tema2 {

    static void main() {

        double numeroDecimal = 7.0;
        System.out.println((int) numeroDecimal);

        int numeroEntero = 8;
        System.out.println((double) numeroEntero);

        String palabra = "20";
        int numero = Integer.valueOf(palabra);
        System.out.println(numero);
        System.out.println(numero + 45);

        String booleanoStr = "true";
        boolean booleano = Boolean.valueOf(booleanoStr);
        System.out.println(booleano);

        alternativa();
    }

    public static void alternativa() {
        String palabra = "20";
        int numero = Integer.parseInt(palabra);
        System.out.println(numero); // Output: 20
        System.out.println(numero + 45); // Output: 65

        String booleanoStr = "true";
        boolean booleano = Boolean.parseBoolean(booleanoStr);
        System.out.println(booleano); // Output: true
    }

}
