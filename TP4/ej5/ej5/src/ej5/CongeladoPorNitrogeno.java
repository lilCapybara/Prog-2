package ej5;

public class CongeladoPorNitrogeno extends ProductoFrio{
    private String metodo;
    private int tiempoDeExposicion;

    //Constructor
    public CongeladoPorNitrogeno(String nombre, int numLote, String fechaVencimiento, String fechaEnvasado, String granjaDeOrigen, int codigo, int temperaturaDeMantenimiento, String metodo, int tiempoDeExposicion) {
        super(nombre, numLote, fechaVencimiento, fechaEnvasado, granjaDeOrigen, codigo, temperaturaDeMantenimiento);
        this.metodo = metodo;
        this.tiempoDeExposicion = tiempoDeExposicion;
    }

    //Metodos
    public void getEtiqueta(){
        System.out.println("Nombre:"+nombre+"\n"+"Fecha de vencimiento:"+fechaVencimiento+"\n"+
                "Fecha de emvasado: "+fechaEnvasado+"\n"+"Granja de origen: "+granjaDeOrigen+"\n"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\n"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\n"+"Metodo de congelacion: "+metodo+"\n"+"Tiempo de exposicion: "+tiempoDeExposicion);
    }
}
