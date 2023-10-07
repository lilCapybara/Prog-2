package ej5;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>listaDeEmpleados;

    //Constructor
    public Empresa(ArrayList<Empleado>listaDeEmpleados){
        this.listaDeEmpleados=new ArrayList<>(listaDeEmpleados);
    }

    //Metodos
    public void getSalarioTotal(){
        double salarioTotal=0;
        for(Empleado empleado : listaDeEmpleados){
            salarioTotal+= empleado.getSueldo();
        }
        System.out.println("Gasto total: "+salarioTotal);
    }
}
