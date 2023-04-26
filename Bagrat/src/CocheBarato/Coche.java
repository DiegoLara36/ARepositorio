package CocheBarato;

public class Coche {
    private String placa ;
    private int kilometraje;
    private String marca;
    private String color;
    //el mas nuevo es el que tiene menor kilometraje


    public Coche(String placa, int kilometraje, String marca, String color) {
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //primero sin entrada de valores


}
