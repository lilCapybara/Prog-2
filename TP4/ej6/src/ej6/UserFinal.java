package ej6;

public class UserFinal extends Persona{
    private String usuario;
    private String password;

    //Constructor
    public UserFinal(String nombre, String apellido, int edad, String cargo, String usuario, String password) {
        super(nombre, apellido, edad, cargo);
        this.usuario = usuario;
        this.password = password;
    }

    //Metodos
    public void getDatos(){
        System.out.println("Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Cargo: "+cargo+"\n"+"Usuario: "+usuario+"\n"+"Password: "+password);
    }
}
