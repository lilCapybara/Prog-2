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
        System.out.println("Nombre:"+nombre+"\b"+"Fecha de vencimiento:"+fechaVencimiento+"\b"+
                "Fecha de emvasado: "+fechaEnvasado+"\b"+"Granja de origen: "+granjaDeOrigen+"\b"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\b"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\b"+"Metodo de congelacion: "+metodo+"\b"+"Tiempo de exposicion: "+tiempoDeExposicion);
    }
}
