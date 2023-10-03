Public class puntoGeometrico{
    private int coordenadaX;
    private int coordenadaY;

    //constructores

    public puntoGeometrico(int coordenadaX,int coordenadaY){
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
    }

    public puntoGeometrico(){
        coordenadaX=0;
        coordenadaY=0;
    }

    //get y set

    public int getX(){
        return coordenadaX ;
    }

    public void setX(int coordenadaX){
        this.coordenadaX=coordenadaX;
    }

    public int getY(){
        return coordenadaY;
    }

    public void setY(int coordenadaY){
        this.coordenadaY=coordenadaY;
    }

    //metodos

    public void desplazoPto(int incrementoX, int incrementoY){
        coordenadaX+=incrementoX;
        coordenadaY+=incrementoY;
    }

    public double distanciaE(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}