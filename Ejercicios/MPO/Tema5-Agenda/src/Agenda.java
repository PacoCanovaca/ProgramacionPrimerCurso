import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private void addContact(ArrayList<Object[]> agenda) {
        Scanner scanner = new Scanner(System.in);
        String[] data = new String[]{"Nombre: ", "Apellido: ", "Teléfono: ", "DNI: "};
        Object[] newContact = new Object[4];
        System.out.println("Introduce los datos del nuevo contacto: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            newContact[i] = scanner.next();
        }
        agenda.add(newContact);
        System.out.println("Contacto añadido.");
        System.out.println();
    }

    private void searchContact(ArrayList<Object[]> agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el DNI de la persona que buscas: ");
        String dni = scanner.next();
        for (int i = 0; i < agenda.size(); i++) {
            String contactDni = (String) agenda.get(i)[3];
            if (contactDni.equalsIgnoreCase(dni)) {
                System.out.printf("Datos del contacto:%n\tNombre: %s, Apellido: %s, Teléfono: %s%n", agenda.get(i)[0], agenda.get(i)[1], agenda.get(i)[2]);
                System.out.println();
                return;
            }
        }
        System.out.println("No se ha encontrado ningún contacto con ese DNI.");
        System.out.println();
    }

    private void removeContact(ArrayList<Object[]> agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el DNI de la persona que buscas: ");
        String dni = scanner.next();
        for (int i = 0; i < agenda.size(); i++) {
            String contactDni = (String) agenda.get(i)[3];
            if (contactDni.equalsIgnoreCase(dni)) {
                System.out.printf("El contacto %s %s ha sido eliminado.%n", agenda.get(i)[0], agenda.get(i)[1]);
                agenda.remove(i);
                System.out.println();
                return;
            }
        }
        System.out.println("No se ha encontrado ningún contacto con ese DNI.");
        System.out.println();
    }

    private void listContacts(ArrayList<Object[]> agenda) {
        System.out.println("Lista de contactos: ");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.printf("\tContacto %d -> Nombre: %s, Apellido: %s, Teléfono: %s%n", i+1, agenda.get(i)[0], agenda.get(i)[1], agenda.get(i)[2]);
        }
        System.out.println();
    }

    public void manageAgenda(ArrayList<Object[]> agenda) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.print("--- MENÚ AGENDA ---\n\t1. Agregar contacto\n\t2. Buscar contacto\n\t3. Eliminar contacto\n\t4. Listar contactos\n\t5. Salir\nSelecciona una opción por su número: ");
            option = scanner.nextInt();
            System.out.println();
            switch (option) {
                case 1 -> addContact(agenda);
                case 2 -> searchContact(agenda);
                case 3 -> removeContact(agenda);
                case 4 -> listContacts(agenda);
                case 5 -> System.out.println("Saliendo...");
            }

        } while (option != 5);
    }

}
