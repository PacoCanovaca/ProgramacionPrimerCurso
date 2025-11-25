package Ejercicio8;

import java.util.Scanner;

public class Animal {
    String[] animals = {"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
    public void countWordRepetitions(String[] wordsList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar: ");
        String wordToSearch = scanner.next();
        scanner.close();
        int count = 0;
        for (String word : wordsList) {
            if (word.equalsIgnoreCase(wordToSearch)) {
                count++;
            }
        }
        System.out.printf("La palabra '%s' aparece %d veces en el array", wordToSearch.toLowerCase(), count);
    }
}
