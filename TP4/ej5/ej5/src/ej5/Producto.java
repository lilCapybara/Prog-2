package ej5;

public class Producto {

    protected String nombre;
    protected int numLote;
    protected String fechaVencimiento;
    protected String fechaEnvasado;
    protected String granjaDeOrigen;

    //Contructor

    public Producto(String nombre, int numLote, String fechaVencimiento, String fechaEnvasado, String granjaDeOrigen) {
        this.nombre=nombre;
        this.numLote = numLote;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaDeOrigen = granjaDeOrigen;
    }

    //Metodos

    public void getEtiqueta(){
        System.out.println("Nombre:"+nombre+"\b"+"Fecha de vencimiento:"+fechaVencimiento+"\b"+
                "Fecha de emvasado: "+fechaEnvasado+"\b"+"Granja de origen: "+granjaDeOrigen);
    }

}
