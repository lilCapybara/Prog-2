package ej6;

public class Empleado extends Persona{
    protected int legajo;
    protected int sueldo;

    //Constructor
    public Empleado(String nombre, String apellido, int edad, String cargo, int legajo, int sueldo) {
        super(nombre, apellido, edad, cargo);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    //Metodos
    public void getDatos(){
        System.out.println("Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Cargo: "+cargo+"\n"+"Legajo: "+legajo+"\n"+"Sueldo: "+sueldo);
    }
}
