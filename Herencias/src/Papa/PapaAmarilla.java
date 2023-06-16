package Papa;

public class PapaAmarilla extends Papa{

    private String tipo_piel;
    private String almidon;
    private String uso;

    public PapaAmarilla(String variedad, String color, String sabor, String origen, String tipo_piel, String almidon, String uso) {
        super(variedad, color, sabor, origen);
        this.tipo_piel = tipo_piel;
        this.almidon = almidon;
        this.uso = uso;
    }

    public String getTipo_piel() {return tipo_piel;}
    public String getAlmidon() {return almidon;}
    public String getUso() {return uso;}
    public void setTipo_piel(String tipo_piel) {this.tipo_piel = tipo_piel;}
    public void setAlmidon(String almidon) {this.almidon = almidon;}
    public void setUso(String uso) {this.uso = uso;}

    @Override
    public String toString() {
        return "PapaAmarilla{" +
                "variedad : '" + getVariedad() + '\'' +
                ", color : '" + getColor() + '\'' +
                ", sabor : '" + getSabor() +'\'' +
                ", orgen : '" + getOrigen() +'\'' +
                ", piel : '" + getTipo_piel() + '\'' +
                ", almidon : '" + almidon + '\'' +
                ", uso='" + uso + '\'' +
                "}";
    }
}
