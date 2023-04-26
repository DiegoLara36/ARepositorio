package Figuras;


public class Cuadrado extends Figura {

    private float x;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }





    public Cuadrado(double cordx, double cordy, float x) {
        super(cordx, cordy);
        this.x = x;

    }

    public Cuadrado(float x) {
        this.x = x;

    }

    public Cuadrado(){

    }

    public void calculodelArea(){
        System.out.println("el area del cuadrado: "+Math.pow(x,2) );
    }
}
