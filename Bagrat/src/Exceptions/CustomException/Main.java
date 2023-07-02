package Exceptions.CustomException;

public class Main {


    public static void main(String[] args) {

        String usuario, pasward, repasward;
        usuario = "Cholopayet";
        pasward = "123";
        repasward = "12";
        MiHelper h1 = new MiHelper();
        try{
            h1.ValidarPasword(pasward,repasward);
        }catch (CustonException e){
            e.printStackTrace();//pintame el error de mi custom
        }
        System.out.println("fimito");
    }
}
