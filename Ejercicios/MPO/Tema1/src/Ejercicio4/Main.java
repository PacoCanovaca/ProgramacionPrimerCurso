package Ejercicio4;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de segundos:");
        int seconds = scanner.nextInt();

        int[] hoursMinutesSeconds = getTime(seconds);
        System.out.println("Horas: " + hoursMinutesSeconds[0]);
        System.out.println("Minutos: " + hoursMinutesSeconds[1]);
        System.out.println("Segundos: " + hoursMinutesSeconds[2]);

    }

    public static int[] getTime(int seconds) {

        int minutes = seconds / 60;
        int finalSeconds = seconds % 60;
        int hours = minutes / 60;
        int finalMinutes = minutes % 60;
        int[] hoursMinutesSeconds = {hours, finalMinutes, finalSeconds};
        return hoursMinutesSeconds;

    }

}
