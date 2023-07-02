package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

public class DadoException extends  RuntimeException{
    public static String msgError = "se presentaron los siguientes errores";
    public DadoException (String string ){
        super (msgError+": "+string);
    }
    public DadoException(){
        super(msgError);
    }

}
