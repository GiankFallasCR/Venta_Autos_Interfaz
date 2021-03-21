
import javax.swing.JOptionPane;

public class SimpleCExtras {
private NodoExtra inicio;
private NodoExtra fin;
public SimpleCExtras(){
    this.fin=null;
    this.inicio=null;
}
public boolean esVacia(){
    if(inicio==null){
        return true;
    }else{
        return false;
    }
}
public void agregar(){
    int i =0;
    while(i<3){
    Extras e = new Extras();
    JOptionPane.showMessageDialog(null,"A continuacion se le mostraran las extras disponibles, por favor "
            + "digite la extra y luego su precio.");
    JOptionPane.showMessageDialog(null,"1 . Tapiz de cuero=$1000 \n 2. Camara de reversa=$400 "
            + "\n 3. Sun roof=$500 \n 4. Aros de lujo=$650 "
                    + "\n 5. Sensor de punto ciego=$725 \n 6. Spoilers deportivos=$1200"
            + "\n 7. Halogenos=$125 \n 8. Control crucero=$375");
    e.setExtra(JOptionPane.showInputDialog(null,"Digite el nombre de la extra: "));
    e.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio de la extra: ")));
    NodoExtra n = new NodoExtra();
    n.setDato(e);
    if(esVacia()){
        inicio=n;
        fin=n;
        fin.setSiguiente(inicio);
    }else if (e.getPrecio()< inicio.getDato().getPrecio()){
        n.setSiguiente(inicio);
        inicio=n;
        fin.setSiguiente(inicio);
    }else if(e.getPrecio()>=fin.getDato().getPrecio()){
       fin.setSiguiente(n);
       fin=fin.getSiguiente();
       fin.setSiguiente(inicio);
    }else{
        NodoExtra aux = inicio;
        while(aux.getSiguiente().getDato().getPrecio()<e.getPrecio()){
            aux=aux.getSiguiente();
        }
        n.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(n);
        fin.setSiguiente(inicio);

    }
    i++;
    }
}

public void mostrarElementos() {
     String s="";
     int total=0;
        if(!esVacia()){
            NodoExtra aux = inicio;
            s=s+aux.getDato().getExtra()+"--"+aux.getDato().getPrecio()+"<--";
            aux=aux.getSiguiente();
            while(aux!=inicio){
                s=s+aux.getDato().getExtra()+"--"+aux.getDato().getPrecio()+"--";
                aux=aux.getSiguiente();
                total=total+aux.getDato().getPrecio();
            }
            JOptionPane.showMessageDialog(null,"Las extras son:\n"+s);
        }else {
            JOptionPane.showMessageDialog(null,"Sin extras agregadas.");
        }
}

public String mostrarElementosF() {
     String s="";
     int total=0;
        if(!esVacia()){
            NodoExtra aux = inicio;
            s=s+aux.getDato().getExtra()+"--"+aux.getDato().getPrecio()+"<--";
            aux=aux.getSiguiente();
            while(aux!=inicio){
                s=s+aux.getDato().getExtra()+"--"+aux.getDato().getPrecio()+"--";
                aux=aux.getSiguiente();
                total=total+aux.getDato().getPrecio();
            }

    }
                return s ;
}
}

