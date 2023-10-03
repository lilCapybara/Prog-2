package ej3;

public class PuntoGeometrico{
    private double coordenadaX;
    private double coordenadaY;

    //constructores

    public PuntoGeometrico(double coordenadaX, double coordenadaY){
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
    }

    public PuntoGeometrico(){
        coordenadaX=0;
        coordenadaY=0;
    }

    //get y set


    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    //metodos

    public void desplazoPto(double incrementoX, double incrementoY){
        coordenadaX=incrementoX;
        coordenadaY=incrementoY;
    }

    public double distanciaE(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}