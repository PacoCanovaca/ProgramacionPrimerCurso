package controller;

import lombok.Getter;
import lombok.Setter;
import model.Llamada;

import java.util.ArrayList;

@Getter
@Setter

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada) {
        listaLlamadas.add(llamada);
        this.caja += llamada.getCoste();
    }

    public void mostrarLlamadas(){
        if (!listaLlamadas.isEmpty()) {
            listaLlamadas.forEach(item -> item.mostrarDatos());
            // listaLlamadas.forEach(Llamada::mostrarDatos);
        } else {
            System.out.println("La lista está vacía");
        }
    }

}
