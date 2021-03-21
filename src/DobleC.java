
import javax.swing.JOptionPane;

public class DobleC {

private NodoDC iniDC;
private NodoDC anteDC;

public DobleC(){
    this.iniDC=null;
    this.anteDC=null;
}

public boolean esVacia(){
    if(iniDC==null){
        return true;
    }else{
        return false;
    }
    
}

public void llenarListaDoble(){
           DatoDC d =  new DatoDC();
           d.setVenta(Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite la venta realizada:")));
            NodoDC nuevo = new NodoDC();
            nuevo.setElemento(d);
             if (esVacia()) {
                iniDC = nuevo;
                anteDC = iniDC;
                anteDC.setSigDC(iniDC);
                iniDC.setAnteDC(anteDC);
            } else if (d.getVenta() < iniDC.getElemento().getVenta()) {
                nuevo.setSigDC(iniDC);
                iniDC = nuevo;
                anteDC.setSigDC(iniDC);
                iniDC.setAnteDC(anteDC);
            } else if (d.getVenta() >= anteDC.getElemento().getVenta()) {
                anteDC.setSigDC(nuevo);
                anteDC = anteDC.getSigDC();
                anteDC.setSigDC(iniDC);
                iniDC.setAnteDC(anteDC);
            } else {
                NodoDC auxDC = iniDC;
                while (auxDC.getSigDC().getElemento().getVenta() < d.getVenta()) {
                    auxDC = auxDC.getSigDC();
                }
                nuevo.setSigDC(auxDC.getSigDC());
                nuevo.setAnteDC(auxDC);
                auxDC.setSigDC(nuevo);
                nuevo.getSigDC().setAnteDC(nuevo);
            }
        }
public void mostrarLDE(){
            String s=" ";
            if(!esVacia()){
                NodoDC aux=iniDC;
                s=s+aux.getElemento().getVenta();
                  aux=aux.getSigDC();
                while(aux!=iniDC){
                     s = s +"<==>"+ aux.getElemento().getVenta();
                     aux=aux.getSigDC();
                }
                  JOptionPane.showMessageDialog(null, "Ventas Realizadas\n"+s);
    }
    }
}
