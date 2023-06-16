package Impresoras;

public class Impresora {

    // Clase base Impresora
    private String modelo;
    private String conexion;
    private String tinta;
    private double precio;

    public Impresora(String modelo, String conexion, String tinta, double precio) {
        this.modelo = modelo;
        this.conexion = conexion;
        this.tinta = tinta;
        this.precio = precio;
    }

    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    public void setTinta(String tinta) {
        this.tinta = tinta;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getModelo() {
        return modelo;
    }
    public String getConexion() {
        return conexion;
    }
    public String getTinta() {
        return tinta;
    }
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "modelo='" + modelo + '\'' +
                ", conexion='" + conexion + '\'' +
                ", tinta='" + tinta + '\'' +
                ", precio=" + precio +
                '}';
    }
}
