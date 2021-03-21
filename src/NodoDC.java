public class NodoDC {
private DatoDC elemento;
private NodoDC sigDC;
private NodoDC anteDC;

public NodoDC(){
    this.sigDC=null;
    this.anteDC=null;
}   

    public DatoDC getElemento() {
        return elemento;
    }

    public void setElemento(DatoDC elemento) {
        this.elemento = elemento;
    }

    public NodoDC getSigDC() {
        return sigDC;
    }

    public void setSigDC(NodoDC sigDC) {
        this.sigDC = sigDC;
    }

    public NodoDC getAnteDC() {
        return anteDC;
    }

    public void setAnteDC(NodoDC anteDC) {
        this.anteDC = anteDC;
    }

}
