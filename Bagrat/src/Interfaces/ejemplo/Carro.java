package Interfaces.ejemplo;

public class Carro implements Rueda,Silla{

    public Carro(){

    }
        //impleneta los metodos de la clase implementada(rueda)
        //interfaz no se escribe codigo
        //public int valor = 59;

    @Override
    public void avanzar() {
        System.out.println("el carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("el carro se avanza");
    }

    @Override
    public void Sentarse() {
        System.out.println("no se puden sentar");
    }
}
