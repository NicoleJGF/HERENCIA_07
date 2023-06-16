package Impresoras;

public class ImpLaser extends Impresora{
    private String toner;
    private double velocidad;
    private double duplex;

    public ImpLaser(String modelo, String conexion, String tinta, double precio, String toner, double velocidad, double duplex) {
        super(modelo, conexion, tinta, precio);
        this.toner = toner;
        this.velocidad = velocidad;
        this.duplex = duplex;
    }

    public String getToner() {return toner;}
    public double getVelocidad() {return velocidad;}
    public double getDuplex() {return duplex;}

    public void setToner(String toner) {this.toner = toner;}
    public void setVelocidad(double velocidad) {this.velocidad = velocidad;}
    public void setDuplex(double duplex) {this.duplex = duplex;}

    @Override
    public String toString() {
        return "ImpLaser{" +
                "toner='" + toner + '\'' +
                ", velocidad=" + velocidad +
                ", duplex=" + duplex +
                '}';
    }
}
