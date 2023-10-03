package ej2;

public class MuebleBarato extends Mueble {


    //constructor

    public MuebleBarato(String tipoDeMueble, int peso, String tipoDeMadera, String color, double precioCosto) {
        super(tipoDeMueble, peso, tipoDeMadera, color, precioCosto);
        double nuevoPrecioVenta=getPrecioCosto()+getPrecioCosto()/10;
        setPrecioVenta(nuevoPrecioVenta);   //sobrescribo el precio de venta para el caso de la variable muebleBarato
    }

    //getters y setters

}
