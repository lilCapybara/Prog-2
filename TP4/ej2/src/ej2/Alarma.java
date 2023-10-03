package ej1;

import java.util.ArrayList;
public class Alarma {

    private ArrayList<Sensor> listaDeSensores;
    Timbre timbre;
    Luz luz;


    //constructor

    public Alarma(ArrayList<Sensor> listaDeSensores, Timbre timbre, Luz luz) {
        this.listaDeSensores = listaDeSensores;
        this.timbre = timbre;
        this.luz = luz;
    }


    //metodos

    public void addSensor(Sensor newSensor){
        listaDeSensores.add(newSensor);
    }

    public void comprobar(){
        boolean sensorActivado=false;
        for (int i=0; i<listaDeSensores.size(); i++){
            if (listaDeSensores.get(i).isActivado()){
                sensorActivado=true;
                System.out.println("El sensor de la zona "+listaDeSensores.get(i).getLugar()+" se ha activado");
                luz.encender();
                timbre.hacerSonar();
            }
        }

        if (!sensorActivado){
            System.out.println("No se ha activado ningun sensor");
        }

        System.out.println("El timbre esta "+timbre.getEstado());
        System.out.println("La luz esta "+luz.getEstado());

    }
}
