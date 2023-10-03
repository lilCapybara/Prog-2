package ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto>listaDeContactos=new ArrayList<>();

        Agenda a1=new Agenda(listaDeContactos);

        Contacto c1=new Contacto("carlos","perez",45,"2494690263","Tandil");
        Contacto c2=new Contacto("carlos","perez",89,"2494690263","Tandil");
        Contacto c3=new Contacto("carlos","perez",18,"2494690263","Tandil");

        listaDeContactos.add(c1);
        listaDeContactos.add(c2);
        listaDeContactos.add(c3);

        System.out.println("Promedio de edad: "+a1.getPromedioEdad());
        System.out.println("Lista de contactos:");
        //a1.mostrarContactos();

        a1.getContactosRepetidos();
    }
}