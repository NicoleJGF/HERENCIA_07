import acceso.Permiso;
import acceso.Rol;
import acceso.RolPermiso;

public class Main {
    public static void main(String[] args) {

        Rol estudiante = new Rol("00E");
        Rol profesor = new Rol("00P");
        Rol coodinador = new Rol("00C");

        Permiso permiso1 = new Permiso(01,"Salir");
        Permiso permiso2 = new Permiso(02,"Entrar");
        Permiso permiso3 = new Permiso(3,"Eliminar");
        Permiso permiso4 = new Permiso(0,"Mostrar");

        RolPermiso rolPermiso1 = new RolPermiso(estudiante,permiso2);
        RolPermiso rolPermiso2 = new RolPermiso(profesor,permiso4);
        RolPermiso rolPermiso3 = new RolPermiso(profesor,permiso3);
        RolPermiso rolPermiso4 = new RolPermiso(estudiante,permiso1);

        //Agregando
        estudiante.agregarRolPermisos(rolPermiso1);
        estudiante.agregarRolPermisos(rolPermiso4);
        profesor.agregarRolPermisos(rolPermiso2);
        profesor.agregarRolPermisos(rolPermiso3);

        //Mostrando
        estudiante.listarRolPermiso();

        //Buscar
        String dato = "Entrar";
        estudiante.buscarPermiso(dato);
        estudiante.buscarPermiso2(dato);

        //Ordenamiento
        profesor.ordenamientoBurbuja();
        System.out.println("\nOrdenado por ordenamiento Burbuja:");
        for (RolPermiso objeto : profesor.getRolPermisos()) {
            System.out.println(objeto.getPermiso().getNombre());
        }
    }
}