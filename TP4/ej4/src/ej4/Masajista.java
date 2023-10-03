package ej4;

import java.util.ArrayList;

public class Masajista extends Persona{
    private String titulo;
    private int añosDeExperiencia;

    //cosntructor

    public Masajista(String nombre, String apellido, int numeroPasaporte, int nacimiento, ArrayList<String> estado, String titulo, int añosDeExperiencia) {
        super(nombre, apellido, numeroPasaporte, nacimiento, estado);
        this.titulo = titulo;
        this.añosDeExperiencia = añosDeExperiencia;
    }
}
