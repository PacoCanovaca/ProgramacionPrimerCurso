package Ejercicio4;

import java.util.Scanner;

public class Draw {

    private String[] createRaffleBox(int raffleBoxNum) {
        Scanner scanner = new Scanner(System.in);
        String[] raffleBox = new String[5];
        System.out.println("Bombo " + raffleBoxNum);
        for (int i = 0; i < raffleBox.length; i++) {
            System.out.printf("Introduce el equipo %d: ", i+1);
            String team = scanner.next();
            raffleBox[i] = team;
        }
        System.out.println();
        return raffleBox;
    }

    private String makeDrawTurn(String[] box) {
        boolean isValid = false;
        String team = "";
        while(!isValid) {
            int index = (int) (Math.random() * 5);
            if (box[index] != null) {
                team = box[index];
                box[index] = null;
                isValid = true;
            }
        }
        return team;
    }

    public void printMatches() {
        String[] box1 = createRaffleBox(1);
        String[] box2 = createRaffleBox(2);
        System.out.println("Partidos del Mundial:");
        for (int i = 1; i <= 5; i++) {
            String team1 = makeDrawTurn(box1);
            String team2 = makeDrawTurn(box2);
            System.out.printf("Partido %d: %s - %s%n", i, team1, team2);
        }
    }

}
