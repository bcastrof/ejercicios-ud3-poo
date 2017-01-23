package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Creamos el grupo
        System.out.print("Código: ");
        String codigo = br.readLine();

        Grupo g = new Grupo(codigo);

        // Crear alumnos
        for (int i = 0; i < 5; i++) {

            // Pedir los datos
            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Apellido: ");
            String apellido = br.readLine();
            System.out.print("DNI: ");
            String DNI = br.readLine();
            System.out.print("Teléfono: ");
            String telefono = br.readLine();

            // Instanciar un Alumno
            Alumno a = new Alumno(nombre, apellido, DNI, telefono);

            // Pedir al Grupo que lo guarde
            g.guardameEsteAlumnoPorFavor(a);
        }
    }
}
