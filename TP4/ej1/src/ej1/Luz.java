package ej1;

public class Luz {
    private  String estado;

    //constructor
    public Luz(String estado) {
        this.estado = estado;
    }

    //metodos


    public String getEstado() {
        return estado;
    }

    public void encender(){
        estado="Encendida";
    }

}
