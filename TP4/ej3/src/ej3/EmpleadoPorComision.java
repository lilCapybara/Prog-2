package ej3;

public class EmpleadoPorComision extends Empleado{
    private int comisionPorVenta;
    private int ventas;

    //cosntructor

    public EmpleadoPorComision(String nombre, String apellido, int sueldoFijo, int comisionPorVenta, int ventas) {
        super(nombre, apellido, sueldoFijo);
        this.comisionPorVenta = comisionPorVenta;
        this.ventas = ventas;
    }

    //metodos
    @Override
    public double getSueldo() {
        return this.getSueldoFijo()+comisionPorVenta*ventas;
    }
}
