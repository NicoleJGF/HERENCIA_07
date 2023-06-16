package Minerales;

public class Oro extends Mineral{

    private String quilataje;
    private String pureza;
    private String valor;

    public Oro(String nombre, String color, double dureza, String origen, String quilataje, String pureza, String valor) {
        super(nombre, color, dureza, origen);
        this.quilataje = quilataje;
        this.pureza = pureza;
        this.valor = valor;
    }

    public String getQuilataje() {return quilataje;}
    public String getPureza() {return pureza;}
    public String getValor() {return valor;}

    public void setQuilataje(String quilataje) {this.quilataje = quilataje;}
    public void setPureza(String pureza) {this.pureza = pureza;}
    public void setValor(String valor) {this.valor = valor;}

    @Override
    public String toString() {
        return "Oro{" +
                "quilataje='" + quilataje + '\'' +
                ", pureza='" + pureza + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
