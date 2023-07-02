package Ejercicios.Vararg;

public class Prueba {

    public static void main(String[] args) {
        System.out.println(add(1));
        int[] numeros = {1,2};
        int[] numeros3 = {1,2,3};
        System.out.println(add(numeros));
        System.out.println(add(numeros3));
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2,3,4));

        System.out.println("numeritos1:"+add2(1,3,4,5,100));
        int numeritos[]= {100,200,300};
        System.out.println("numeritos2 "+add2(numeritos));
  }
    public static int add (int... numeros){
        //uso para meter un arreglo de n argumentos sin necesidad de declarar un array o int/float/double
        int contador =0;
        for(int x:numeros){
            contador = contador +x;
        }
        return contador;
    }



    public static int add2(int... num){
        int cont2=0;
        for(int s: num){
            cont2 = cont2 + s;
        }
        return cont2;
    }

}
