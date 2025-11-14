package Ejercicio6;

import java.time.LocalDateTime;

public class Main {

    static void main() {

        switch (obtenerHoraActual()) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println("¡Buena madrugada!");
            case 6, 7, 8, 9, 10, 11 -> System.out.println("¡Buenos días!");
            case 12, 13, 14, 15, 16, 17 -> System.out.println("¡Buenas tardes!");
            case 18, 19, 20, 21, 22, 23 -> System.out.println("¡Buenas noches!");
        }

    }

    public static int obtenerHoraActual() {
        LocalDateTime localTime = LocalDateTime.now();
        return localTime.getHour();
    }

}
