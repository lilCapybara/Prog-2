package ej5;

public class PagoFijo extends FormaDePago {

    public PagoFijo(double sueldo) {
        super(sueldo);
    }

    public double getSueldo(){
        return sueldo;
    }
}
