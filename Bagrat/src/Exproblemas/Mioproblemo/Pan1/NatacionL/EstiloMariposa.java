package Exproblemas.Mioproblemo.Pan1.NatacionL;

public class EstiloMariposa extends Estilo{

    public EstiloMariposa(){
        super();
        this.tipoestilo=tipoEstilo.MARIPOSA;
    }

    @Override
    public void movimientoBrazos() {
        System.out.println("movimiento simultaneo de brazos");
    }

    @Override
    public void movimientoPiernas() {
        System.out.println("batido alternado de piernas");
    }

    @Override
    public void respiracion() {
        System.out.println("respiracion plano frontal");
    }
}
