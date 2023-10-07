package ej4;

public class ContribuyenteSimple extends Contribuyente {

    //Contructor


    public ContribuyenteSimple(double montoFijo, String nombre, int codigo) {
        super(montoFijo, nombre, codigo);
    }

    public double getRecaudacion() {
        return montoFijo;
    }

}
