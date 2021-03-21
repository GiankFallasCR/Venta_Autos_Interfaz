
public class NodoCl {

    private Cliente dato;
    private NodoCl siguiente;

    public NodoCl() {
        this.siguiente = null;

    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente elemento) {
        this.dato = elemento;
    }

    public NodoCl getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCl siguiente) {
        this.siguiente = siguiente;
    }

}
