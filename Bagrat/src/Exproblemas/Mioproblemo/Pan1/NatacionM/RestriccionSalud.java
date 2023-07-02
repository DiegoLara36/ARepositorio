package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class RestriccionSalud implements TipoRestriccion{


    @Override
    public boolean valida(Persona p) {
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
    //boolean valida es el valor de lo ultimo que cambie
    //si le meto un false
    //se altera todo y ya no sera valida
    //el valor de valida que es publico sera siempre falsa
    //siempre que almenos una sea falsa
            //ENTENDIENDO VALIDACION

}
