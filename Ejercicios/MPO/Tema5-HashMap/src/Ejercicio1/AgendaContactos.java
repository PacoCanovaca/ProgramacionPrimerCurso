package Ejercicio1;

import java.util.HashMap;

public class AgendaContactos {

    private HashMap<String, String> agendaContactos = new HashMap<>();

    public AgendaContactos(){}

    public void agregarContacto(String nombre, String telefono) {
        if (agendaContactos.get(nombre) == null) {
            System.out.printf("Contacto añadido: %s - %s%n%n", nombre, telefono);
        } else {
            System.out.printf("Contacto actualizado: %s - %s%n%n", nombre, telefono);
        }
        agendaContactos.put(nombre, telefono);
    }

    public String buscarContacto(String nombre) {
        System.out.println("Buscando a " + nombre + "...");
        return "El número de teléfono es " + agendaContactos.get(nombre) + "\n";
    }

    public boolean eliminarContacto(String nombre) {
        if (agendaContactos.get(nombre) != null) {
            agendaContactos.remove(nombre);
            System.out.printf("Contacto %s eliminado%n%n", nombre);
            return true;
        }
        System.out.printf("Contacto %s no encontrado%n%n", nombre);
        return false;
    }

    public void listarContactos() {
        for (String contacto: agendaContactos.keySet()) {
            System.out.printf("%s - %s%n", contacto, agendaContactos.get(contacto));
        }
        System.out.println();
    }

    public int contarContactos() {
        return agendaContactos.size();
    }

    public boolean existeContacto(String nombre) {
        if (agendaContactos.get(nombre) != null) {
            System.out.println("El contacto existe\n");
            return true;
        } else {
            System.out.println("El contacto no existe\n");
            return false;
        }
    }



}
