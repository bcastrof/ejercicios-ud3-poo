package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Robot robbie = new Robot(0, 0);

        String respuesta;
        do {
            System.out.print("Coordenada X: ");
            int x = Integer.parseInt(br.readLine());

            System.out.print("Coordenada Y: ");
            int y = Integer.parseInt(br.readLine());

            robbie.mover(x, y);

            System.out.println("Posición actual del robot: (" + robbie.getX() + "," + robbie.getY() + ")");

            System.out.print("¿Otra vez? (s/n): ");
            respuesta = br.readLine();
        } while (!respuesta.equalsIgnoreCase("N"));

    }
}
