package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class EstiloPecho  extends  Estilo{
    //inicializan el atributo tipoEstiloo enum

    public EstiloPecho(){
        super();
        this.tipoestilo = TipoEstilo.PECHO;
    }

    public void movimientoBrazos(){
        System.out.println("brazada de pecho");
    }
    public  void movimientoPiernas(){
        System.out.println("patada de rana");
    }
    public  void respiracion(){
        System.out.println("respiracion plano frontal");
    }


}
