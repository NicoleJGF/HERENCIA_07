package acceso;

public class Rol {

    private int id;
    private String nombre;
    private RolPermiso[] rolPermiso;
    private int indicePermisos;

    /*
    public Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }*/

    public Rol(String nombre) {
        this.nombre = nombre;
        this.rolPermiso = new RolPermiso[2];
        this.indicePermisos = 0;
    }

    //FUNCIONES
    public void agregarRolPermisos(RolPermiso rolPermiso){
        this.rolPermiso[this.indicePermisos] = rolPermiso;
        this.indicePermisos++;
    }

    public void listarRolPermiso(){
        for (int i = 0; i < this.rolPermiso.length; i++) {
            System.out.println("El rol "+this.rolPermiso[i].getRol().getNombre()+" tiene el permiso de: ");
            System.out.println(" - "+this.rolPermiso[i].getPermiso().getNombre());
        }
    }

    public void buscarPermiso(String dato){
        for (int i = 0; i < this.rolPermiso.length; i++) {
            if (this.rolPermiso[i].getPermiso().getNombre() == dato){
                System.out.println("Se encontro: " + this.rolPermiso[i].getPermiso().getNombre());
                break;
            }else {
                System.out.println("No se encontro el permiso " + dato);
            }
        }
    }

    public String buscarPermiso2(String dato){
        for (int i = 0; i < this.rolPermiso.length; i++) {
            if (this.rolPermiso[i].getPermiso().getNombre() == dato) {
                return "a";
            }
        }
        return dato;
    }

    public void ordenamientoBurbuja() {
        int n = this.rolPermiso.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.rolPermiso[j].getRol().getId() > this.rolPermiso[j + 1].getRol().getId()) {
                    RolPermiso temp = this.rolPermiso[j];
                    this.rolPermiso[j] = this.rolPermiso[j + 1];
                    this.rolPermiso[j + 1] = temp;
                }
                System.out.println(""+this.rolPermiso[i].getRol().getNombre()+" ");
            }
        }
    }

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    public void setRolPermisos(RolPermiso[] rolPermisos) {this.rolPermiso = rolPermisos;}
    public RolPermiso[] getRolPermisos() {return rolPermiso;}

    public void setIndicePermisos(int indicePermisos) {this.indicePermisos = indicePermisos;}
    public int getIndicePermisos() {return indicePermisos;}

}
