package Impresoras;

public class ImpInyecTinta extends Impresora{
    private String cartuchos;
    private String calidad;
    private double capacidad;

    public ImpInyecTinta(String modelo, String conexion, String tinta, double precio, String cartuchos, String calidad, double capacidad) {
        super(modelo, conexion, tinta, precio);
        this.cartuchos = cartuchos;
        this.calidad = calidad;
        this.capacidad = capacidad;
    }

    public String getCartuchos() {return cartuchos;}
    public String getCalidad() {return calidad;}
    public double getCapacidad() {return capacidad;}

    public void setCartuchos(String cartuchos) {this.cartuchos = cartuchos;}
    public void setCalidad(String calidad) {this.calidad = calidad;}
    public void setCapacidad(double capacidad) {this.capacidad = capacidad;}

    @Override
    public String toString() {
        return "ImpInyecTinta{" +
                "cartuchos='" + cartuchos + '\'' +
                ", calidad='" + calidad + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
