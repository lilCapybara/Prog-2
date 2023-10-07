package ej5;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldo;
    private FormaDePago formaDePago;

    //Constructor

    public Empleado(String nombre, String apellido, int dni, double sueldo, FormaDePago formaDePago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.formaDePago = formaDePago;
    }

    public double getSueldo(){
        return formaDePago.getSueldo();
    }
}
