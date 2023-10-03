package ej5;

public class Cliente {
    private String nombre;
    private int cantTurnos;

    //constructor
    public Cliente(String nombre, int cantTurnos) {
        this.nombre = nombre;
        this.cantTurnos = cantTurnos;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantTurnos() {
        return cantTurnos;
    }

    public void setCantTurnos(int cantTurnos) {
        this.cantTurnos = cantTurnos;
    }

    //metodos

    public boolean esClienteFrecuente(){
        return cantTurnos >= 1;
    }


}

