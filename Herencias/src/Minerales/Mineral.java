package Minerales;

public class Mineral {

    // Clase base Mineral
    private String nombre;
    private String color;
    private double dureza;
    private String origen;

    public Mineral(String nombre, String color, double dureza, String origen) {
        this.nombre = nombre;
        this.color = color;
        this.dureza = dureza;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getDureza() {
        return dureza;
    }
    public void setDureza(double dureza) {
        this.dureza = dureza;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Mineral{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", dureza=" + dureza +
                ", origen='" + origen + '\'' +
                '}';
    }
}
