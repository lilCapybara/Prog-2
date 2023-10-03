package ej4;

import java.util.ArrayList;

public class main{
    public static void main(String[]args){
        Usuario user=new Usuario("sebas",3);

        ArrayList<Turno> listaDeTurnos=new ArrayList<>(); //creo la lista donde se guardan los turnos
        Turno t1=new Turno(user,15);

        listaDeTurnos.add(t1);


        Cancha c1=new Cancha(2,"futbol",listaDeTurnos);

       System.out.println(c1.calcularCosto(t1));
    }
}