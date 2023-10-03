package ej1;

import java.util.ArrayList;

public class Serie{
    private string titulo;
    private string creador;
    private string genero;
    private string descripcion;
    private ArrayList<temporada>temporadas;  //entre llaves va el tipo de la variable

    //constructor


    public Serie(string titulo, string creador, string genero, string descripcion, temporada temporada) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.descripcion = descripcion;
        temporadas= new ArrayList<Temporada>();
    }

    //getters y setters


    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getCreador() {
        return creador;
    }

    public void setCreador(string creador) {
        this.creador = creador;
    }

    public string getGenero() {
        return genero;
    }

    public void setGenero(string genero) {
        this.genero = genero;
    }

    public string getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(string descripcion) {
        this.descripcion = descripcion;
    }

    public temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(temporada temporada) {
        this.temporada = temporada;
    }

    //metodos
    public double promedioSerie(){
        int sumaPromedios=0;
        int contador=0;
        for (i=0; i<temporadas.size(); i++){
            contador+=temporadas.get(i).episodiosVistosEnTemporada();
            sumaPromedios+=temporadas.get(i).promedioTemporada(); //obtengo la temporada i y luego su promedio
        }
        return sumaPromedios/contador;
    }

    public boolean vioTodo(){
        int episodiosVistos=0;
        int episodiosTotales=0;
        for (i=0; i<temporadas.size(); i++){
            episodiosTotales+=temporadas.cantidadEpisodios(i);
            episodiosVistos+=temporadas.get(i).episodiosVistosEnTemporada();
        }
        if (episodiosTotales==episodiosVistos){
            return true;
        }else{
            return false;
        }
    }
}