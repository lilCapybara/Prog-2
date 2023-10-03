package ej1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Timbre t1=new Timbre("Desactivado");
        Luz l1=new Luz("Apagada");

        ArrayList<Sensor>listaDeSensores=new ArrayList<>();

        Sensor s1=new Sensor("Patio", true);
        Sensor s2=new Sensor("Baño", false);



        Alarma alarma1=new Alarma(listaDeSensores, t1,l1);

        alarma1.addSensor(s1);
        alarma1.addSensor(s2);

        alarma1.comprobar();
    }
}