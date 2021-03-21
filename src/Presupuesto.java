
import javax.swing.JOptionPane;

public class Presupuesto {

    int presupuesto = 0;

    public void Presupuesto() {

        presupuesto = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al apartado de presupuesto, "
                + "a continuacion, digite el presupuesto para su vehículo: "));

        JOptionPane.showMessageDialog(null, "A continuacion, se presentaran distintas opciones para su presupuesto:");

        if (presupuesto > 22000 && presupuesto <= 26900) {
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto + "\n Los Vehiculos disponibles son: \nNissan Sentra - $22.000");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");
            
        } else if (presupuesto > 22000 && presupuesto > 210000) {
            
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto + "\n Los Vehiculos disponibles son: "
                    + "\nNissan Sentra - $22.000\nToyota Corolla - $26.900"
                    + "\nNissan Frontier - $35.000 \nToyota Fortuner - $54.800 \nLexus LC500 - $82.000 \n"
                    + "Toyota Tundra - $88.000\nLexus RX350 - $210.000");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");
            
        } else if (presupuesto > 22000 && presupuesto > 88000) {
            
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto + "\n Los Vehiculos disponibles son:\nNissan Sentra - $22.000\nToyota Corolla - $26.900\n"
                    +"\nNissan Frontier - $35.000\nToyota Fortuner - $54.800\nLexus LC500 - $82.000"
                    +"\nToyota Tundra - $88.000");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");
            
        } else if (presupuesto > 22000 && presupuesto > 82000) {
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto + "\n Los Vehiculos disponibles son:\nNissan Sentra - $22.000\nToyota Corolla - $26.900\"\n"
                    + "\nNissan Frontier - $35.000\nToyota Fortuner - $54.800\nLexus LC500 - $82.000 ");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");
            
        }else if(presupuesto>25000 && presupuesto>35000){
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto +"\nNissan Sentra - $22.000\nToyota Corolla - $26.900"
                    + "\nNissan Frontier - $35.000");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");
        }else if(presupuesto>25000 && presupuesto>26900){
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto +"\nNissan Sentra - $22.000 "
                    + "\nToyota Corolla - $26.900");
            JOptionPane.showMessageDialog(null, "¡Gracias por su visista!");            
        }else if(presupuesto<22000){
            JOptionPane.showMessageDialog(null, "Su presupuesto es: " + presupuesto +". Desafortunadamente, en este momento no contamos con vehículos que "
                    + "se encuentren en ese rango de precio.");            
        }
    }

}
