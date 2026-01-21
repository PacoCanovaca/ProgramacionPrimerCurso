package Ejercicio3;

import java.util.*;

public class DiccionarioEspanolIngles {

    private final HashMap<String, String> diccionario = new HashMap<>();

    public DiccionarioEspanolIngles() {};

    public void agregarTraduccion(String espanol, String ingles) {
        if (diccionario.containsKey(espanol)) {
            System.out.println("Traducción actualizada.\n");
        } else {
            System.out.println("Traducción añadida.\n");
        }
        diccionario.put(espanol, ingles);
    }

    public void agregarVariasTraducciones(String[][] traducciones) {
        System.out.println("Agregando traducciones...");
        for (int i = 0; i < traducciones.length; i++) {
            diccionario.put(traducciones[i][0], traducciones[i][1]);
        }
        System.out.printf("Diccionario cargado con %d palabras.%n%n", traducciones.length);
    }

    public void listarDiccionarios() {
        
    }

}
