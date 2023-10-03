package ej5;

public class CongeladoPorAire extends ProductoFrio {
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoDeCarbono;
    private double vaporDeAgua;

    //Constructor
    public CongeladoPorAire(String nombre, int numLote, String fechaVencimiento, String fechaEnvasado, String granjaDeOrigen, int codigo, int temperaturaDeMantenimiento, double nitrogeno, double oxigeno, double dioxidoDeCarbono, double vaporDeAgua) {
        super(nombre, numLote, fechaVencimiento, fechaEnvasado, granjaDeOrigen, codigo, temperaturaDeMantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    //Metodos
    public void getEtiqueta(){
        System.out.println("Nombre:"+nombre+"\b"+"Fecha de vencimiento:"+fechaVencimiento+"\b"+
                "Fecha de emvasado: "+fechaEnvasado+"\b"+"Granja de origen: "+granjaDeOrigen+"\b"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\b"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\b"+"Porcentaje de nitrogeno:"+nitrogeno +"\b"+"Porcentaje de oxigeno:"+oxigeno +"\b"+"Porcentaje de dioxido de carbono:"+dioxidoDeCarbono
                +"\b"+"Porcentaje de Vapor de agua:"+vaporDeAgua);
    }
}
