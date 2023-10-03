package ej4;

public class Usuario {
    private String nombre;
    private int cant_reservas;

    //constructor
    public Usuario(String nombre, int cant_reservas) {
        this.nombre = nombre;
        this.cant_reservas = cant_reservas;
    }

    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_reservas() {
        return cant_reservas;
    }

    public void setCant_reservas(int cant_reservas) {
        this.cant_reservas = cant_reservas;
    }

    //metodos

    public boolean esSocio(){       //determina si la persona es socia o no
        return cant_reservas>=4;
    }
}


