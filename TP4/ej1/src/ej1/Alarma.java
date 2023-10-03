package ej1;

public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean movimientoEnCasa;
    Timbre timbre;
    Luz luz;


    //constructor

    public Alarma(boolean vidrioRoto, boolean puertaAbierta, boolean movimientoEnCasa, Timbre timbre, Luz luz) {
        this.vidrioRoto = vidrioRoto;
        this.puertaAbierta = puertaAbierta;
        this.movimientoEnCasa = movimientoEnCasa;
        this.timbre = timbre;
        this.luz = luz;
    }


    //metodos

    public void comprobar(){

        if (vidrioRoto || puertaAbierta || movimientoEnCasa){
            System.out.println("ALARMA ACTIVADA");
            timbre.hacerSonar();
            luz.encender();
        }else{
            System.out.println("No se ha activado la alarma");
        }
        System.out.println("Estado del timbre: "+timbre.getEstado());
        System.out.println("Estado de la luz: "+luz.getEstado());

    }
}
