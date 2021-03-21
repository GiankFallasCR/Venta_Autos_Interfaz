
import javax.swing.JOptionPane;

public class Factura {
  Pila p = new Pila();
  SimpleCExtras s = new SimpleCExtras();
  VehiculoNCompra v = new VehiculoNCompra();
  usuarios u = new usuarios();
  Extras e = new Extras();
  
  
    public void facturacion(){
        JOptionPane.showMessageDialog(null,"Digite los datos del cliente a continuacion para realizar la factura.");
        
        p.apilar();
        
        JOptionPane.showMessageDialog(null,"Ahora digite los datos del vendedor.");
        
        u.encolar();
        
        JOptionPane.showMessageDialog(null,"Digite las extras para el nuevo vehículo.");
        
        s.agregar();
        
        JOptionPane.showMessageDialog(null,"¡Gracias por adquirir su vehículo con nosotros!\n"+v.VehiculoNCompra());
        
        JOptionPane.showMessageDialog(null,"Los datos del cliente se mostraran a continuación -->"+p.mostrarPilaF());

        JOptionPane.showMessageDialog(null,"El vendedor es: "+u.mostrarElementosF());
        
        JOptionPane.showMessageDialog(null,"Las extras seleccionadas fueron: "+s.mostrarElementosF());
        
        JOptionPane.showMessageDialog(null,"El precio final es de $155.000");
    }
}
