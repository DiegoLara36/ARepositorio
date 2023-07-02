package Exceptions.CustomException;

public class CustonException extends Exception {

    public static final long serialVersionUID = 700l;
    //es un valor estatico que se puede llamar desde otras clases

    public CustonException(String string) {
        super(string);//string mensaje, loq sea
    }


}
