package ej5;

public class CongeladoPorAgua extends ProductoFrio {
    private double salinidadDeAgua;

    //Constructor
    public CongeladoPorAgua(String nombre, int numLote, String fechaVencimiento, String fechaEnvasado, String granjaDeOrigen, int codigo, int temperaturaDeMantenimiento, double salinidadDeAgua) {
        super(nombre, numLote, fechaVencimiento, fechaEnvasado, granjaDeOrigen, codigo, temperaturaDeMantenimiento);
        this.salinidadDeAgua = salinidadDeAgua;

    }

    //Metodo
    public void getEtiqueta(){
        System.out.println("Nombre:"+nombre+"\b"+"Fecha de vencimiento:"+fechaVencimiento+"\b"+
                "Fecha de emvasado: "+fechaEnvasado+"\b"+"Granja de origen: "+granjaDeOrigen+"\b"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\b"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\b"+"Salinidad del agua: "+salinidadDeAgua);
    }
}
