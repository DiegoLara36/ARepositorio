package enumSimple.DiaSemana;
enum dias{
    //es como un objeto asociado a la clase
    //al que le puedo dar distintos valores
    //enum : es una clase donde sus constantesson
    //public final y static al mismo tiempo
    LUNES(false),
    MARTES(false),
    MIERCOLES(false),
    JUEVES(false),

    VIERNES(false),
    SABADO(true),
    DOMINGO(true);



    //dias de la semana
    private boolean feriado;
    public boolean isFeriado() {
        return feriado;
    }
    //oncstructor sin public

    dias(boolean feriado) {
        this.feriado = feriado;
    }
}
public class TestEnum2 {
    //no se puede insatnciar solo


    public static void main(String[] args) {

        dias lunes = dias.LUNES;
        dias martes = dias.MARTES;
        dias miercoles = dias.MIERCOLES;
        dias jueves = dias.JUEVES;
        dias viernes = dias.VIERNES;
        dias sabado = dias.SABADO;
        dias domingo = dias.DOMINGO;
        //los dias nonmbrados toman el valor

        System.out.println("ordinal de lunes :"+ lunes.ordinal());
        System.out.println("ordinal del domingo: "+domingo.ordinal());
        //lunes.paridar();

        System.out.println(lunes.isFeriado());
        System.out.println(domingo.isFeriado());
        System.out.println(sabado.isFeriado());
        //ahora si, se le pueden dar atributos alos enum

    }

    }


