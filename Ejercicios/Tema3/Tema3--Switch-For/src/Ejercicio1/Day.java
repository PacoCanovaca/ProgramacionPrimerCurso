package Ejercicio1;

public class Day {

    public String dayOfTheWeek(int number) {
        switch(number) {
            case 1 -> {
                return "Lunes";
            }
            case 2 -> {
                return "Martes";
            }
            case 3 -> {
                return "Miércoles";
            }
            case 4 -> {
                return "Jueves";
            }
            case 5 -> {
                return "Viernes";
            }
            case 6 -> {
                return "Sábado";
            }
            case 7 -> {
                return "Domingo";
            }
            default -> {
                return "Error";
            }
        }
    }

}
