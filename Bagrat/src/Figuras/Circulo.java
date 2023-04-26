package Figuras;

public class Circulo extends Figura {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double cordx, double cordy, double radio) {
        super(cordx, cordy);//super llama a los atributos de la clase padre
        this.radio = radio;
    }// al generar constructor se genera con lo heredado


    public Circulo(double radio) {
        this.radio = radio;
    }
    //se generana utomaticamente dos constructores
    //uno con los valores heredados y propios de la clsae y otro con solo la clase

    public Circulo(){
    }

    public void calculodelArea(){
        System.out.println("el area del circulo: "+Math.PI*Math.pow(radio,2));
        // System.out.println("con super: ");super.calculodelArea();
    }
}
