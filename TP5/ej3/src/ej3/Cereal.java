package ej3;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesRequeridos;

    //Contructor
    public Cereal(String nombre, ArrayList<String> mineralesRequeridos){
        this.nombre=nombre;
        this.mineralesRequeridos=new ArrayList<>(mineralesRequeridos);
    }

    //Metodos
    public ArrayList<String> getMineralesRequeridos() {
        return new ArrayList<>(mineralesRequeridos);
    }

    public String getNombre() {
        return nombre;
    }
}
