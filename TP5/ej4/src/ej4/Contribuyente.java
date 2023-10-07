package ej4;

public abstract class Contribuyente {
    protected String nombre;
    protected int codigo;
    protected double montoFijo;

    //Constructor

    public Contribuyente(double montoFijo, String nombre, int codigo) {
        this.montoFijo = montoFijo;
    }

    //Metodos
    public abstract double getRecaudacion();
}
