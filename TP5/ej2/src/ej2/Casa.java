package ej2;

import java.util.ArrayList;

public class Casa {
    protected ArrayList<Alumno> listaDeAlumnos;
    protected int maxAlumnos;
    protected ArrayList<String> cualidadesRequeridas;


    //Constructor
    public Casa (ArrayList<Alumno>listaDeAlumnos, int maxAlumnos, ArrayList<String> cualidadesRequeridas){
        this.listaDeAlumnos=new ArrayList<Alumno>(listaDeAlumnos);
        this.cualidadesRequeridas=new ArrayList<>(cualidadesRequeridas);
        this.maxAlumnos=maxAlumnos;
    }

    //Metodos
    public boolean casaLlena(){         //Verifica si la casa ya esta llena
        return listaDeAlumnos.size()==maxAlumnos;
    }

    public boolean cumpleCualidades(Alumno alumno){
        boolean apto=true;

        for(String cualidad: cualidadesRequeridas) {
            if (!alumno.getCualidades().contains(cualidad)) { //Si la cualidad requerida no esta contenida en la lista de cualidades del alumno, me da false
                return false;
            }
        }
        return apto; //Si llega a este punto, significa que el alumno posee las cualidades y apto se mantuvo como true
    }

    public boolean apto(Alumno alumno) {
        if (!casaLlena() && cumpleCualidades(alumno) && !alumno.isMatriculado()){
            return true;
        }else{
            return false;
        }
    }

    public void agregarAlumno(Alumno newAlumno){
        if (apto(newAlumno)){
            listaDeAlumnos.add(newAlumno);
            newAlumno.setMatricula(true);
            System.out.println("Alumno agregado");
        }else{
            System.out.println("El alumno no es apto para entrar a la casa");
        }
    }
}
