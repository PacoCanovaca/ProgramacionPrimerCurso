package Ejercicio7;

public class Grade {

    public String getGrade(double mark) {
        if (mark >= 0 && mark <= 10) {
            if (mark < 5) {
                return "Tu calificación es: Suspenso";
            } else if (mark < 7) {
                return "Tu calificación es: Aprobado";
            } else if (mark < 9) {
                return "Tu calificación es: Notable";
            } else {
                return "Tu calificación es: Sobresaliente";
            }
        } else {
            return "La nota debe estar entre 0 y 10";
        }
    }

}
