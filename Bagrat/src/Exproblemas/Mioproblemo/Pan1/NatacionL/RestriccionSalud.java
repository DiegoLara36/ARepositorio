package Exproblemas.Mioproblemo.Pan1.NatacionL;

public class RestriccionSalud implements TipoRestriccion {

    public RestriccionSalud() {
        //no se escpecifico en el problema
    }
    @Override
    public boolean valida(Persona p) {
        return true;
    }
}
