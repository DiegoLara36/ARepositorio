package Exceptions;

public class ExceptionSample2 {
    public static void main(String[] args) {
        System.out.println("Antes de la excepcion");
        String nombre = null;
        printValue(nombre);
        //sin trycatch no atrapa la  excepcion
        //catch es atrapar
        //trows si esta webada falla lanza runtimeexept
    }
    public static void printValue (String nombre) throws RuntimeException {
        System.out.println("valro de la longitud "+nombre.length());
    }
    //no pide trycatch porque es runtime

}
