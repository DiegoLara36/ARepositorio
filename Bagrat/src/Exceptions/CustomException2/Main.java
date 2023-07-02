package Exceptions.CustomException2;

import Exceptions.CustomException.CustonException;

public class Main {
    public static void main(String[] args) {
        //si a es menor que b cancelar
        int a = 1;
        int b = 14;
        //trycatch
        Main m = new Main();
        try{
            m.ValidarExcepcion(a,b);
        }catch (CustonException ex){
            ex.printStackTrace();//pintame el erro de mi custom
        }
        System.out.println("finito");

        try{
            ValidarExcepcion2(11,12);
        }catch(CustonException e4){
            e4.printStackTrace();
        }catch(Exception e5){
            System.out.println("no es posible");
        }
        finally{
            System.out.println("error 2 ");
        }

    }

    public void ValidarExcepcion(int a, int b) throws CustonException {
        if (a < b) {
            throw new CustonException("b es mayor que a");
        }
        //funciona la excepcion
    }
    public static void ValidarExcepcion2(int a, int b) throws CustonException {
        if (a < b) {
            throw new CustonException(b+" es mayor que "+a);
        }

        //funciona la excepcion
    }
}