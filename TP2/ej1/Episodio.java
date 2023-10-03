package ej1;

public class Episodio{
    private string titulo;
    private string descripcion;
    private boolean visto;
    private int calificacion;

    //constructores

    public Episodio(String titulo) {
        super();
        this.titulo = titulo;//valores por defecto
        this.fueVisto=false;
        this.calificacion=-1;
    }

    public Episodio(string titulo, string descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    //getters y setters


    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(string descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }


    //metodos

    public void setCalificacion(int calificacion) {
        if (calificacion>=1 && calificacion<=5) { //Verifica que la calificacion este entre 1 y 5
            this.calificacion = calificacion;
        }else{
            System.out.println("Ingrese una calificacion adecuada");
        }
        visto=true; //si se califico, significa que fue visto
    }

