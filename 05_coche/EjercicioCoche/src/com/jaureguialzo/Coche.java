package com.jaureguialzo;

/**
 * Created by widemos on 26/1/17.
 */
public class Coche {

    // Atributos
    private String marca;
    private String modelo;
    private int color;

    // Relaciones
    private Motor[] motores = new Motor[10];
    private Rueda[] ruedas = new Rueda[4];
    private Puerta[] puertas = new Puerta[5];

    // Número de objetos conectados
    private int numMotores = 0;
    private int numRuedas = 0;
    private int numPuertas = 0;

    // Constructor
    public Coche(String marca, String modelo, int color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Establecer las asociaciones
    public void añadirMotor(Motor m) {
        if (numMotores < 10) {
            motores[numMotores] = m;
            m.setCoche(this);
            numMotores += 1;
        }
    }

    public void añadirRueda(Rueda r) {
        if (numRuedas < 4) {
            ruedas[numRuedas] = r;
            r.setCoche(this);
            numRuedas += 1;
        }
    }

    public void añadirPuerta(Puerta p) {
        if (numPuertas < 5) {
            puertas[numPuertas] = p;
            p.setCoche(this);
            numPuertas += 1;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                '}';
    }
}
