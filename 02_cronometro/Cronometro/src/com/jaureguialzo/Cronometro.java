package com.jaureguialzo;

/**
 * Created by widemos on 12/1/17.
 */
public class Cronometro {

    private long horaInicio;

    public void tiempoTranscurrido() {
        double t = (System.nanoTime() - horaInicio) / 1000000000.0;
        System.out.println(t);
    }

    public Cronometro() {
        horaInicio = System.nanoTime();
    }
}
