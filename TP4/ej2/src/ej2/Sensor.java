package ej1;

public class Sensor {
    private String lugar;
    private boolean activado;

    //constructor
    public Sensor(String lugar, boolean activado) { //no es necesario el constructor para activado, ya que tiene un valor por defecto
        this.lugar = lugar;
        this.activado=activado;
    }

    //metodos

    public boolean isActivado() {
        return activado;
    }

    public String getLugar() {
        return lugar;
    }
}
