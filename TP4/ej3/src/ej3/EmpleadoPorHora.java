package ej3;

public class EmpleadoPorHora extends Empleado{
    private int montoPorHora;
    private int horasTrabajadas;

    //constructor

    public EmpleadoPorHora(String nombre, String apellido, int sueldoFijo, int montoPorHora, int horasTrabajadas) {
        super(nombre, apellido, sueldoFijo);
        this.montoPorHora = montoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSueldo() {
        return this.getSueldoFijo()+montoPorHora*horasTrabajadas;
    }
}
