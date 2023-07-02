package Exproblemas.Natacion;

public class EstiloLibre extends Estilo{

    public EstiloLibre(){
        super();
        this.tipoEstilo = TipoEstilo.LIBRE;
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
        System.out.println("Respiracion Lateral");
    }
}
