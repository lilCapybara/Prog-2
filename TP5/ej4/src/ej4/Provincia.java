package ej3;

import java.util.ArrayList;

class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public boolean tieneMasDeLaMitadDeCiudadesEnDeficit() {
        int contadorDeficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.tieneDeficit()) {
                contadorDeficit++;
            }
        }
        return contadorDeficit > ciudades.size() / 2;
    }

    public String getNombre() {
        return nombre;
    }
}
