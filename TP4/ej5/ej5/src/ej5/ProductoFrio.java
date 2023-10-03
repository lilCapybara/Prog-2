package ej5;
//Como los productos refrigerados y los congelados tienen los mismos datos, los agrupo en una misma clase
public class ProductoFrio extends Producto {
    protected int codigo;
    protected int temperaturaDeMantenimiento;

    //Contructor


    public ProductoFrio(String nombre, int numLote, String fechaVencimiento, String fechaEnvasado, String granjaDeOrigen, int codigo, int temperaturaDeMantenimiento) {
        super(nombre, numLote, fechaVencimiento, fechaEnvasado, granjaDeOrigen);
        this.codigo = codigo;
        this.temperaturaDeMantenimiento = temperaturaDeMantenimiento;
    }

    //Metodos
    public void getEtiqueta(){
        System.out.println("Nombre:"+nombre+"\b"+"Fecha de vencimiento:"+fechaVencimiento+"\b"+
                "Fecha de emvasado: "+fechaEnvasado+"\b"+"Granja de origen: "+granjaDeOrigen+"\b"+
                "Codigo de org. de supervision alimentaria: "+codigo+"\b"+"Temperatura de mantenimiento:"+temperaturaDeMantenimiento);
    }
}
