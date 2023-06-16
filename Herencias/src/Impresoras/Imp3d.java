package Impresoras;

public class Imp3d extends Impresora{
    private String volumen;
    private String material;

    public Imp3d(String modelo, String conexion, String tinta, double precio, String volumen, String material) {
        super(modelo, conexion, tinta, precio);
        this.volumen = volumen;
        this.material = material;
    }

    public String getVolumen() {return volumen;}
    public String getMaterial() {return material;}

    public void setVolumen(String volumen) {this.volumen = volumen;}
    public void setMaterial(String material) {this.material = material;}

    @Override
    public String toString() {
        return "Imp3d{" +
                "volumen='" + volumen + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
