package Ejercicio1;

public class Frutas {

    String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};

    public void imprimirFrutas(String[] fruits) {
        System.out.println("Frutas en el array:");
        for (String item : fruits) {
            System.out.println(item);
        }
    }

}
