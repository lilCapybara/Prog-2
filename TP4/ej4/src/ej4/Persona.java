package ej4;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroPasaporte;
    private int nacimiento;
    private ArrayList <String> estado;

    //constructor

    public Persona(String nombre, String apellido, int numeroPasaporte, int nacimiento, ArrayList<String> estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroPasaporte = numeroPasaporte;
        this.nacimiento = nacimiento;
        this.estado=new ArrayList<>(estado);
    }


    //metodos

    public ArrayList<String>getEstado(){
        return new ArrayList<>(estado); //Devuelve una copia del arreglo original (evito romper el encapsulamiento)
    }

    public void addEstado(String newEstado){
        estado.add(newEstado);
    }
    public boolean isDisponible(){
        if (estado.contains("En pais de origen") && !estado.contains("Concentrado")){
            System.out.println("Esta disponible");
            return true;
        }else{
            System.out.println("No esta disponible");
            return false;
        }
    }
}

