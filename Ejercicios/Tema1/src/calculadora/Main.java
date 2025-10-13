package calculadora;

public class Main {

    static void main() {
        Operaciones operaciones = new Operaciones();
        System.out.println(operaciones.suma(10, 5));
        System.out.println(operaciones.resta(6, 1));
        System.out.println(operaciones.multiplicacion(5, 4));
        System.out.println(operaciones.division(8, 2));
    }

}
