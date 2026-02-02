package Ejercicios;

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

}
