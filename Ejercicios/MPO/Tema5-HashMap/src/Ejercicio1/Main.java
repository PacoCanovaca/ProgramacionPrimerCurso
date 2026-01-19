package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        AgendaContactos agenda = new AgendaContactos();

        System.out.println("Agenda de Contactos");
        System.out.println("===================");

        agenda.agregarContacto("Ana", "666123456");
        agenda.agregarContacto("Carlos", "666789012");
        agenda.agregarContacto("María", "666345678");

        int totalContactos = agenda.contarContactos();
        System.out.println("\nTotal de contactos: " + totalContactos + "\n");

        String telefono = agenda.buscarContacto("Ana");
        System.out.println(telefono);

        System.out.println("\nListado de contactos:");
        agenda.listarContactos();

        System.out.println("Eliminando Carlos...");
        agenda.eliminarContacto("Carlos");

        totalContactos = agenda.contarContactos();
        System.out.println("\nTotal de contactos: " + totalContactos + "\n");


    }

}
