package ej4;

import java.util.ArrayList;

public class Entrenador extends Persona{
    private String federacion;

    //constructor

    public Entrenador(String nombre, String apellido, int numeroPasaporte, int nacimiento, ArrayList<String> estado, String federacion) {
        super(nombre, apellido, numeroPasaporte, nacimiento, estado);
        this.federacion = federacion;
    }
}
