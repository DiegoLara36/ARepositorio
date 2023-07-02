package Exceptions.CustomException2.prf;

enum TIPOCELULAR {

    ANDROID,
    IPHONE,
    BLACKBERRY
}

public class ThrowException {
    public static void main(String[] args) throws MyCheckedException {
        int a = 0;
        int b = 2;
        validaPrimerMiembroMayor(a,b);

        int monto = -4;
        try{
            validaNoNegativa(monto);
        }catch (Exception e){
            e.printStackTrace();;
        }
        System.out.println("despues de validar negativo");

        TIPOCELULAR tipo = TIPOCELULAR.ANDROID;

        switch(tipo) {
            case IPHONE:
                System.out.println("android");
                break;
            case ANDROID:
                System.out.println("iphone");
                break;
            case BLACKBERRY:
                System.out.println("blackberry");
                break;
        }

    }
    public static void validaPrimerMiembroMayor(int a, int b) throws MyCheckedException {
        if(a<b){
            throw new MyCheckedException("a no debe ser menor a b");
        }
        System.out.println(b);
    }

    public static void validaNoNegativa(int monto) throws NoNegativoException {
        if(monto < 0){
            throw new NoNegativoException("Valor No puede ser negativo");
        }
    }

}

