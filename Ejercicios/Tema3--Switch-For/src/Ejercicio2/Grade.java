package Ejercicio2;

public class Grade {

    public String getMark(String mark) {
        switch (mark) {
            case "A" -> {
                return "Excelente";
            }
            case "B" -> {
                return "Muy bien";
            }
            case "C" -> {
                return "Bien";
            }
            case "D" -> {
                return "Regular";
            }
            case "E" -> {
                return "Mal";
            }
            case "F" -> {
                return "Fatal";
            }
            default -> {
                return "Error";
            }
        }
    }

}
