public class DatoC {
private String Nombre;
private String Apellido;
private int id;

public DatoC (){
    this.Nombre="";
    this.Apellido="";
    this.id=0;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
