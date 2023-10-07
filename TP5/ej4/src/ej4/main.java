package ej4;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        // Crear ciudades y provincias
/*
        Ciudad ciudad1 = new Ciudad("Ciudad1", 150000, 50000, 30000, 20000, 40000, 25000, 120000);
        Ciudad ciudad2 = new Ciudad("Ciudad2", 5, 5, 5, 5, 35000, 22000, 90000);
        Ciudad ciudad3 = new Ciudad("Ciudad3", 5, 5, 5, 5, 5, 4, 110000);

        Provincia provincia1 = new Provincia("Provincia1");
        provincia1.agregarCiudad(ciudad1);
        provincia1.agregarCiudad(ciudad2);

        Provincia provincia2 = new Provincia("Provincia2");
        provincia2.agregarCiudad(ciudad3);

        ArrayList<Provincia> provincias = new ArrayList<>();
        provincias.add(provincia1);
        provincias.add(provincia2);

        // Calcular ciudades en déficit y provincias con más de la mitad de ciudades en déficit
        ArrayList<String> ciudadesEnDeficit = new ArrayList<>();
        ArrayList<String> provinciasConMasDeLaMitadEnDeficit = new ArrayList<>();

        for (Provincia provincia : provincias) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.tieneDeficit()) {
                    ciudadesEnDeficit.add(ciudad.getNombre());
                }
            }

            if (provincia.tieneMasDeLaMitadDeCiudadesEnDeficit()) {
                provinciasConMasDeLaMitadEnDeficit.add(provincia.getNombre());
            }
        }

        // Mostrar resultados
        System.out.println("Ciudades en déficit:");
        for (String nombreCiudad : ciudadesEnDeficit) {
            System.out.println(nombreCiudad);
        }

        System.out.println("\nProvincias con más de la mitad de ciudades en déficit:");
        for (String nombreProvincia : provinciasConMasDeLaMitadEnDeficit) {
            System.out.println(nombreProvincia);
        }
*/
        Contribuyente c1=new ContribuyenteSimple(1000,"Carlos",4523);
        Contribuyente c2=new Comerciante(1000,"Carlos",4523, 1000);
        Contribuyente c3=new Programador(1000,"Carlos",4523, 1000);
        ArrayList<Contribuyente>listaDeContribuyentes=new ArrayList<>();
        listaDeContribuyentes.add(c1);
        listaDeContribuyentes.add(c2);
        listaDeContribuyentes.add(c3);

        Ciudad ciudad1 = new Ciudad("Ciudad1", 150000, 50000, 30000, 20000, 40000, 25000, 120000, listaDeContribuyentes);
        ciudad1.getTotalDeRecaudacion();
    }
}