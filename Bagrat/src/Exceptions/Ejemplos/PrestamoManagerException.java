package Exceptions.Ejemplos;

public class PrestamoManagerException extends Exception {
    private static String msgError = "El prestamo no se pudo realizar con exito";
    public PrestamoManagerException(String string) {
        super(msgError + " : " + string);
    }
    public PrestamoManagerException() {
        super(msgError);
    }
    // dos casos para que me de eror
    //constructor
    //super de Exception

}
