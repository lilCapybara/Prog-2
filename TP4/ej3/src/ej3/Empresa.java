package ej3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaDeEmpleados;

    //constructor

    //public Empresa(ArrayList<Empleado> listaDeEmpleados) {
    //    this.listaDeEmpleados = listaDeEmpleados;
    //}                                                     //ESTE TIPO DE CONSTRUCTOR ROMPE EL ENCAPSULAMIENTO

    public Empresa (ArrayList<Empleado> listaDeEmpleados){
        this.listaDeEmpleados=new ArrayList<>(listaDeEmpleados);    //ESTE CONSTRUCTOR ES EL CORRECTO PARA MANTENER EL ENCAPSULAMIENTO
    }                                                               //YA QUE GENERA UNA COPIA DEL ARREGLO ORIGINAL, NO ACCEDE DIRECTAMENTE A ESTE

    //metodos

    public void addEmpleado(Empleado newEmpleado){
        listaDeEmpleados.add(newEmpleado);
    }

    public void calcularSueldos(){
        for (Empleado empleado : listaDeEmpleados){
            System.out.println(empleado.getNombre()+" "+empleado.getApellido()+": $"+empleado.getSueldo());
        }
    }
}
