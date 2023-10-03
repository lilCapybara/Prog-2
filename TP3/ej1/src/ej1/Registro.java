package ej1;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Encuesta>listaDeEncuestas;

    //constructor

    public Registro(ArrayList<Encuesta> listaDeEncuestas) {
        this.listaDeEncuestas = listaDeEncuestas;
    }

    //getters y setters

    public ArrayList<Encuesta> getListaDeEncuestas() {
        return listaDeEncuestas;
    }

    public void setListaDeEncuestas(ArrayList<Encuesta> listaDeEncuestas) {
        this.listaDeEncuestas = listaDeEncuestas;
    }

    //metodos

    public boolean encuestaRepetida(Encuesta newEncuesta){
        boolean repetido=false;
        for(Encuesta encuesta:listaDeEncuestas){
            if ((newEncuesta.getDni()==encuesta.getDni())&&(newEncuesta.getNumEncuesta()==encuesta.getNumEncuesta())){   //debo comparar los dnis para ver si son la misma persona
                repetido=true;                                                                                           //debo comparar los numero de encuesta para ver si
            }                                                                                                            //la encuesta es la misma
        }
        return repetido;
    }

    public void agregarEncuesta(Encuesta newEncuesta){
        if(!encuestaRepetida(newEncuesta)){     //revisa que la encuesta no este repetida
            listaDeEncuestas.add(newEncuesta);
            newEncuesta.getEmpleado().setEncuestasRealizadas(newEncuesta.getEmpleado().getEncuestasRealizadas()+1); //dentro del parentesis obtengo el numero actual de encuestas
        }                                                                                                           //realizadas por el empleado y le sumo uno

    }
}
