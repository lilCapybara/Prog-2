package ej1;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args){

        Empleado e1=new Empleado(1,5);  //creo un empleado

        Encuesta q1=new Encuesta("carlos",39804501,6,e1);   //creo una encuesta
        Encuesta q2=new Encuesta("Maria",39804501,5,e1);

        ArrayList<Encuesta>listaDeEncuestas=new ArrayList<>();  //creo la lista que contiene a las encuestas

        Registro registro=new Registro(listaDeEncuestas);
        registro.agregarEncuesta(q1);
        registro.agregarEncuesta(q2);


        System.out.println(q1.getEmpleado().getSueldo());
    }
}