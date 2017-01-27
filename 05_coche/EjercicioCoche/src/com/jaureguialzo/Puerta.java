package com.jaureguialzo;

/**
 * Created by widemos on 26/1/17.
 */
public class Puerta {

    // Atributos
    private boolean elevalunasElectrico;

    // Relaciones
    private Coche coche;

    // Constructor
    public Puerta(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    // Asociación
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "elevalunasElectrico=" + elevalunasElectrico +
                '}';
    }
}
