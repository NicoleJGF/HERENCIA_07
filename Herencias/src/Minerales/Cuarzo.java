package Minerales;

public class Cuarzo extends Mineral{
    private String variedad;
    private String color;
    private String aplicacion;

    public Cuarzo(String nombre, String color, double dureza, String origen, String variedad, String color1, String aplicacion) {
        super(nombre, color, dureza, origen);
        this.variedad = variedad;
        this.color = color1;
        this.aplicacion = aplicacion;
    }

    public String getVariedad() {return variedad;}
    public String getColor() {return color;}
    public String getAplicacion() {return aplicacion;}

    public void setVariedad(String variedad) {this.variedad = variedad;}
    public void setColor(String color) {this.color = color;}
    public void setAplicacion(String aplicacion) {this.aplicacion = aplicacion;}

    @Override
    public String toString() {
        return "Cuarzo{" +
                "variedad='" + variedad + '\'' +
                ", color='" + color + '\'' +
                ", aplicacion='" + aplicacion + '\'' +
                '}';
    }
}
