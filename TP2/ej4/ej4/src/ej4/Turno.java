package ej4;
public class Turno {
    private Usuario usuario;
    private int hora;

    //constructor
    public Turno(Usuario usuario, int hora) {
        this.usuario = usuario;
        this.hora = hora;
    }

    //getters & setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    //metodos

    public double getDescuento(){
        double descuento;

        if (usuario.esSocio()){
            descuento=0.1;
        }else{
            descuento=0;
        }
        return descuento;
    }




}





