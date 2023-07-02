package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class RestriccionEdad implements TipoRestriccion{

    private int edadMinima;

    //si edad es negativa, natacion exception (es el q falta)
    //constructor


    public RestriccionEdad(int edadMinima) {
        if(edadMinima<0){
            throw  new NatacionException("la edad no puede ser negativa");
        }
        this.edadMinima = edadMinima;
    }


    @Override
    public boolean valida(Persona p) {
        return p.getEdad()>edadMinima;
        //so es  mayor edad que la edad minima, entonces true
        //si es menor edad que edad minima false
    }
}
