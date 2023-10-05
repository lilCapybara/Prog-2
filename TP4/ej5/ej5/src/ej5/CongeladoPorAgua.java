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
        System.out.println("Nombre:"+nombre+"\n"+"Fecha de vencimiento:"+fechaVencimiento+"\n"+
                "Fecha de emvasado: "+fechaEnvasado+"\n"+"Granja de origen: "+granjaDeOrigen+"\n"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\n"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento
                +"\n"+"Salinidad del agua: "+salinidadDeAgua);
    }
}
