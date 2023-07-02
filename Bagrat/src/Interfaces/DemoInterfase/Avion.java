package Interfaces.DemoInterfase;

public class Avion implements  Desplazable{
    @Override
    public void acelerar() {
        System.out.println(":::::::::acelerarAVION:::::::");
    }

    @Override
    public void desacelerar() {
        System.out.println(":::::::::desacelerarAVION::::::::");
    }
}
