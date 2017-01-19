package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro[] c = new Cronometro[10];

        int numCronos = 0;

        char opcion;

        do {
            System.out.println("a) Nuevo cronómetro\n" +
                    "b) Consultar cronómetro\n" +
                    "c) Salir");
            opcion = br.readLine().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    if( numCronos < 9 ) {
                        c[numCronos] = new Cronometro();
                        numCronos += 1;
                    }
                    break;
                case 'b':
                    System.out.print("Nº de cronómetro: ");
                    int n = Integer.parseInt(br.readLine());

/*
                    if( n >= 0 && n < numCronos ) {
                        c[n].tiempoTranscurrido();
                    }
*/
                    if( c[n] != null ) {
                        c[n].tiempoTranscurrido();
                    }
                    break;
            }
        } while (opcion != 'c');
    }
}
