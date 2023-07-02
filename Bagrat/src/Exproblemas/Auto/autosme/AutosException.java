package Exproblemas.Auto.autosme;

public class AutosException extends  RuntimeException{
    private static String msgError = "Se presentaron los siguientes errores\n";
    public AutosException(String string){
        super(msgError+ ": "+string);
    }
    public AutosException(){
        super(msgError);
    }
    /*private static String msgError = "se presentaron los siguientes errores";
    public GuiaException(String string){
        super(msgError + " : " + string);
    }

    public GuiaException(){
        super(msgError);
    }*/
}
