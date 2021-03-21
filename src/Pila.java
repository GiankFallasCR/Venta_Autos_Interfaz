
import javax.swing.JOptionPane;

public class Pila {

    private NodoCl cima;

    public Pila() {
        this.cima = null;//se inicializa en vacio
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar() {
        //algoritmo para apilar elementos
        Cliente c = new Cliente();//1. se crea el objeto
        c.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));//2. se llena el objeto
        c.setApellido(JOptionPane.showInputDialog(null, "Digite el apellido"));//2. se llena el objeto
        c.setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la identificación.")));
        NodoCl nuevo = new NodoCl();//se crea el nodo
        nuevo.setDato(c);//se agrega elemtno al nodo
        if (esVacia()) {//preguntar si esta vacia
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);//enlace nuevo con cima
            cima = nuevo;//coloque cima donde esta nuevo//a partir de la siguiente vez, se repite el else
        }
    }

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.getSiguiente();//se elimina y pasa al de abajo
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden extraer los elementos, registro vacío.");
        }
    }

    public void mostrarPila() {
        String s = "";
        NodoCl aux = cima;
        if (!esVacia()) {
            while (aux != null) {
                s = s + aux.getDato().getNombre() + "-" + aux.getDato().getApellido() + "-"
                        + aux.getDato().getIdentificacion() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Clientes en registro: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes en registro.");

        }
    }

    public String mostrarPilaF() {
        String s = "";
        NodoCl aux = cima;
        if (!esVacia()) {
            while (aux != null) {
                s = s + aux.getDato().getNombre() + "-" + aux.getDato().getApellido() + "-"
                        + aux.getDato().getIdentificacion() + "\n";
                aux = aux.getSiguiente();
            }

        }
        return s;
    }
}
