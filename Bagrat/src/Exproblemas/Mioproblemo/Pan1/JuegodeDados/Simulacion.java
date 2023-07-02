package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

import java.util.List;
import java.util.TreeMap;

public interface Simulacion {

    int simula();//resultado siempre entero
    List<Integer> experimento(int numSim);
    TreeMap<Integer,Integer> agrupa (List<Integer> list);
    //agrupa enteros y los clasisfica eun un criterio

}
