package Hoja_Interactiva_1.HojaInt_1.Aplicacion_StringOrdenBuffermas;

public abstract class Datos {
    //public private p<r
    protected String nombre;
    protected int edad;
    static boolean estado=false;//soltero
    //si eres casado te dan una oferta, no te cobran por retiro


    public Datos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
