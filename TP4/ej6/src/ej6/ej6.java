package ej6;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ej6 {
    public static void main(String[] args) {
        Empleado e1=new Empleado("carlos","perez",23,"cafetero",1235,12345);
        Empleado e2=new Empleado("carlos","gomez",23,"cafetero",1235,12345);
        Empleado e3=new Empleado("Lucas","gimenez",23,"cafetero",1235,12345);

        ArrayList<Empleado>empleadosACargo=new ArrayList<>();
        empleadosACargo.add(e1);
        empleadosACargo.add(e2);
        empleadosACargo.add(e3);

        Empleado j1=new Jerarquico("Luis","Fuentes",23,"cafetero",1235,12345, empleadosACargo);

        j1.getDatos();
    }
}