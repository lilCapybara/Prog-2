package ej2;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Mueble> stock;


    //constructor
    public Fabrica(ArrayList<Mueble> stock) {
        this.stock = stock;
    }

    //metodos

    public void agregarMueble(Mueble newMueble){
        stock.add(newMueble);
    }

    public double getPrecioCostoTotal(){
        double total=0;
        for (Mueble mueble:stock){
            total+=mueble.getPrecioCosto();
        }
        return total;
    }

    public double getPrecioVentaTotal(){
        double total=0;
        for (Mueble mueble:stock){
            total+=mueble.getPrecioVenta();
        }
        return total;
    }


}
