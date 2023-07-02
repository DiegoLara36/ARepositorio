package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class EstiloEspalda extends  Estilo {

    public EstiloEspalda(){
        super();
        this.tipoestilo = TipoEstilo.ESPALDA;
    }
    public void movimientoBrazos(){
        System.out.println("alternancia de brazos");
    }
    public  void movimientoPiernas(){
        System.out.println("batido de piernas");
    }
    public  void respiracion(){
        System.out.println("respiracion boca arriba");
    }
}
