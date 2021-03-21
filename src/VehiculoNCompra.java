
import javax.swing.JOptionPane;

public class VehiculoNCompra extends Vehiculo {

    public String VehiculoNCompra() {

        vehiculoNuevo v = new vehiculoNuevo();
        v.setTipo(JOptionPane.showInputDialog(null, "Digite que tipo de vehículo desea: "));
        v.setMarca(JOptionPane.showInputDialog(null, "Digite la marca de su nuevo vehículo"));
        v.setColor(JOptionPane.showInputDialog(null, "Digite el color de su vehiculo: "));
        v.setTMotor(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño del motor: ")));

        String s = "Su nuevo vehiculo es:\n " + v.getTipo()
                + "\nLa marca es: " + v.getMarca() + "\nEl color seleccionado es: " + v.getColor()
                + "\nEl tamaño del motor es: " + v.getTMotor();
        return s;
    }
}
