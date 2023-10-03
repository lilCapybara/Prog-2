package ej1;
import java.util.ArrayList;
public class Encuesta {
    private String personaEncuestada;
    private int dni;
    private int numEncuesta;
    private Empleado empleado;

    //constructor

    public Encuesta(String personaEncuestada, int dni, int numEnuesta, Empleado empleado) {
        this.personaEncuestada = personaEncuestada;
        this.dni = dni;
        this.numEncuesta = numEnuesta;
        this.empleado = empleado;
    }

    //getters y setters


    public String getPersonaEncuestada() {
        return personaEncuestada;
    }

    public void setPersonaEncuestada(String personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumEncuesta() {
        return numEncuesta;
    }

    public void setNumEnuesta(int numEnuesta) {
        this.numEncuesta = numEnuesta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
