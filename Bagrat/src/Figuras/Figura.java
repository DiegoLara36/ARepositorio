package Figuras;

public class Figura {
    private double cordx;
    private double cordy;

    public double getCordx() {
        return cordx;
    }

    public void setCordx(double cordx) {
        this.cordx = cordx;
    }

    public double getCordy() {
        return cordy;
    }

    public void setCordy(double cordy) {
        this.cordy = cordy;
    }

    public Figura(double cordx, double   cordy) {
        this.cordx = cordx;
        this.cordy = cordy;
    }
    public Figura(){

    };

    public void calculodelArea(){
        System.out.println("dentro del calculo del area general");
    }
}
