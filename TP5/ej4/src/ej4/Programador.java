package ej4;

public class Programador extends Contribuyente{
    private double ingresosSoftware;

    //Constructor


    public Programador(double montoFijo, String nombre, int codigo, double ingresosSoftware) {
        super(montoFijo, nombre, codigo);
        this.ingresosSoftware = ingresosSoftware;
    }

    public double getRecaudacion(){
        return montoFijo*0.2+ingresosSoftware*0.02;
    }
}
