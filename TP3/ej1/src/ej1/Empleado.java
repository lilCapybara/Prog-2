package ej1;

public class Empleado {
    private int numEmpleado;
    private int encuestasRealizadas;

    private final int sueldoBase=1000;
    private final int plusPorEncuesta=100;

    //constructor
    public Empleado(int numEmpleado, int encuestasRealizadas) {
        this.numEmpleado = numEmpleado;
        this.encuestasRealizadas = encuestasRealizadas;
    }

    //getters y setters
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getEncuestasRealizadas() {
        return encuestasRealizadas;
    }

    public void setEncuestasRealizadas(int encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }

    //metodos

    public int getPlus(){
        return encuestasRealizadas*plusPorEncuesta;
    }

    public int getSueldo(){
        return getPlus()+sueldoBase;
    }
}
