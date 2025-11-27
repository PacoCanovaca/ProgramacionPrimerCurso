package Ejercicio5;

import java.util.Scanner;

public class Login {
    public boolean tryLogin(String correctUser, String correctPassword) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el usuario: ");
            String user = scanner.next();
            System.out.println("Introduce la contraseña: ");
            String password = scanner.next();
            if (user.equals(correctUser) && password.equals(correctPassword)) {
                break;
            } else if (!user.equals(correctUser)) {
                System.out.println("Usuario incorrecto. Vuelve a intentarlo.");
            } else {
                System.out.println("Contraseña incorrecta. Vuelve a intentarlo");
            }
            if (i == 2) {
                return false;
            }
        }
        return true;
    }
}
