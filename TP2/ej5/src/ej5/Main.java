package ej5;

import java.util.ArrayList;

public class Main{
    public static void main (String[]args){


        Cliente c1=new Cliente("Sebastian",3);
        Cliente c2=new Cliente("Carlos",0);

        Turno t1= new Turno(c1,2,5,13);
        Turno t2= new Turno(c2,1,4,12);

        ArrayList<Turno>listaDeTurnos=new ArrayList<>();
        listaDeTurnos.add(t1);

        Registro registro=new Registro(listaDeTurnos);
        registro.AgregarTurno(t1);
        registro.AgregarTurno(t2);




        System.out.println(registro.turnoPeluqueroDisponible(2));
        System.out.println(registro.turnoDisponible());
        System.out.println(registro.getTurnos().get(2).getCostoTotal());




    }
}