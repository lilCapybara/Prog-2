package ej1;

public class Timbre {
    private String estado;
    //constructor

    public Timbre(String estado) {
        this.estado = estado;
    }


    //metodos


    public String getEstado() {
        return estado;
    }

    public void hacerSonar(){
        estado="Activado";
    }

}
