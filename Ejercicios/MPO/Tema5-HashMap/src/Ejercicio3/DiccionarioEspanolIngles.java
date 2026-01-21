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

    public int ordenarPalabras(String o1, String o2) {
        for (int i = 0; i < o1.length(); i++) {
            if (o1.charAt(i) > o2.charAt(i)) {
                return 1;
            } else if (o1.charAt(i) < o2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    public void listarDiccionario() {
        System.out.println("Listando diccionario");
        Set<String> palabras = diccionario.keySet();
        ArrayList<String> palabrasEspanol = new ArrayList<>();
        for (String palabra : palabras) {
            palabrasEspanol.add(palabra);
        }
        Collections.sort(palabrasEspanol, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ordenarPalabras(o1, o2);
            }
        });
        for (String palabra : palabrasEspanol) {
            String traduccion = diccionario.get(palabra);
            System.out.printf("Traducción de %s: %s%n", palabra, traduccion);
        }
        System.out.println();
    }

    public int tamanioDiccionario() {
        return diccionario.size();
    }

    public void traducirFrase(String frase) {
        System.out.println("Traduciendo frase: " + frase);
        String[] palabras = frase.split(" ");
        String[] palabrasTraducidas = new String[palabras.length];
        String fraseTraducida = "";
        for (int i = 0; i < palabras.length; i++) {
            palabrasTraducidas[i] = diccionario.get(palabras[i]);
            if (i + 1 != palabras.length) {
                fraseTraducida += palabrasTraducidas[i] + " ";
            } else {
                fraseTraducida += palabrasTraducidas[i];
            }
        }
        System.out.println("Traducción: " + fraseTraducida + "\n");
    }

}
