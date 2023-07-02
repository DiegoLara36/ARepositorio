package Exproblemas.Natacion;

public class EstiloEspalda extends Estilo{

    public EstiloEspalda(){
        super();
        this.tipoEstilo = TipoEstilo.ESPALDA;
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
