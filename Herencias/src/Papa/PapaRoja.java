package Papa;

public class PapaRoja extends Papa{

    private String humedad;
    private String uso;

    public PapaRoja(String variedad, String color, String sabor, String origen, String humedad, String uso) {
        super(variedad, color, sabor, origen);
        this.humedad = humedad;
        this.uso = uso;
    }


    public void setHumedad(String humedad) {this.humedad = humedad;}
    public String getHumedad() {return humedad;}

    public void setUso(String uso) {this.uso = uso;}
    public String getUso() {return uso;}

    @Override
    public String toString() {
        return "PapaRoja{" +
                "variedad : '" + getVariedad() + '\'' +
                ", color : '" + getColor() + '\'' +
                ", sabor : '" + getSabor() +'\'' +
                ", orgen : '" + getOrigen() +'\'' +
                ", humedad : '" + humedad + '\'' +
                ", uso='" + uso + '\'' +
                "} " ;
    }


}
