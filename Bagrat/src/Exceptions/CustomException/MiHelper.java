package Exceptions.CustomException;

public class MiHelper {

    public MiHelper(){
    }
    //con void
    public void ValidarPasword(String pasword1, String pasword2) throws  CustonException{

        if(!pasword1.equals(pasword2)){
            //si no son iguakes tira el error
            throw new CustonException("las contrasnias no coinciden");
        }
        if(pasword1.length()<8){
            throw new CustonException("El pasword no es lo suficientemente largo");
        }

    }
}
