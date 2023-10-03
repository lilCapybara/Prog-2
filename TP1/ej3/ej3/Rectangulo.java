package ej3;

public class Rectangulo{
    private PuntoGeometrico vsi;
    private PuntoGeometrico vsd;
    private PuntoGeometrico vii;
    private PuntoGeometrico vid;

    //contructores

    public Rectangulo(PuntoGeometrico vsi, PuntoGeometrico vsd, PuntoGeometrico vii, PuntoGeometrico vid){
        this.vsi=vsi;
        this.vsd=vsd;
        this.vii=vii;
        this.vid=vid;
    }

    //get y set

    public PuntoGeometrico getVsi() {
        return vsi;
    }

    public void setVsi(PuntoGeometrico vsi) {
        this.vsi = vsi;
    }

    public PuntoGeometrico getVsd() {
        return vsd;
    }

    public void setVsd(PuntoGeometrico vsd) {
        this.vsd = vsd;
    }

    public PuntoGeometrico getVii() {
        return vii;
    }

    public void setVii(PuntoGeometrico vii) {
        this.vii = vii;
    }

    public PuntoGeometrico getVid() {
        return vid;
    }

    public void setVid(PuntoGeometrico vid) {
        this.vid = vid;
    }


    //metodos

    public void moverRectangulo(){
        vsi.desplazoPto(vsi);
        vsd.desplazoPto(vsd);
        vii.desplazoPto(vii);
        vid.desplazoPto(vid);
    }

    public double areaRectangulo(){
        return (vid-vii)*(vsi-vii);
    }

    public boolean esCuadrado(){
        return (vsi-vii)==(vsd-vsi);
    }

    public boolean estaAcostado(){
        return (vsd-vsi)>(vsi-vii);
    }
}