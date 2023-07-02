package Exproblemas.Natacion;
public class EstiloPecho extends Estilo {

    public EstiloPecho() {
        super();
        this.tipoEstilo = TipoEstilo.PECHO;
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
