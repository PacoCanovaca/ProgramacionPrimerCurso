package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.OptionalDouble;

public class Gestor {

    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor(){
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    };

    // agregar alumnos con dni que no esté en la lista

    public void agregarAlumno(Alumno alumno){

        // Con un hashMap

        if (!alumnosMap.containsKey(alumno.getDni())) {
            alumnosMap.put(alumno.getDni(), alumno);
        }

        // Para hacerlo con ArrayList se podría hacer un for(:) tradicional o un forEach y una lambda

        /* alumnos.forEach(item -> {
            if (alumno.getDni().equalsIgnoreCase(item.getDni())) {

            }
        }); */

        // Pero aún más sencillo, puedo hacerlo con una función avanzada

        if (alumnos.stream().anyMatch(item -> item.getDni().equalsIgnoreCase(alumno.getDni()))) {
            System.out.println("El dni está en la lista. No se puede agregar alumno");
        } else {
            System.out.println("Agregado con éxito");
            alumnos.add(alumno);
        }


    }

    public void mostrarAlumnos() {
        // ArrayList
        alumnos.forEach(Alumno::mostrarDatos);

        // HashMap
        /* alumnosMap.values().forEach(Alumno::mostrarDatos); */
    }

    public void calificarAlumnos(){
        // ArrayList
        alumnos.forEach(item -> {
            if (item.getNota() == -1) {
                item.setNota((int) (Math.random() * 11));
            }
        });

        // HashMap
        alumnosMap.values().forEach(item -> {
            if (item.getNota() == -1) {
                item.setNota((int) (Math.random() * 11));
            }
        });
    }

    public void calcularMedia(){
        // double media = alumnos.stream().mapToDouble(Alumno::getNota).sum()/alumnos.size();
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();
        System.out.println("La media es " + media.getAsDouble());
    }

}
