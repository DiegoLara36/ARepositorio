package Exproblemas.Mioproblemo.Pan1.NatacionM;


enum TipoEstilo{
    PECHO,
    MARIPOSA,
    ESPALDA,
    LIBRE;

    TipoEstilo() {
    }
}
public abstract class  Estilo {
    public TipoEstilo tipoestilo;

    public abstract void movimientoBrazos();
    public abstract  void movimientoPiernas();
    public abstract void respiracion();

    @Override
    public String toString() {
        return "Estilo{" +
                "tipoestilo=" + tipoestilo +
                '}';
    }
}
