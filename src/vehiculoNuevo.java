
import javax.swing.JOptionPane;

public class vehiculoNuevo extends Vehiculo {
    private String Tipo;
    
    public vehiculoNuevo(){
        this.Tipo=" ";
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTMotor() {
        return TMotor;
    }

    public void setTMotor(int TMotor) {
        this.TMotor = TMotor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

}
