package Exproblemas.Mioproblemo.Parcial;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramasTVCortos implements FiltrosProgramas{

     int duracionReferencia;

    public ProgramasTVCortos(int duracionReferencia) {
        this.duracionReferencia = duracionReferencia;
    }

    @Override
    public Set<ProgramasTV> filtro(Set<ProgramasTV> progs) {
        //recibe un conjunto de progrmas
        //y a partir de este evalua si pasan la duracion minina
        Set<ProgramasTV> programasaprobados = new TreeSet<>();

        for(ProgramasTV s : progs){
            if(s.getDuracion()>=duracionReferencia){
                programasaprobados.add(s);
            }
        }

        return programasaprobados;
    }
}
