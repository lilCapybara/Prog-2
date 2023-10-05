package ej2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiaresMatriculados;

    private boolean matriculado; //Me permite controlar si el alumno esta o no en una casa

    //Constructor
    public Alumno (String nombre, ArrayList<String> cualidades, ArrayList<Alumno> familiaresMatriculados, boolean matriculado){
        this.nombre=nombre;
        this.cualidades=new ArrayList<>(cualidades);
        this.familiaresMatriculados=new ArrayList<>(familiaresMatriculados);
        this.matriculado=matriculado;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public ArrayList<Alumno> getFamiliaresMatriculados() {
        return new ArrayList<>(familiaresMatriculados);
    }

    public boolean isMatriculado(){
        return matriculado;
    }

    public void setMatricula(boolean valor){
        matriculado=valor;
    }

}
