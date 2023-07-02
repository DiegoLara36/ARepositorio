package Exproblemas.Mioproblemo.Pan1.NatacionL;

public class RestriccionEdad implements TipoRestriccion{

    private int edadminima;

    public RestriccionEdad(int edadminima) {
        if(edadminima<0){
            throw  new NatacionException("la edad dispuesta es negativa");
        }
        this.edadminima = edadminima;
    }

    @Override
    public boolean valida(Persona p) {
        if(p.edad<edadminima){
            return false;
        }else{
            return true;
        }
    }

    //el profesor va a dar la clase main
}
