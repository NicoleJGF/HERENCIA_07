import Papa.Papa;

import Papa.PapaAmarilla;

public class Main {
    public static void main(String[] args) {

        //HERENCIA DE PRODUCTO
        Papa papa = new Papa("TIPO_0A", "Blanco", "Dulce","Huanuco");
        System.out.println("Nombre: " + papa.getColor());
        System.out.println(papa.toString());

        PapaAmarilla papaAmarilla = new PapaAmarilla("a","b","c","d","e",
                "f","g");
        System.out.println(papaAmarilla.toString());
    }
}