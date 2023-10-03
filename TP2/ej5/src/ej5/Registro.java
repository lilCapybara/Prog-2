package ej5;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Turno> turnos;

    //constructor

    public Registro(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }


    //getters y setters

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    //metodos

    public void AgregarTurno(Turno newTurno){
        turnos.add(newTurno);
    }

    public Turno turnoDisponible() {
        for (Turno turno : turnos) {
            if (turno.getCliente() == null) {   //si no hay cliente anotado, significa que el turno esta vacio
                return turno;
            }
        }
        return null; // Si no se encuentra un turno disponible, devuelve null
    }

    public Integer turnoPeluqueroDisponible(int peluqueroBuscado) {

        boolean turnoEncontrado = false;
        for (Turno turno : turnos) {
            if (turno.getPeluquero() != peluqueroBuscado) {    //tiene que ser turno, ya que estoy mirando la instancia de turnos, no todo el arreglo
                turnoEncontrado = true;
                return turno.getHora();     //Devuelve la hora del turno disponible
            }
        }
        return null; // Si no se encuentra un turno, devuelve null

    }

}
