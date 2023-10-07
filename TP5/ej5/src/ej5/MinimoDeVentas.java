package ej5;

public class MinimoDeVentas extends FormaDePago{
    private int cantVentas;
    private int minVentas;
    private double bono;

    //Constructor
    public MinimoDeVentas(double sueldo, int cantVentas, int minVentas, double bono) {
        super(sueldo);
        this.cantVentas = cantVentas;
        this.minVentas = minVentas;
        this.bono = bono;
    }

    //Metodos
    public double getSueldo(){
        if(cantVentas>=minVentas){
            return sueldo+bono;
        }else{
            return sueldo;
        }
    }
}
