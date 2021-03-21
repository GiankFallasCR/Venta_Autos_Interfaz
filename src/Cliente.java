public class Cliente {
  private String Nombre;
  private String Apellido;
  private int Identificacion;
  
  public Cliente (){
      this.Nombre=" ";
      this.Apellido=" ";
      this.Identificacion=0;
  }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }
  
}
