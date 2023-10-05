package ej6;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String cargo;

    //Constructor

    public Persona(String nombre, String apellido, int edad, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
    }

    //Metodos
    public abstract void getDatos();

}
