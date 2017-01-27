package com.jaureguialzo;

/**
 * Created by widemos on 26/1/17.
 */
public class Motor {

    // Atributos
    private int cilindrada;
    private String combustible;
    private int potencia;

    // Relaciones
    private Coche coche;

    // Constructor
    public Motor(int cilindrada, String combustible, int potencia) {
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
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
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
