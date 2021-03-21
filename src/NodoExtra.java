public class NodoExtra {

private Extras dato;
private NodoExtra siguiente;

public NodoExtra(){
    this.siguiente=null;
}
    public Extras getDato() {
        return dato;
    }

    public void setDato(Extras dato) {
        this.dato = dato;
    }

    public NodoExtra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoExtra siguiente) {
        this.siguiente = siguiente;
    }

}
