package ej5;
public class Turno{
    private Cliente cliente;
    int peluquero;
    private int dia;
    private int hora;
    final int costoBase=100;

    //constructor

    public Turno(Cliente cliente, int peluquero, int dia, int hora) {
        this.cliente = cliente;
        this.peluquero = peluquero;
        this.dia = dia;
        this.hora = hora;
    }


    //getters y setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(int peluquero) {
        this.peluquero = peluquero;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCostoBase() {
        return costoBase;
    }

    //metodos

    public double getDescuento(){
        if (cliente.esClienteFrecuente()){
            return 0.1;
        }else{
            return 0;
        }
    }

    public double getCostoTotal(){
        return costoBase-costoBase*getDescuento();
    }

}