package Exproblemas.Natacion;
public class RestriccionSalud implements TipoRestriccion {
    @Override
    public boolean valida(Persona p) {
        //voy a hacer que siempre retorne true para no hacer mas largo el problema
        return true;
    }
}
