package Exceptions.parte2;

public class Exceptionbasic4 {

    public static void main(String[] args) {

        //hay muchos tipos de excepciones
        //throws es un etamento que te permite crear un error customizado
        //te permite crear una instancia donde indicar un error a tu medida

        //chequearedad(12);
        //chequearedad(44);
        System.out.println("...........ejemploprofesor..........");
        String nombre22 = null;


             //   printValue(nombre22);
                //el metodo puede mostrar una excepcion
                //no es runtime es una exepcion chequeada
                //runtime


            //error de null
            //nullpointerexception>runtimeexpeption??
            System.out.println("despues de la excepciion");
    }
    public static void printValue(String value)throws Exception{
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
