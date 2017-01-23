package com.jaureguialzo;

/**
 * Created by widemos on 19/1/17.
 */
public class Grupo {

    // PROPIEDADES
    private String codigo;

    // MANTENIMIENTO DE LA ASOCIACIÓN
    private Alumno[] alumnos = new Alumno[5];   // Lado 1

    // OTROS
    private int numAlumnos = 0;

    public Grupo() {
    }

    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "codigo='" + codigo + '\'' +
                '}';
    }


    /**
     * Almacena un objeto de tipo Alumno en el array de objetos
     *
     * @param a El alumno a guardar
     */
    public void guardameEsteAlumnoPorFavor(Alumno a) {

        // Comprobamos si cabe
        if(numAlumnos < 5 ) {

            // Conectamos los dos extremos de la asociación
            alumnos[numAlumnos] = a;    // Ida (Grupo->Alumno)
            a.setGrupo(this);           // Vuelta (Alumno->Grupo)

            // Actualizamos el recuento
            numAlumnos += 1;
        } else {
            System.err.println("ERROR: No caben más alumnos...");
        }
    }


}
