package com.jaureguialzo;

/**
 * Created by widemos on 26/1/17.
 */
public class Rueda {

    // Atributos
    private String diametro;

    // Relaciones
    private Coche coche;

    // Constructor
    public Rueda(String diametro) {
        this.diametro = diametro;
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
        return "Rueda{" +
                "diametro='" + diametro + '\'' +
                '}';
    }
}
