package Exproblemas.Mioproblemo.Pan1.NatacionM;

//esta heredando la clase estilo puede usar sus atributos
public class EstiloMariposa extends  Estilo{
    public EstiloMariposa() {
        super();
        this.tipoestilo = TipoEstilo.MARIPOSA;
        //cada vez que llame al estilo mariposa la variable tipoestilo es instanciada

    }

    public void movimientoBrazos(){
        System.out.println("movimiento simultaneo de brazos");
    }
    public  void movimientoPiernas(){
        System.out.println("batido alternado de piernas");
    }
    public  void respiracion(){
        System.out.println("respiracion plano frontal");
    }
}
