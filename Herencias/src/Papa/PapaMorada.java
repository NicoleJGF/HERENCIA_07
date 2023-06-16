package Papa;

public class PapaMorada extends Papa{
    private String antioxidantes;
    private String preparacion;

    public PapaMorada(String variedad, String color, String sabor, String origen, String antioxidantes, String preparacion) {
        super(variedad, color, sabor, origen);
        this.antioxidantes = antioxidantes;
        this.preparacion = preparacion;
    }

    public String getAntioxidantes() {return antioxidantes;}
    public String getPreparacion() {return preparacion;}
    public void setAntioxidantes(String antioxidantes) {this.antioxidantes = antioxidantes;}
    public void setPreparacion(String preparacion) {this.preparacion = preparacion;}

    @Override
    public String toString() {
        return "PapaMorada{" +
                "antioxidantes : '" + antioxidantes + '\'' +
                ", preparacion : '" + preparacion + '\'' +
                "variedad : '" + getVariedad() + '\'' +
                ", color : '" + getColor() + '\'' +
                ", sabor : '" + getSabor() +'\'' +
                ", orgen : '" + getOrigen() +'\'' +
                '}';
    }
}
