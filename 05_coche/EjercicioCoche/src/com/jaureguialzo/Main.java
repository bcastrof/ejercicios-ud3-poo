package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("COCHE");

        System.out.print("  Marca: ");
        String marca = br.readLine();

        System.out.print("  Modelo: ");
        String modelo = br.readLine();

        System.out.print("  Color: ");
        int color = Integer.parseInt(br.readLine());

        Coche c = new Coche(marca, modelo, color);

        System.out.println("MOTOR");

        System.out.print("  Cilindrada: ");
        int cilin = Integer.parseInt(br.readLine());

        System.out.print("  Combustible: ");
        String combus = br.readLine();

        System.out.print("  Potencia: ");
        int potencia = Integer.parseInt(br.readLine());

        Motor m = new Motor(cilin, combus, potencia);

        c.añadirMotor(m);

        System.out.println("RUEDAS");

        System.out.print("  Diámetro: ");
        String diam = br.readLine();

        for (int i = 0; i < 4; i++) {
            c.añadirRueda(new Rueda(diam));
        }

        System.out.println("PUERTAS");

        int n = 0;

        boolean añadirMas = false;
        do {
            System.out.print("  ¿Elevalunas eléctricos? (s/n): ");
            boolean tieneElevalunas = br.readLine().equalsIgnoreCase("S");

            Puerta p = new Puerta(tieneElevalunas);

            c.añadirPuerta(p);

            n += 1;

            if (n >= 2 && n < 5) {
                System.out.print("  ¿Quieres añadir más puertas? (s/n): ");
                añadirMas = br.readLine().equalsIgnoreCase("S");
            }

        } while ((añadirMas && n < 5) || (n < 2));

        System.out.println("TU COCHE");
        System.out.println(c);

    }
}
