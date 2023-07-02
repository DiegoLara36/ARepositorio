package Interfaces.DemoInterfase;

public abstract class Auto implements Desplazable, Consumible{
    //un auto acelera


    @Override
    public void acelerar() {
        System.out.println("<=========autoACELERARBASiCO=========>");
    }
}
