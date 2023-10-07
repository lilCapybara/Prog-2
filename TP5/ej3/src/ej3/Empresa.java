package ej3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Lote>listaDeLotes;
    private ArrayList<Cereal>listaDeCereales;
    private ArrayList<String> mineralesPrimarios;

    //Constructor
    public Empresa(ArrayList<Lote> listaDeLotes, ArrayList<Cereal> listaDeCereales, ArrayList<String> mineralesPrimarios){
        this.listaDeLotes=new ArrayList<>(listaDeLotes);
        this.listaDeCereales=new ArrayList<>(listaDeCereales);
        this.mineralesPrimarios=new ArrayList<>(mineralesPrimarios);
    }

    //Metodos
    public boolean esEspecial(Lote lote){
        for (String mineral : lote.getMinerales()){
            if(!mineralesPrimarios.contains(mineral)){
                return false;
            }
        }
        return true;
    }

    public void cerealesAptosParaLote(Lote lote){
        System.out.println("Cereales aptos para el lote: ");
        boolean apto;
        for (Cereal cereal : listaDeCereales){                                  //Recorrro la lista de cerales de la empresa
            apto=true;                                                          //Al cambiar de cereal, se reinicia la variable apto
            for (String mineralRequerido : cereal.getMineralesRequeridos()){    //Recorro los minerales requeridos por el cereal
                if (!lote.getMinerales().contains(mineralRequerido)){           //Verifico si en la lista de minerales del lote esta el mineral requerido
                    apto=false;
                    break;
                }
            }
            if (cereal instanceof Pastura) {

                if (lote.getSuperficie() < 50) {
                    apto = false;
                }
            }
            if (apto) {
                System.out.println(cereal.getNombre());
            }
        }
    }

    public void lotesAptosParaCereal(Cereal cereal){
        System.out.println("Lotes aptos para el cereal: ");
        boolean apto;
        for (Lote lote : listaDeLotes){                                            //Recorrro la lista de lotes de la empresa
            apto=true;                                                             //Al cambiar de lote, se reinicia la variable apto
            for (String mineral : lote.getMinerales()){                            //Recorro los minerales que tiene el lote
                if (!cereal.getMineralesRequeridos().contains(mineral)){           //Verifico si el mineral requerido esta contenido en la lista de minerales qie tien el lote
                    apto=false;
                    break;
                }
            }
            if (cereal instanceof Pastura) {

                if (lote.getSuperficie() < 50) {
                    apto = false;
                }
            }
            if (apto) {
                System.out.println(lote.getNumLote());
            }
        }
    }

}
