import Ejercicios.Funciones;

public class MainEjercicios {

    public static void main(String[] args) {

        Funciones funciones = new Funciones();

        /* Ejercicio 1
        System.out.println(funciones.cuadrado.apply(1));
        System.out.println(funciones.cuadrado.apply(2));
        System.out.println(funciones.cuadrado.apply(3));
        System.out.println(funciones.cuadrado.apply(4));
        System.out.println(funciones.cuadrado.apply(5));
        */

        /* Ejercicio 2
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("Lista original:");
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 21));
            System.out.print(" " + numeros.get(i));
        }
        System.out.print("\nLista de pares:");
        numeros.forEach(item -> {
            if (funciones.esPar.test(item)) {
                System.out.print(" " + item);
            }
        });
        */

        /* Ejercicio 3
        System.out.println(funciones.suma.apply(5, 2));
        System.out.println(funciones.resta.apply(5, 2));
        System.out.println(funciones.multiplicacion.apply(5, 2));
        System.out.println(funciones.division.apply(5, 2));
        */

        /* Ejercicio 4
        System.out.println(funciones.tieneMismaLongitud.test("patata", "circo"));
        System.out.println(funciones.tieneMismaLongitud.test("coche", "fuego"));
        System.out.println(funciones.tieneMismaLongitud.test("botella", "willy11"));
        System.out.println(funciones.tieneMismaLongitud.test("roca", "piedra"));
        */

        /* Ejercicio 5
        funciones.impresion.accept("Paco", 28);
        */

        /* Ejercicio 6
        System.out.println(funciones.sumaDiez.andThen(funciones.multiplicaDos.andThen(funciones.conversion)).apply(2));
         */

        /* Ejercicio 7
        Producto producto1 = new Producto("Teclado", 80);
        Producto producto2 = new Producto("Ratón", 40);
        Producto producto3 = new Producto("Pantalla", 200);
        Producto producto4 = new Producto("Ordenador", 1400);
        Producto producto5 = new Producto("Pendrive", 5);
        Producto productoCaro = funciones.buscarMasCaro.apply(producto1, producto2);
        System.out.println("Producto más caro:" + productoCaro.getNombre());

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        Producto productoMasCaro = listaProductos.get(0);
        for (int i = 0; i < (listaProductos.size() - 1); i++) {
            productoMasCaro = funciones.buscarMasCaro.apply(listaProductos.get(i), listaProductos.get(i+1));
        }
        System.out.println("Producto más caro:" + productoMasCaro.getNombre());
         */

        /* Ejercicio 8
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("Lista original:");
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 100));
            System.out.print(" " + numeros.get(i));
        }
        System.out.print("\nLista de pares, divisibles por 3 y mayores que 50:");
        numeros.forEach(item -> {
            if (funciones.esPar.and(funciones.divisiblePor3.and(funciones.mayorQue50)).test(item)) {
                System.out.print(" " + item);
            }
        });
        System.out.print("\nLista de pares o divisibles por 3 o mayores que 50:");
        numeros.forEach(item -> {
            if (funciones.esPar.or(funciones.divisiblePor3.or(funciones.mayorQue50)).test(item)) {
                System.out.print(" " + item);
            }
        });
        System.out.print("\nLista de impares, indivisibles por 3 y menores que 50:");
        numeros.forEach(item -> {
            if (funciones.esPar.negate().and(funciones.divisiblePor3.negate().and(funciones.mayorQue50.negate())).test(item)) {
                System.out.print(" " + item);
            }
        });
         */

        /* Ejercicio 9 ArrayList<Integer> numeros1 = new ArrayList<>();
        System.out.print("Lista 1:");
        for (int i = 0; i < 10; i++) {
            numeros1.add((int) (Math.random() * 100));
            System.out.print(" " + numeros1.get(i));
        }
        System.out.println();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        System.out.print("Lista 2:");
        for (int i = 0; i < 10; i++) {
            numeros2.add((int) (Math.random() * 100));
            System.out.print(" " + numeros2.get(i));
        }
        System.out.println();
        ArrayList<Integer> listaFinal = funciones.unirListas.apply(numeros1, numeros2);
        System.out.print("Lista final:");
        for (int i = 0; i < listaFinal.size(); i++) {
            System.out.print(" " + listaFinal.get(i));
        }
         */

    }

}
