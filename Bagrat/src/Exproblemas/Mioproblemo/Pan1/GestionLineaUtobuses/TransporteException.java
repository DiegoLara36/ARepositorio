package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

public class TransporteException extends  RuntimeException{
    private static String msgError = "se presentaron los siguientes errores";
    public TransporteException(String string){
        super(msgError + " : " + string);
    }

    public TransporteException(){
        super(msgError);
    }
}
