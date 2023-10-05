package ej2;

import java.util.ArrayList;

public class CasaPura extends Casa{

    //Contructor
    public CasaPura(ArrayList<Alumno> listaDeAlumnos, int maxAlumnos, ArrayList<String> cualidadesRequeridas) {
        super(listaDeAlumnos, maxAlumnos, cualidadesRequeridas);
    }

    //Metodos
    public boolean isSangrePura(Alumno alumno){
        boolean puro=false;

        for (Alumno familiar : alumno.getFamiliaresMatriculados()){
            if (listaDeAlumnos.contains(familiar)){
                return true;
            }
        }
        return false;
    }

    public void agregarFamiliar(Alumno familiar){
        listaDeAlumnos.add(familiar);
    }

    @Override
    public boolean apto(Alumno alumno) {
        if (!casaLlena() && cumpleCualidades(alumno) && isSangrePura(alumno) && !alumno.isMatriculado()){
            return true;
        }else{
            return false;
        }
    }
}
