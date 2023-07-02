package Exceptions;

public class Exceptionbasic {

    public static void main(String[] args) {

        int a=5;
        int b=0;

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e ){
            System.out.println("division entre zero ctv");
        }

        String s ="aeamano";
        String f="profokiev";
        //no puedes
        try{
            int[] numeros = {1,2,3};//se puednen incialiar variables
            //en el try
            System.out.println(numeros[19]);
        }catch (Exception e){
            System.out.println("salio mal ");
        }finally{
            System.out.println("el traicach termino");
        }
        //hay muchos tipos de excepciones
        //throws es un etamento que te permite crear un error customizado
        //te permite crear una instancia donde indicar un error a tu medida

        int age =56;
        //chequearedad(12);
        //chequearedad(44);
        System.out.println("...........ejemploprofesor..........");
        String nombre22 = null;

            printValue(nombre22);
            //error de null
            //nullpointerexception>runtimeexpeption??
            System.out.println("despues de la excepciion");
    }
    public static void printValue(String value)throws NullPointerException{
        System.out.println("valor de longutuda "+value.length());
    }
    static void chequearedad(int age){
        if(age<18){
            //AritmeticException es el tipo de excepcion
            throw new ArithmeticException("acceco denegado-tefaltabija");
            //te manda un error personalizado XD
        }else{
            System.out.println("acceso concedido, bienvenido a lahorda");
        }
    }

    //se puede continuar??, no : se interrumpe ele programa
/*
        try{
            //codigo
    }catch(<Tipodeexcepcion><Nombreobjeto>){
            <que decir si hay esxcpetion>
    }catch(){
    <que decir si hay esxcpetion>
    }finally(){

    }
*/


}
