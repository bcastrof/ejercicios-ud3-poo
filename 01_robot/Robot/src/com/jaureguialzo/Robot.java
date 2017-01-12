package com.jaureguialzo;

public class Robot {

    private int x = 0;
    private int y = 0;

    /**
     * Desplaza el robot a las coordenadas de destino, si se cumplen los criterios
     *
     * @param dx Coordenada X de destino
     * @param dy Coordenada Y de destino
     */
    public void mover(int dx, int dy) {

        if (dx < 10 && dy < 10 && dx > -10 && dy > -10) {
            if (dx == x && dy == y + 1) {
                y = dy;
            }
            if (dx == x && dy == y - 1) {
                y = dy;
            }
            if (dx == x + 1 && dy == y) {
                x = dx;
            }
            if (dx == x - 1 && dy == y) {
                x = dx;
            }
        }
    }

    // Contructor sin parámetros
    public Robot() {
    }

    // Constructor para inicializar todas las propiedades
    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos de acceso
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // No hay setX ni setY porque no permitimos que se modifiquen desde fuera
}