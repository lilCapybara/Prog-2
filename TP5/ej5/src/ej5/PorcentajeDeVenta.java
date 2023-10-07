package ej5;

public class PorcentajeDeVenta extends FormaDePago{

    public double ventas;
    public double comisionPorVenta; //Es un porcentaje

   //Constructor
    public PorcentajeDeVenta(double sueldo, double ventas, double comisionPorVenta) {
        super(sueldo);
        this.ventas = ventas;
        this.comisionPorVenta = comisionPorVenta;
    }

    //Metodos
    public  double getSueldo(){
        return sueldo+ventas*comisionPorVenta;
    }
}
