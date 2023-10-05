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
        System.out.println("Nombre:"+nombre+"\n"+"Fecha de vencimiento:"+fechaVencimiento+"\n"+
                "Fecha de emvasado: "+fechaEnvasado+"\n"+"Granja de origen: "+granjaDeOrigen+"\n"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\n"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\n"+"Porcentaje de nitrogeno:"+nitrogeno +"\n"+"Porcentaje de oxigeno:"+oxigeno +"\n"+"Porcentaje de dioxido de carbono:"+dioxidoDeCarbono
                +"\n"+"Porcentaje de Vapor de agua:"+vaporDeAgua);
    }
}
