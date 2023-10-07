package ej6;

import java.util.ArrayList;

public class Congreso {
    private ArrayList<Evaluador>listaDeEvaluadores;
    private ArrayList<String>temasGenerales;
    private ArrayList<String>temasEspecificos;

    //Constructor
    public Congreso(ArrayList<Evaluador>listaDeEvaluadores){
        this.listaDeEvaluadores=new ArrayList<>(listaDeEvaluadores);
    }

}
