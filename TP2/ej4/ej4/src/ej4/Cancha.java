package ej4;

import java.util.ArrayList;

public class Cancha {
    private int numeroDeCancha;
    private String TipoDeCancha;
    private ArrayList<Turno> turnos;

    //constructor

    public Cancha(int numeroDeCancha, String tipoDeCancha, ArrayList<Turno> turnos) {
        this.numeroDeCancha = numeroDeCancha;
        TipoDeCancha = tipoDeCancha;
        this.turnos = turnos;
    }

    //getters & setters

    public int getNumeroDeCancha() {
        return numeroDeCancha;
    }

    public void setNumeroDeCancha(int numeroDeCancha) {
        this.numeroDeCancha = numeroDeCancha;
    }

    public String getTipoDeCancha() {
        return TipoDeCancha;
    }

    public void setTipoDeCancha(String tipoDeCancha) {
        TipoDeCancha = tipoDeCancha;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    //metodos

    public void agregarTurno(Turno newTurno){
        turnos.add(newTurno);
    }

    public double getCostoBase(){               //calcula el precio base segun el tipo de cancha
        if (this.getTipoDeCancha()=="paddle"){
            return 100;
        }else{
            return 400;
        }
    }
    public double calcularCosto(Turno turno){   //calcula el precio total segun el descuento que haya
        double descuento=turno.getDescuento();
        double costoBase=this.getCostoBase();

        return costoBase-costoBase*descuento;
    }

}

