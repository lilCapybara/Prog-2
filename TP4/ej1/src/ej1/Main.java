package ej1;

public class Main {
    public static void main(String[] args) {
        Timbre t1=new Timbre("Desactivado");
        Luz l1=new Luz("Apagada");
        Alarma alarma1=new Alarma(true, false, false, t1,l1);
        alarma1.comprobar();
    }
}