package Interfaces.Ejemplomio;

public class Hijo extends Etnia implements Madre{


    @Override
    public void Ojos() {
        System.out.println("los ojos son de mi madre");

    }

    public static void main(String[] args) {
        Hijo h1 = new Hijo();
        h1.Ojos();
        h1.Etnia();
        //una forma de implementar herencia multiple
    }

}
