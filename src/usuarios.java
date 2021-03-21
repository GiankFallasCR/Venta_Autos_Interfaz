
import javax.swing.JOptionPane;

public class usuarios {
private NodoC inicio;
    private NodoC fin;

    public usuarios() {
        this.inicio = null;//la cola esta vacia
        this.fin = null;//la cola esta vacia
    }

    public boolean esVacia() {//comprueba si la cola tiene elementos
        if (inicio == null) {
            return true;//esto si la cila esta vacia
        } else {
            return false;//retorna falso si esta llena
        }
    }

    public void encolar() {//encola elementos
        DatoC d = new DatoC();//se crea el objeto
        d.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre: "));//se llena el objeto
        d.setApellido(JOptionPane.showInputDialog(null, "Digite su apellido: "));//se llena el objeto
        d.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su ID")));
        NodoC nuevo = new NodoC();
        nuevo.setElemento(d);//se almacena el objeto en el nodo
        if (esVacia()) {//preguntar si la cola esta vacia
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);//siguiente paso, enlace fin con nuevo
            fin = nuevo;//luego, actualice fin para que sea nuevo
        }
    }

    public void desencolar() {
        NodoC aux = inicio;//cree una variable de tipo nodo y coloquela en inicio
        if (!esVacia()) {//peguntar si no esta vacia
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, la cola está vacia!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarElementos() {
        String s = "";
        if (!esVacia()) {
            NodoC aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + "-"
                        + aux.getElemento().getApellido() + "-" + aux.getElemento().getId();//alt+27 es la flecha
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Usuarios en sistema\n" + s);//alt+92 = \
        } else {
            JOptionPane.showMessageDialog(null, "No se puede ,no hay usuarios.");
        }

    }    
    public String mostrarElementosF() {
        String s = "";
        if (!esVacia()) {
            NodoC aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + "-"
                        + aux.getElemento().getApellido() + "-" + aux.getElemento().getId();//alt+27 es la flecha
                aux = aux.getSiguiente();
            }

        }
                return s;
    }
}
