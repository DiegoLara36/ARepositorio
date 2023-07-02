package enumSimple;

import java.sql.SQLOutput;

enum Posicion {
    PORTERO, // 0
    DEFENSA, //1
    CENTROCAMPISTA, //2
    DELANTERO}; ///3
//constantes enumeradas

public class TestEnum {

    public static void main(String[] args) {
            //ejemploSimple();
        ejemploElaborado();
    }

        //los enum tienen posiciones definidas desde el cero
    private static void ejemploElaborado(){
        Posicion delantero = Posicion.DELANTERO;
        Posicion defensa = Posicion.DEFENSA;
        Posicion centrocampista = Posicion.CENTROCAMPISTA;
        System.out.println("delantero.name: "+delantero.name());
        System.out.println("defensa.toString(): " +defensa.toString());
        System.out.println("delantero.ordinal(): "+delantero.ordinal());

        System.out.println("delantero.compareTo(portero): "+delantero.compareTo(defensa));
        System.out.println("delantero.compareTo(delantero): "+delantero.compareTo(delantero));
        System.out.println("centrocampista.compareTo(delantero)"+centrocampista.compareTo(delantero));
        //da -1 centrocampista comparado con delantero esta mas atras
        //centrocampista es menor que delantero en uno
        for(Posicion d : Posicion.values()){
            System.out.println(d.toString()+" - ");
        }
        //es para un conjunto de constantes
        //ejemplos planetas, dias de la semana, mesesdelaño


    }

    private static  void ejemploSimple(){
        Posicion delantero = Posicion.DELANTERO;
        Posicion defensa = Posicion.DEFENSA;
        System.out.println(delantero.name());
        System.out.println(delantero.toString());
        System.out.println(delantero.ordinal());
        System.out.println(delantero.compareTo(defensa));
        System.out.println(Posicion.values())
        ;
    }


}
