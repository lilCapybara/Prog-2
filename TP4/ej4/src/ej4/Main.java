package ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona>personal=new ArrayList<>();

        ArrayList<String>e1=new ArrayList<>();
        e1.add("Concentrado");

        ArrayList<String>e2=new ArrayList<>();
        e2.add("En pais de origen");


        Persona jugador1=new Futbolista("Carlos","sanchez",12365489,1987, e1,"Delantero","Izquierdo",35);
        Persona entrenador1=new Entrenador("Carlos","sanchez",12365489,1987, e2,"Conmebol");

        Contingente c1=new Contingente(personal);

        c1.addPersona(jugador1);
        c1.addPersona(entrenador1);

        jugador1.isDisponible();
    }
}