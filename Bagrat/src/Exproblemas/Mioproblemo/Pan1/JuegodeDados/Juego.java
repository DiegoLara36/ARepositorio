package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
//funciona la clase
public abstract class Juego implements  Simulacion{
    //clase abstracta que implementa puede usar los metodos que quiera
    public List<Integer> experimento(int numSim){
        if(numSim<=0){
            throw new DadoException("el numero de simulaciones debe ser positivo");
        }
        List<Integer> listaexperimentos = new ArrayList<>();
        for(int i=0;i<numSim;i++){
            listaexperimentos.add(simula());
        }

        return listaexperimentos;
    }
    //solo es un metodo que agrupa
    public TreeMap<Integer,Integer> agrupa (List<Integer> list){
        TreeMap<Integer, Integer> agrupa = new TreeMap<>();
        if(list==null){
            throw  new DadoException("no puedes adjuntar una lista nula");
        }
        for(int i=1;i<=6;i++){
            int cont =0;
            for(Integer s: list){
                if(s==i){
                    cont++;
                }
            }
            if(cont!=0){
                agrupa.put(i,cont);
            }

        }
        return agrupa;
    }//funciona


}
