package Papa;

public class Papa {

    private String variedad;
    private String color;
    private String sabor;
    private String origen;

    public Papa(){

    }

    public Papa(String variedad, String color, String sabor, String origen) {
        this.variedad = variedad;
        this.color = color;
        this.sabor = sabor;
        this.origen = origen;
    }

    public String getVariedad() {return variedad;}
    public void setVariedad(String variedad) {this.variedad = variedad;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getSabor() {return sabor;}
    public void setSabor(String sabor) {this.sabor = sabor;}

    public String getOrigen() {return origen;}
    public void setOrigen(String origen) {this.origen = origen;}

    @Override
    public String toString() {
        return "Papa{" +
                "variedad='" + variedad + '\'' +
                ", color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
