import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        // Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Luisa");

        // Recorrer el ArrayList usando un bucle for y obtener valores por índice
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Nombre en el índice " + i + ": " + nombre);
        }

        // Obtener un valor específico por índice
        int indiceElegido = 2;
        if (indiceElegido >= 0 && indiceElegido < nombres.size()) {
            String nombreElegido = nombres.get(indiceElegido);
            System.out.println("Nombre en el índice " + indiceElegido + ": " + nombreElegido);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
