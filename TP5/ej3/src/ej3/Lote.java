package ej3;

import java.util.ArrayList;

public class Lote {
    private int numLote;
    private ArrayList<String> minerales;
    private double superficie;

    //Constructor
    public Lote(int numLote, ArrayList<String>minerales, double superficie){
        this.numLote=numLote;
        this.superficie=superficie;
        this.minerales=new ArrayList<>(minerales);
    }

    //Metodos

    public int getNumLote() {
        return numLote;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>(minerales);
    }

    public double getSuperficie() {
        return superficie;
    }
}
