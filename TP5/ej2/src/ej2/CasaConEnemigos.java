package ej2;

import java.util.ArrayList;

public class CasaConEnemigos extends Casa{
    private ArrayList<Casa> casasEnemigas;

    public CasaConEnemigos(ArrayList<Alumno> listaDeAlumnos, int maxAlumnos, ArrayList<String> cualidadesRequeridas, ArrayList<Casa> casasEnemigas) {
        super(listaDeAlumnos, maxAlumnos, cualidadesRequeridas);
        this.casasEnemigas = new ArrayList<>(casasEnemigas);
    }

    public boolean aceptadoPorEnemigo(Alumno alumno){
        boolean apto=false;

        for (Casa casaenemiga:casasEnemigas){
            if (casaenemiga.apto(alumno)){
                return true;
            }
        }
        return apto; //Si llego a esta parte del metodo, significa que no lo acepto ninguna casa enemiga
    }

    @Override
    public boolean apto(Alumno alumno) {
        if (!casaLlena() && cumpleCualidades(alumno) && !aceptadoPorEnemigo(alumno) && !alumno.isMatriculado()){
            return true;
        }else{
            return false;
        }
    }
}
