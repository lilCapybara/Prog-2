package ej6;

import java.util.ArrayList;

public class Jerarquico extends Empleado{
    private ArrayList<Empleado>empleadosACargo;

    //Constructor

    public Jerarquico(String nombre, String apellido, int edad, String cargo, int legajo, int sueldo, ArrayList<Empleado> empleadosACargo) {
        super(nombre, apellido, edad, cargo, legajo, sueldo);
        this.empleadosACargo = new ArrayList<>(empleadosACargo); //Creo una copia del arreglo original
    }

    //Metodos
    public void agregarEmpleadoACargo(Empleado newEmpleado){
        empleadosACargo.add(newEmpleado);
    }

    public ArrayList<Empleado> getEmpleadosACargo(){
        return new ArrayList<>(empleadosACargo);
    }

    public void getDatos(){
        System.out.println("Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Cargo: "+cargo+"\n"+"Legajo: "+legajo+"\n"+"Sueldo: "+sueldo+"\n");
        System.out.println("Lista de empleados a su cargo:"+"\n");
        for (Empleado empleado: empleadosACargo){
            empleado.getDatos();
            System.out.println("\n");
        }
    }

}
