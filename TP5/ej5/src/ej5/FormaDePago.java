package ej5;

public abstract class FormaDePago {
    protected double sueldo;

    //Constructor

    public FormaDePago(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodos
    public abstract double getSueldo();
}
