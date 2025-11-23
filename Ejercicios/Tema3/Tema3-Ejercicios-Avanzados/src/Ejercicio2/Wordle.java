package Ejercicio2;

import java.util.Scanner;

public class Wordle {
    private void compareWord(String secretWord, String guess) {
        int hits = 0;
        int aprox = 0;
        int misses = 0;
        String correctLetters = "Los aciertos están en la/s posición/es ";
        String aproxLetters = "Las aproximaciones están en la/s posición/es ";
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(i)) {
                hits++;
                correctLetters += i+1 + " ";
            } else if (secretWord.contains(String.valueOf(guess.charAt(i)))) {
                aprox++;
                aproxLetters += i+1 + " ";
            } else {
                misses++;
            }
        }
        System.out.printf("La palabra %s tiene:%n- Aciertos: %d%n- Aproximaciones: %d%n- Errores: %d%n", guess, hits, aprox, misses);
        if (hits > 0) {
            System.out.println(correctLetters);
        }
        if (aprox > 0) {
            System.out.println(aproxLetters);
        }
    }

    public void repeatProcess(String secretWord) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        String word;
        do {
            System.out.print("Introduce tu palabra: ");
            word = scanner.next().toUpperCase();
            tries++;
            if (secretWord.equals(word)) {
                break;
            }
            compareWord(secretWord, word);
            System.out.printf("Palabra errónea. Llevas %d intentos.%n", tries);
        } while (tries < 5);
        if (!word.equals(secretWord)) {
            System.out.printf("Has perdido. La palabra correcta era %s", secretWord);
        } else {
            System.out.printf("¡Correcto! La palabra era %s. Has ganado el juego.", secretWord);
        }
        scanner.close();
    }

}
