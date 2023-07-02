package Exproblemas.Natacion;

public class NatacionException extends RuntimeException{
    private static String msgError = "El evento de Natacion tuvo el siguiente error: ";
    public NatacionException(String string) {
        super(msgError + " : " + string);
    }
    public NatacionException() {
        super(msgError);
    }
}
