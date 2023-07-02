package Exproblemas.Mioproblemo.Parcial;

public class GuiaException extends  RuntimeException{
    private static String msgError = "se presentaron los siguientes errores";
    public GuiaException(String string){
        super(msgError + " : " + string);
    }

    public GuiaException(){
        super(msgError);
    }
}

