package enumSimple.TestEnumatributos;

import Dirigida2.Empleadodatos.Empleado;

enum Equipo {
    BARCELONA("FC Barcelona",2),
    MADRID ("RealMadridFC",1),
    SEVILLA ("SevillaFC",5),
    VILLAREAL("villarealFC",4);
    ;


    private String nombreCLub;
    private int puestoLiga;

    Equipo(String nombreCLub, int puestoLiga) {
        this.nombreCLub = nombreCLub;
        this.puestoLiga = puestoLiga;
    }

    public String getNombreCLub() {
        return nombreCLub;
    }

    public int getPuestoLiga() {
        return puestoLiga;
    }
}

public class TetEquipo {
    public static void main(String[] args) {
        Equipo halamadrid = Equipo.MADRID;
        Equipo barca = Equipo.BARCELONA;
        Equipo sevilla = Equipo.SEVILLA;
        System.out.println(halamadrid.toString());
        System.out.println(halamadrid.name());
        System.out.println(halamadrid.compareTo(sevilla)); //-1 (menorq sevilla), //+1 (mayor que semilla)
        System.out.println(halamadrid.getNombreCLub());
        System.out.println(halamadrid.getPuestoLiga());
        //vararge
        /*int numeros[]={1,2,3,4,5};
        System.out.println(add(numeros));
        public static int add (int... numeros){
            //uso para meter un arreglo de n argumentos sin necesidad de declarar un array o int/float/double
            int contador =0;
            for(int x:numeros){
                contador = contador +x;
            }
            return contador;
        }
        */

    }

}
