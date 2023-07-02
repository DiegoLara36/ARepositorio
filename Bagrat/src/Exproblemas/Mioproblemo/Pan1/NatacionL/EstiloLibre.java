package Exproblemas.Mioproblemo.Pan1.NatacionL;

public class EstiloLibre extends  Estilo{
    //ya se creo public tipoEstilo tipoestilo; ne clase pade


    public EstiloLibre() {
        super();
        this.tipoestilo=tipoEstilo.LIBRE;
    }

    @Override
    public void movimientoBrazos() {
        System.out.println("alternancia de brazos");

    }

    @Override
    public void movimientoPiernas() {
        System.out.println("batido alternado de piernas");
    }

    @Override
    public void respiracion() {
        System.out.println("respiracion lateral");
    }
}
