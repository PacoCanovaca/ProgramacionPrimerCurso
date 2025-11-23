package Ejercicio1;

public class Frutas {

    String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};
    String[] frutas2 = {"Frambuesa", "Limón", "Tomate"};

    public void imprimirFrutas(String[] cualquiera) {
        System.out.println("Frutas en el array:");
        for (String item : cualquiera) {
            System.out.println(item);
        }
    }

}
