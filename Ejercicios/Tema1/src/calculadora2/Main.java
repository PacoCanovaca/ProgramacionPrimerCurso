package calculadora2;

import calculadora2.ops.Operaciones2;

public class Main {

    static void main() {
        Operaciones2 operaciones2 = new Operaciones2();
        System.out.println(operaciones2.suma(10, 5));
        System.out.println(operaciones2.resta(6, 1));
        System.out.println(operaciones2.multiplicacion(5, 4));
        System.out.println(operaciones2.division(8, 2));
    }

}
