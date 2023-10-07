package ej4;
import java.util.ArrayList;
public class Ciudad {
    private String nombre;
    private int poblacion;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastoMantenimiento;

    private ArrayList<Contribuyente> listaDeContribuyentes;

    public Ciudad(String nombre, int poblacion, double imp1, double imp2, double imp3, double imp4, double imp5, double gastoMantenimiento, ArrayList<Contribuyente>listaDeContribuyentes) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastoMantenimiento = gastoMantenimiento;
        this.listaDeContribuyentes=new ArrayList<>(listaDeContribuyentes);
    }

    public double getTotalRecaudado() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public double getSaldo() {
        return getTotalRecaudado() - gastoMantenimiento;
    }

    public boolean tieneDeficit() {
        return getSaldo() < 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void getTotalDeRecaudacion(){
        double recaudacion=0;
        for(Contribuyente persona : listaDeContribuyentes){
            recaudacion+=persona.getRecaudacion();
        }
        System.out.println("Recaudacion total: "+recaudacion);
    }
}

