package ej3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado>listaDeEmpleados=new ArrayList<>();

        Empresa carlitos_SRL=new Empresa(listaDeEmpleados);

        Empleado e1=new Empleado("Carlos","Perez",1500);
        Empleado e2=new EmpleadoPorComision("Carlos","Sanchez",1500,300,10);
        Empleado e3=new EmpleadoPorHora("Carlos","Rodriguez",1500,150,10); //no puede ser EmpleadoPorHora e3=new Empleado
                                                                                                                        //ya que Empleado no hereda de epleado por hora
        carlitos_SRL.addEmpleado(e1);
        carlitos_SRL.addEmpleado(e2);
        carlitos_SRL.addEmpleado(e3);

        carlitos_SRL.calcularSueldos();
    }
}