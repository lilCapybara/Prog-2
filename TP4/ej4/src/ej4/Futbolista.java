package ej4;
import java.util.ArrayList;
public class Futbolista extends Persona{
    private String posicion;
    private String pieHabil;
    private int golesConvertidos;

    //constructor

    public Futbolista(String nombre, String apellido, int numeroPasaporte, int nacimiento, ArrayList<String> estado, String posicion, String pieHabil, int golesConvertidos) {
        super(nombre, apellido, numeroPasaporte, nacimiento, new ArrayList<>(estado));
        this.posicion = posicion;
        this.pieHabil = pieHabil;
        this.golesConvertidos = golesConvertidos;
    }
}
