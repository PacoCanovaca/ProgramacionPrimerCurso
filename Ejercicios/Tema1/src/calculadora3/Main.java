package calculadora3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operaciones ops = new Operaciones();

        int operador1 = scanner.nextInt();
        String operacion = scanner.next();
        int operador2 = scanner.nextInt();

        System.out.println(elegirOperacion(operador1, operador2, operacion));

    }

    public static Object elegirOperacion(int op1, int op2, String op) {
        if (op.equals("+")){
            return op1 + op2;
        } else if (op.equals("-")) {
            return op1 - op2;
        } else if (op.equals("x") || op.equals("*")) {
            return op1 * op2;
        } else if (op.equals("/")) {
            return op1 / op2;
        } else {
            return "El operador introducido no es correcto";
        }
    }

}
