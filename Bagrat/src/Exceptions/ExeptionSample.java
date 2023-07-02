package Exceptions;

import javax.swing.plaf.RootPaneUI;

public class ExeptionSample {

    public static void main(String[] args) {
        System.out.println("Antes de la excepcion");
        String nombre= null;
        try{
            printValue(nombre);
        }catch (RuntimeException e){
            System.out.println("error al imprimir la cadena "+e);
        }
        System.out.println("despus de la cadena");
    }
    //ejecuta porint value
    // no se puede, entonces thows (tirame un runtimeexception), no se puede
    //entonces lo agarro en catch

    public static void printValue (String nombre) throws RuntimeException{
        System.out.println("valro de la longitud "+nombre.length());
    }
}
