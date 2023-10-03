package ej1;

import java.util.ArrayList;

public class Temporada {

    private int numeroDeTemporada
    private ArrayList<episodio>episodios; //Lista con todos los episodios de la temporada

    //constructor

    public Temporada(episodio episodio, int numeroDeTemporada) {
        super();
        episodios= new ArrayList<Episodio>(); //Para cada temporada se crea una lista de episodios
        this.numeroDeTemporada=numeroDeTemporada;
    }

    //getters y setters

    public int getNumeroDeTemporada() {
        return numeroDeTemporada;
    }

    public void setNumeroDeTemporada(int numeroDeTemporada) {
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public ArrayList<episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<episodio> episodios) {
        this.episodios = episodios;
    }


    //metodos

    public int cantidadEpisodios(){
        return episodios.size();
    }

    public int episodiosVistosEnTemporada(){
        int contador=0;
        for (i=0, i<=episodios.size(), i++){
            if (episodios.get(i).isVisto()){    //episodios.get(i) es un episodio.==> .isVisto() es un metodo de Episodio.
                contador++;
            }
        }
        return contador;
    }

    public double promedioTemporada(){
        int contador=0; //cuenta la cantidad de episodios vistos
        int calificacionTotal=0;    //cuenta la suma de calificacion de los episodios vistos
        for (i=0; i<=episodios.size(); i++){
            if episodios.get(i).getCalificacion()!=-1{  //primero obtengo el episodio i, luego obtengo la calificaicon de este
               calificacionTotal+=contador+=episodios.get(i).getCalificacion();
               contador++;
            }
        }
        return calificacionTotal/contador;
    }
}