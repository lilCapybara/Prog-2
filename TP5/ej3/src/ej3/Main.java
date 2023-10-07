package ej3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lote>listaDeLotes=new ArrayList<>();
        ArrayList<Cereal>listaDeCereales=new ArrayList<>();
        ArrayList<String>mineralesPrimarios=new ArrayList<>();


        ArrayList<String>minerales=new ArrayList<>();
        minerales.add("Calcio");
        minerales.add("Hierro");

        ArrayList<String>mineralesPobre=new ArrayList<>();
        mineralesPobre.add("Sal");

        Lote l1=new Lote(1, minerales, 99);

        Lote l2=new Lote(79, mineralesPobre, 1800);

        Cereal c1=new Cereal("Soja", minerales);

        Cereal c2=new Pastura("Trebol",minerales);
        listaDeCereales.add(c1);
        listaDeCereales.add(c2);
        listaDeLotes.add(l1);
        listaDeLotes.add(l2);

        Empresa carlitosSRL= new Empresa(listaDeLotes,listaDeCereales,mineralesPrimarios);

        carlitosSRL.cerealesAptosParaLote(l1);
        carlitosSRL.lotesAptosParaCereal(c2);

    }
}