package Inputs;

public class Operacion {

    Integer suma,resta;
    String union;
    public int Suma(int a,int b){

        return suma= a+b;
    }

    public int Resta(int a,int b){

        return resta=a-b;
    }

    public String Concatenar(String a,String b){

        return union = a+" "+b;
    }
    public void mostar(int a, int b, String c, String d){
        System.out.println("la suma es: "+suma);

        System.out.println("la resta es: "+resta);

        System.out.println("la union es: "+union);
    }
    public String mostar2(Integer suma,Integer resta, String c, String d){
        //System.out.println("la suma es: "+suma);

        //System.out.println("la resta es: "+resta);

        // System.out.println("la union es: "+union);

        return "los resultados por 2da vez son: "+"\nla suma es: "+suma.toString()+"\nla resta es: "+resta.toString()+"la union es: "+union;
    }




}
