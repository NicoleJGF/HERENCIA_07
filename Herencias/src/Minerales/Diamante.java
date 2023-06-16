package Minerales;

public class Diamante extends Mineral{
    private String peso;
    private String corte;
    private String claridad;

    public Diamante(String nombre, String color, double dureza, String origen, String peso, String corte, String claridad) {
        super(nombre, color, dureza, origen);
        this.peso = peso;
        this.corte = corte;
        this.claridad = claridad;
    }

    public String getPeso() {return peso;}
    public String getCorte() {return corte;}
    public String getClaridad() {return claridad;}

    public void setPeso(String peso) {this.peso = peso;}
    public void setCorte(String corte) {this.corte = corte;}
    public void setClaridad(String claridad) {this.claridad = claridad;}

    @Override
    public String toString() {
        return "Diamante{" +
                "peso='" + peso + '\'' +
                ", corte='" + corte + '\'' +
                ", claridad='" + claridad + '\'' +
                '}';
    }
}
