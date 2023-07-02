package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class NatacionException extends RuntimeException{
    //por sentido comun es una restriccion nochequeada
    public NatacionException(String string){
       super(string);
       //string o mensaje es lo mismo
    }
    //constructor que va heredar el runtimeexeption
        public NatacionException(){
           //porseacaso
    }

}

