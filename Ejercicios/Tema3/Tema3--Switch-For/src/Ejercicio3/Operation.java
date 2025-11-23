package Ejercicio3;

public class Operation {

    public int solveOperation(int num1, int num2, String operator) {
        switch (operator) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                return num1 / num2;
            }
        }
        return 0;
    }

}
