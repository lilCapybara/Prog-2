package ej2;

import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        ArrayList<Mueble>stock=new ArrayList<>();   //defino el arreglo que contiene todos los muebles

        Fabrica f1= new Fabrica(stock); //defino la fabrica con su lista de stock

        //creo los muebles
        Mueble m1= new Mueble("silla",15,"pino","rojo", 600);   //no necesito definif precioVenta porque
        Mueble m2= new Mueble("mesa",15,"pino","rojo", 400);    //ya la defini en el constructor
        Mueble mb1= new MuebleBarato("silla",15,"pino","rojo", 600);

        //agrego los muebles a la lista de stock
        stock.add(m1);
        stock.add(m2);
        stock.add(mb1);

        //imprimo los precios de costo y venta total
        System.out.println("Precio de costo total: "+f1.getPrecioCostoTotal());
        System.out.println("Precio de venta total: "+f1.getPrecioVentaTotal());

    }
}