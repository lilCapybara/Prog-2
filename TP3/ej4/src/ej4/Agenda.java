package ej4;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> listaDeContactos;

    //constructor
    public Agenda(ArrayList<Contacto> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }

    //metodos

    public void mostrarContactos(){
        for (Contacto contacto:listaDeContactos){
            System.out.println("Nombre: "+contacto.getNombre());
            System.out.println("Apellido: "+contacto.getApellido());
            System.out.println("Edad: "+contacto.getEdad());
            System.out.println("Telefono: "+contacto.getNumeroTelefono());
            System.out.println("Ciudad: "+contacto.getCiudad());

        }
    }

    public double getPromedioEdad(){
        double edadTotal=0;

        for(Contacto contacto:listaDeContactos){
            edadTotal+= contacto.getEdad();
        }
        return edadTotal/listaDeContactos.size();
    }

    public void getContactosRepetidos(){
        ArrayList<Contacto>contactosRepetidos=new ArrayList<>();
        for(int i=0; i<listaDeContactos.size();i++){
            for (int j=i+1; j<listaDeContactos.size();j++){
                if ((listaDeContactos.get(i).getNombre().equals(listaDeContactos.get(j).getNombre()))&&(listaDeContactos.get(i).getApellido().equals(listaDeContactos.get(j).getApellido()))&&(listaDeContactos.get(i).getNumeroTelefono().equals(listaDeContactos.get(j).getNumeroTelefono()))){
                    for (Contacto contacto:contactosRepetidos){
                        if ((!listaDeContactos.get(j).getNombre().equals(contacto.getNombre()))&&(!listaDeContactos.get(j).getApellido().equals(contacto.getApellido()))&&(listaDeContactos.get(j).getNumeroTelefono().equals(contacto.getNumeroTelefono()))){
                            contactosRepetidos.add(listaDeContactos.get(j));
                            break; //si estoy dentro del if significa que ya encontre el contacto repetido
                        }          //asi que no necesito seguir buscando
                    }

                }
            }
        }
        for(Contacto contacto:contactosRepetidos){
            System.out.println("Nombre: "+contacto.getNombre());
            System.out.println("Apellido: "+contacto.getApellido());
            System.out.println("Edad: "+contacto.getEdad());
            System.out.println("Telefono: "+contacto.getNumeroTelefono());
            System.out.println("Ciudad: "+contacto.getCiudad());
        }
    }
}
