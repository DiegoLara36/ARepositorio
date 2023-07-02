package Exceptions.CustomException2.prf;

public class ValidaCheckedException {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        try {
            validaPrimerMiembroMayor(a,b);
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("final");
        }
        System.out.println("final del programa");
    }
    public static void validaPrimerMiembroMayor(int a, int b) throws MyCheckedException {
        if(a<b){
            throw new MyCheckedException("a no debe ser menor a b");
        }
        System.out.println(b);
    }
}
