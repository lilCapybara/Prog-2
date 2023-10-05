package ej2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cualidadesRavenclaw=new ArrayList<>();
        cualidadesRavenclaw.add("Curiosidad");
        cualidadesRavenclaw.add("Sabiduria");

        ArrayList<Alumno> alumnosRavenclaw=new ArrayList<>();
        Casa ravenclaw=new Casa(alumnosRavenclaw,2, cualidadesRavenclaw);

        ArrayList<String> cualidadesSebas= new ArrayList<>();
        cualidadesSebas.add("Sabiduria");
        cualidadesSebas.add("Curiosidad");
        cualidadesSebas.add("Humildad");
        cualidadesSebas.add("Bondad");
        cualidadesSebas.add("Ambicion");
        cualidadesSebas.add("Maldad");
        ArrayList<Alumno> familiaresSebas= new ArrayList<>();

        Alumno a1=new Alumno("Sebas", cualidadesSebas, familiaresSebas, false);
        familiaresSebas.add(a1);

        //ravenclaw.agregarAlumno(a1);


        ArrayList<String> cualidadesHufflepuff= new ArrayList<>();
        cualidadesHufflepuff.add("Humildad");
        cualidadesHufflepuff.add("Bondad");

        ArrayList<Casa>enemigosDeHufflepuff=new ArrayList<>();
        enemigosDeHufflepuff.add(ravenclaw);

        CasaConEnemigos hufflepuff=new CasaConEnemigos(alumnosRavenclaw, 1, cualidadesHufflepuff, enemigosDeHufflepuff);
        //hufflepuff.agregarAlumno(a1);


        ArrayList<String> cualidadesSlytherin= new ArrayList<>();
        cualidadesSlytherin.add("Ambicion");
        cualidadesSlytherin.add("Maldad");


        CasaPura slytherin= new CasaPura(alumnosRavenclaw, 3, cualidadesSlytherin);
        slytherin.agregarFamiliar(a1); //Seria imposible agregar a alguien en casaPura si la casa esat vacia, asi que uso este metodo para agregar a la primer persona

        Alumno a2=new Alumno("Malfoy", cualidadesSebas, familiaresSebas, false);

        slytherin.agregarAlumno(a2);
    }
}