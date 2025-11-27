package Ejercicio4;

public class Mark {
    public double getAverage(double[] marks) {
        double total = 0;
        int validElements = 0;
        for (double mark : marks) {
            if (mark < 0 || mark > 10) {
                continue;
            }
            total += mark;
            validElements++;
        }
        return total/validElements;
    }
}
