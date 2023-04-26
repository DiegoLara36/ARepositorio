package Figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double cordx, double cordy, double base, double altura) {
        super(cordx, cordy);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }
    public void calculodelArea(){
        System.out.println("el area del traingulo : "+base*altura/2);

    }


}
