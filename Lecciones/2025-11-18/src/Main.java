public class Main {
    static void main() {
        // Array
        // Mediante "huecos"
        int[] listaNumeros = new int[5];
        // Mediante elementos
        int[] listaNumerosIntroducidos = new int[]{1, 45, 63, 23, 4, 7, 41};
        int[] listaNumerosIntroducidos2 = {1, 45, 63, 23, 4, 7, 41};
        listaNumerosIntroducidos2[1] = 22;
        System.out.println("La posición 1 es " + listaNumerosIntroducidos2[1]);
        for (int i = 0; i < listaNumerosIntroducidos2.length; i++) {
            System.out.println(listaNumerosIntroducidos2[i]);
        }
        int sumatorio = 0;
        for (int i = 0; i < listaNumerosIntroducidos2.length; i++) {
            System.out.println(listaNumerosIntroducidos2[i]);
            sumatorio += listaNumerosIntroducidos[i];
        }
        System.out.println("El total es " + sumatorio);
        sumatorio = 0;
        for (int item : listaNumerosIntroducidos2) {
            sumatorio += item;
        }
        System.out.println("El nuevo total es " + sumatorio);
    }
}
