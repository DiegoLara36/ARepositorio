package Exproblemas.Mioproblemo.Pan1.NatacionL;

public class EstiloPecho extends  Estilo{

    public EstiloPecho(){
        super();
        this.tipoestilo= tipoEstilo.PECHO;
    }

    @Override
    public void movimientoBrazos() {
        System.out.println("brazada de pecho");
    }

    @Override
    public void movimientoPiernas() {
        System.out.println("patada de rana");
    }

    @Override
    public void respiracion() {
        System.out.println("resporacion planot frontal");
    }
}
