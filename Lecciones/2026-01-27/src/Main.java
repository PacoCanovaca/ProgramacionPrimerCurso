import controller.Centralita;
import model.Llamada;
import model.LlamadaLocal;
import model.LlamadaNacional;
import model.LlamadaProvincial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* LlamadaLocal llamadaLocal = new LlamadaLocal(123, 123, 5);
        llamadaLocal.mostrarDatos();
        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123, 123, 5);
        llamadaProvincial.mostrarDatos();
        LlamadaNacional llamadaNacional = new LlamadaNacional(123, 123, 5, 3);
        llamadaNacional.mostrarDatos(); */

        Scanner scanner = new Scanner(System.in);
        Centralita centralita = new Centralita();
        int opcion = -1;
        do {
            System.out.println("1. Añadir llamada");
            System.out.println("2. Lista llamadas");
            System.out.println("3. Mostrar costes");
            System.out.println("Dime qué acción quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    Llamada llamada;
                    System.out.println("¿Qué tipo de llamada quieres hacer?\n1. Local\n2. Provincial\n3. Nacional");
                    int tipo = scanner.nextInt();
                    System.out.println("Indica nOrigen:");
                    long nOrigen = scanner.nextLong();
                    System.out.println("Indica nDestino:");
                    long nDestino = scanner.nextLong();
                    System.out.println("Indica duración:");
                    int duracion = scanner.nextInt();
                    if (tipo == 3) {
                        System.out.println("Indica la franja:");
                        int franja = scanner.nextInt();
                        llamada = new LlamadaNacional(nOrigen, nDestino, duracion, franja);
                    } else if(tipo == 2){
                        llamada = new LlamadaProvincial(nOrigen, nDestino, duracion);
                    } else {
                        llamada = new LlamadaLocal(nOrigen, nDestino, duracion);
                    } // He usado polimorfismo para agregar cualquier tipo de llamada a la lista de llamadas de la Centralita.
                    centralita.registrarLlamada(llamada);
                    System.out.println("Llamada registrada");
                }
                case 2 -> {
                    centralita.mostrarLlamadas();
                }
                case 3 -> {
                    System.out.println(centralita.getCaja());
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Caso no contemplado");
                }

            }
        } while (opcion != 4);

    }
}
