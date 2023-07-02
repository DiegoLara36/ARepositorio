package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class EstiloLibre extends Estilo {
    //se deben usar
    public EstiloLibre(){
        super();
        this.tipoestilo = TipoEstilo.LIBRE;
    }
    public void movimientoBrazos(){
        System.out.println("alternancia de brazos");
    }
    public  void movimientoPiernas(){
        System.out.println("batido altranado de piernas");
    }
    public  void respiracion(){
        System.out.println("respiracion lateral");
    }
}
