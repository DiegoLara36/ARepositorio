package Exproblemas.Natacion;


public class EstiloMariposa extends Estilo{

    public EstiloMariposa(){
        super();
        this.tipoEstilo = TipoEstilo.MARIPOSA;
    }
    @Override
    public void movimientoBrazos() {
        System.out.println("Alternancia de Brazos");
    }

    @Override
    public void movimientoPiernas() {
        System.out.println("Batido Alternado de Piernas");
    }

    @Override
    public void respiracion() {
        System.out.println("Respiracion Boca Arriba");
    }
}
