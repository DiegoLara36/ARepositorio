package Exceptions.parte2;

public class Exceptionbasic3 {

    public static void main(String[] args) {
        System.out.println("antes de la excepcion");
        String nombre = null;
        printValue(nombre);
        System.out.println("despues de la exepcion");
    }
    public static void printValue(String value)throws NullPointerException{
        System.out.println("valor de longutuda "+value.length());
    }
    /*static void chequearedad(int age){
        if(age<18){
            //AritmeticException es el tipo de excepcion
            throw new ArithmeticException("acceco denegado-tefaltabija");
            //te manda un error personalizado XD
        }else{
            System.out.println("acceso concedido, bienvenido a lahorda");
        }
    }

    //se puede continuar??, no : se interrumpe ele programa

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
