package Ejercicio12;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una contraseña:");
        String password = scanner.next();
        System.out.println(validPassword(password));

        scanner.close();

    }

    public static String validPassword(String password) {
        boolean haveNumbers = false;
        for (char c: password.toCharArray()) {
            if (Character.isDigit(c)) {
                haveNumbers = true;
            }
        }
        if (password.equals("12345678") || password.toLowerCase().equals("password")) {
            return "Contraseña no válida. Debe ser distinta a '12345678' y a 'password'";
        } else if (password.length() < 8) {
            return "Contraseña no válida. Debe tener al menos 8 caracteres";
        } else if (! haveNumbers) {
            return "Contraseña no válida. Debe tener al menos un número";
        } else {
            return "Contraseña válida y registrada. Muchas gracias.";
        }

    }

}
