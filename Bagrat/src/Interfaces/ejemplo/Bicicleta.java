package Interfaces.ejemplo;

public class Bicicleta implements  Rueda{


    @Override
    public void avanzar() {
        System.out.println("la bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("la bicilceta se detiene");
    }
}
