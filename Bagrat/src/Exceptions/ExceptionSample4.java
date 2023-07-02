package Exceptions;

public class ExceptionSample4 {

    public static void main(String[] args) throws Exception {
        System.out.println("Antes de la excepcion");
        String nombre= null;

            printValue(nombre);
        System.out.println("despues de la exepcion: ");
        //)(((bi se caiga dos fomras
        //metodo con una excpetion

            //runtime = uncheck (no chequeadas)
            //las que ve el compilaor son las hecked
            //el compliador te obliga a trtar lascexception
            //bandero
    }
    //ejecuta porint value
    // no se puede, entonces thows (tirame un runtimeexception), no se puede
    //entonces lo agarro en catch

    public static void printValue (String nombre) throws Exception{
        System.out.println("valro de la longitud "+nombre.length());
    }
}
