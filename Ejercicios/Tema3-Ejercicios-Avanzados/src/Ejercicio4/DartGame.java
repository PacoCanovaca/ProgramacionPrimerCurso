package Ejercicio4;

public class DartGame {

    public void calculatePoints(String firstPlayer, String secondPlayer) {

        int player1Points = 301;
        int player2Points = 301;
        int turns = 0;
        boolean winner = false;

        while (turns < 100) {
            turns++;
            System.out.printf("%n%nTURNO %d:%nPuntuación:%n- %s: %d puntos.%n- %s: %d puntos.%n%n", turns, firstPlayer, player1Points, secondPlayer, player2Points);
            System.out.printf("Turno para %s: %n", firstPlayer);
            player1Points = calculatePointsAfterTurn(player1Points);
            if (player1Points == 0) {
                System.out.printf("%n¡Ha ganado %s! El juego ha tomado %d turnos.", firstPlayer, turns);
                winner = true;
                break;
            }
            System.out.printf("%n%nPuntuación:%n- %s: %d puntos.%n- %s: %d puntos.%n%n", firstPlayer, player1Points, secondPlayer, player2Points);
            System.out.printf("Turno para %s: %n", secondPlayer);
            player2Points = calculatePointsAfterTurn(player2Points);
            if (player2Points == 0) {
                System.out.printf("%n¡Ha ganado %s! El juego ha tomado %d turnos.", secondPlayer, turns);
                winner = true;
                break;
            }
        }

        if (turns == 100 && !winner) {
            if (player1Points < player2Points) {
                System.out.printf("%n%n¡Ha ganado %s por menor número de puntos en el turno 100!", firstPlayer);
            } else if (player2Points < player1Points) {
                System.out.printf("%n%n¡Ha ganado %s por menor número de puntos en el turno 100!", secondPlayer);
            } else {
                System.out.printf("%n%n¡Empate en el turno 100! Final de la partida");
            }
        }


    }


    private int calculatePointsAfterTurn(int playerPoints) {
        int turnPoints = 0;
        for (int i = 1; i <= 3; i++) {
            int shot = (int) (Math.random() * 61);
            System.out.printf("- Dardo %d: %d puntos%n", i, shot);
            turnPoints += shot;
            if (turnPoints >= playerPoints) {
                break;
            }
        }
        if (turnPoints > playerPoints) {
            System.out.print("¡Te has pasado! Restas 0 puntos. Turno para el siguiente jugador.");
            return playerPoints;
        } else {
            System.out.printf("Puntuación del turno: %d puntos.", turnPoints);
            return playerPoints - turnPoints;
        }
    }
}
