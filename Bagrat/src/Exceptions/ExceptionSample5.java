package Exceptions;

import java.util.concurrent.ExecutionException;

public class ExceptionSample5 {
    public static void main(String[] args)  {
        System.out.println("Antes de la excepcion");
        String nombre= null;
        try {
            printValue(nombre);
        }catch(Exception e ){
                //    e.printStackTrace();
            //toda/ la trazadeerror
            System.out.println("error al imprimir la cadena");
        }
        System.out.println("Despues de la exepcion: ");
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
    public static void printValue (String nombre) throws  RuntimeException{
        System.out.println("valro de la longitud "+nombre.length());
    }
}
