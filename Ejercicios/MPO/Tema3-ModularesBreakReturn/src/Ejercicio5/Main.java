package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.printf("¿Login válido?: %b", login.tryLogin("Paco", "1234"));
    }
}
