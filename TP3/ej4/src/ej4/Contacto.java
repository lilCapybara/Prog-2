package ej4;

public class Contacto {
    private String nombre;
    private String Apellido;
    private int edad;
    private String numeroTelefono;
    private String ciudad;

    //constructor

    public Contacto(String nombre, String apellido, int edad, String numeroTelefono, String ciudad) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.ciudad = ciudad;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
