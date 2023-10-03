package ej2;

public class Mueble {
    private String tipoDeMueble;
    private int peso;
    private String tipoDeMadera;
    private String color;
    private double precioCosto;
    private double precioVenta;

    //constructor
    public Mueble(String tipoDeMueble, int peso, String tipoDeMadera, String color, double precioCosto) {
        this.tipoDeMueble = tipoDeMueble;
        this.peso = peso;
        this.tipoDeMadera = tipoDeMadera;
        this.color = color;
        this.precioCosto = precioCosto;
        this.precioVenta = precioCosto + precioCosto *0.3; //defino el valor de la variable en el constructor
    }

    //getters y setters

    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public void setTipoDeMueble(String tipoDeMueble) {
        this.tipoDeMueble = tipoDeMueble;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoDeMadera() {
        return tipoDeMadera;
    }

    public void setTipoDeMadera(String tipoDeMadera) {
        this.tipoDeMadera = tipoDeMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta){
        this.precioVenta=precioVenta;
    }


}


