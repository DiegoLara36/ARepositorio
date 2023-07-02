package Exceptions;

import java.io.IOException;

public class ExeptionSample6 {

    public static void main(String[] args)  {
        System.out.println("Antes de la excepcion");
        String nombre= null;
        try {
            printValue(nombre);

        }catch(Exception e ){
            //    e.printStackTrace();
            //toda/ la trazadeerror
            System.out.println("error al imprimir la cadena");
        }finally {
            System.out.println("codigo que siempre se ejecutara");
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
    public static void printValue (String nombre) throws IOException {
        System.out.println("valro de la longitud "+nombre.length());

    }
    //IOexeption ---> exception (todo ioexeption es un exeption=
    //tratar las mas especifica
}
    //hay dos tipos de exceptcion chequeadas yt no cheqieadas

    //no chequeadas no obligan, puedes no ponerla

    //chequeada: el metodo a llamar bota una excepcion, se debe tratarla
     //si se le pone trycach, no es necesario thow
    //si el metodo no la trata
//      aplciacion
//      no esta permitido biblioteca )anchas)

