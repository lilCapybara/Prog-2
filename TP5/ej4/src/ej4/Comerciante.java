package ej4;

public class Comerciante extends Contribuyente{
    private double ventas;
    //Constructor


    public Comerciante(double montoFijo, String nombre, int codigo, double ventas) {
        super(montoFijo, nombre, codigo);
        this.ventas = ventas;
    }

    //Metodos
    public double getRecaudacion(){
        return montoFijo/2+ventas*0.035 ;
    }
}
