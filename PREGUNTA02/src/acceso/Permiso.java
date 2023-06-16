package acceso;

public class Permiso {
    private int id;
    private String nombre;

    public Permiso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
}
