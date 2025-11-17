package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del jugador 1: ");
        String player1 = scanner.next();
        System.out.print("Introduce el nombre del jugador 2: ");
        String player2 = scanner.next();

        DartGame dartGame = new DartGame();
        dartGame.calculatePoints(player1, player2);

        scanner.close();
    }
}
