package Exproblemas.Mioproblemo.Parcial;

import java.util.Set;
import java.util.TreeSet;

public class ProgramacionTVPublicidad extends ProgramacionTV{


    public ProgramacionTVPublicidad() {
        super();
    }
    //buscar a un map y agregarle datos

    @Override
    public void agregar(String cadenaTV, ProgramasTV programa) {
        if(!cadenasYProgramas.containsKey(cadenaTV)){
            Set<ProgramasTV> programas = new TreeSet<>();
            //en algun momento lo tengo que agregar
            programas.add(programa);
            Hora horaaux = programa.getHoraFin();
            programas.add(new ProgramasTV("PUBLICIDAD",horaaux,5));
            //le debo agregar un progrma llamado publiccidad
            //con la misma hora al final mas 5 min de duracion
            cadenasYProgramas.put(cadenaTV,programas);
        }else{
            //al set le agrego el programa
            cadenasYProgramas.get(cadenaTV).add(programa);
        }

        //agrega una publicidad de manera automatica de 5 min despues de agregar
        //un programa
    }
}
