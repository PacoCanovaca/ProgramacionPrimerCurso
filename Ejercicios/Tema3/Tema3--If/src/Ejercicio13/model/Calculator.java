package Ejercicio13.model;

public class Calculator {

    public String dayOfTheWeek(int dayNum) {
        String day = null;
        switch (dayNum) {
            case 1:
                day = "Lunes";
                break;
            case 2:
                day = "Martes";
                break;
            case 3:
                day = "Miércoles";
                break;
            case 4:
                day = "Jueves";
                break;
            case 5:
                day = "Viernes";
                break;
            case 6:
                day = "Sábado";
                break;
            case 7:
                day = "Domingo";
        }
        return day;
    }

    public double finalPrice(int age, int dayNum) {
        if (age < 12) {
            return 0.00;
        } else if (age <= 17) {
            if (dayNum == 2) {
                return 0.00;
            }
            return 5.00;
        } else if (age <= 64) {
            if (dayNum == 4) {
                return 7.00;
            }
            return 10.00;
        } else {
            return 6.00;
        }
    }

}
