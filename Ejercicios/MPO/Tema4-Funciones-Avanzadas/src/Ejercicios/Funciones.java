package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.*;

public class Funciones {

    public Function<Integer, Integer> cuadrado = n -> n * n;

    public Predicate<Integer> esPar = n -> n % 2 == 0;

    public BiFunction<Integer, Integer, Integer> suma = Integer::sum;
    public BiFunction<Integer, Integer, Integer> resta = (n1, n2) -> n1 - n2;
    public BiFunction<Integer, Integer, Integer> multiplicacion = (n1, n2) -> n1 * n2;
    public BiFunction<Integer, Integer, Double> division = (n1, n2) -> (double) n1 / n2;

    public BiPredicate<String, String> tieneMismaLongitud = (p1, p2) -> p1.length() == p2.length();

    public BiConsumer<String, Integer> impresion = (nombre, edad) -> System.out.printf("Nombre: %s, Edad: %d%n", nombre, edad);

    public Function<Integer, String> conversion = n -> Integer.toString(n);
    public Function<Integer, Integer> sumaDiez = n -> n+10;
    public Function<Integer, Integer> multiplicaDos = n -> n*2;

    public BiFunction<Producto, Producto, Producto> buscarMasCaro = (p1, p2) -> p1.getPrecio()>p2.getPrecio() ? p1 : p2;

    public Predicate<Integer> mayorQue50 = n -> n > 50;
    public Predicate<Integer> divisiblePor3 = n -> n % 3 == 0;

    public BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> unirListas = (x, y) -> {
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        for (int numero : x) {
            if (!nuevaLista.contains(numero)) {
                nuevaLista.add(numero);
            }
        }
        for (int numero : y) {
            if (!nuevaLista.contains(numero)) {
                nuevaLista.add(numero);
            }
        }
        Collections.sort(nuevaLista);
        return nuevaLista;
    };

}
