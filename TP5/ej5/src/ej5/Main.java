package ej5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado e1=new Empleado("Carlos","Perez",1234567, 1000, new MinimoDeVentas(1000, 20,10,2000));
        Empleado e2=new Empleado("Carlos","Perez",1234567, 1000, new PorcentajeDeVenta(1000, 1000,0.5));
        Empleado e3=new Empleado("Carlos","Perez",1234567, 1000, new PagoFijo(1000));
        ArrayList<Empleado>listaDeEmpleados=new ArrayList<>();
        listaDeEmpleados.add(e1);
        listaDeEmpleados.add(e2);
        listaDeEmpleados.add(e3);
        Empresa carlitosSRL=new Empresa(listaDeEmpleados);

        carlitosSRL.getSalarioTotal();
    }
}