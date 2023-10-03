package ej4;

import java.util.ArrayList;

public class Contingente {
    private ArrayList<Persona> personal;

    //constructor
    public Contingente(ArrayList<Persona>personal){
        this.personal=new ArrayList<>(personal);
    }

    //metodos

    public void addPersona(Persona newPersona){
        personal.add(newPersona);
    }
}
