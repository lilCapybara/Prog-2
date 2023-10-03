package ej3;

public class Empleado {
    private String nombre;
    private String apellido;
    private int sueldoFijo;

    //cosntructor

    public Empleado(String nombre, String apellido, int sueldoFijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoFijo = sueldoFijo;
    }

    //metodos


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public double getSueldo(){
        return getSueldoFijo();
    }
}
