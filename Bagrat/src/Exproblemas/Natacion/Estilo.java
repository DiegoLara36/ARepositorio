package Exproblemas.Natacion;


public abstract class Estilo {
    public TipoEstilo tipoEstilo;
    public abstract void movimientoBrazos();
    public abstract void movimientoPiernas();
    public abstract void respiracion();

    @Override
    public String toString() {
        return "Estilo{" +
                "tipoEstilo=" + tipoEstilo +
                '}';
    }
}
