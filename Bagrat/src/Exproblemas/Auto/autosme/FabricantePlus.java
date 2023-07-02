package Exproblemas.Auto.autosme;

import java.util.*;

public class FabricantePlus extends Fabricante {


    public FabricantePlus(String nombre){
        super(nombre);
        autos = new TreeMap<>();//extiende del acnterior pero lo instancio aca
    }

    public  Map<Integer, Set<Auto>> autosPorAnio(){
        //integer, setauto
        Map<Integer,Set<Auto>> autosanio = new TreeMap<Integer, Set<Auto>>();
            for(Map.Entry<String,Set<Auto>> map  : autos.entrySet()){
                //setautos es un set autoauxiliar
                Set<Auto> setAutos = map.getValue();//conjunto de autos va a tomar los valores de l mapa
                for(Auto auxauto: setAutos){
                    if(!autosanio.containsKey(auxauto.getAnio())){
                        //si autosanio no tieene el mismo anio que el auto llamado
                        Set<Auto> setauto2 = new HashSet<>();
                        setauto2.add(auxauto);
                        autosanio.put(auxauto.getAnio(),setauto2);
                        //un mismo anio de auto para un set de autos ¿??
                    }else{
                        //autosanio si tieen el mismo auto del autollamado
                        Set<Auto> setauto2 = autosanio.get(auxauto.getAnio());
                        setauto2.add(auxauto);

                    }
                }
            }
            return autosanio;
           /*List<Auto> autoslist = new LinkedList<>();
        //correspondencia ordenada por anios
        for(Map.Entry<String,Set<Auto>> map : autos.entrySet()){
                if(autospluss!=null) {
                    autospluss = new TreeMap<>();
                }
                //es el set
            //para cada set de cada key agregar a la lista;
             for(Auto s: map.getValue()){
                 autoslist.add(s);
             }
        }
        //los autos ya estan oredenados por el tree??
        Collections.sort(autoslist);
        for(int i=0;i< autoslist.size();i++){
            autospluss.put(autoslist.get(i).getAnio(),autoslist.get(i));
        }
        return autospluss;*/
    }
    public Map<Integer,Integer> numeroDeAutosPorAnio(){
            //devuelve correspondecia de autos anio por anio
        Map<Integer,Integer> autosAnio = new TreeMap<>();
        for(Map.Entry<String, Set<Auto>> map : autos.entrySet()){
            Set<Auto> setautos = map.getValue();
            //setautos almacena los valores de una key de una auto
            for(Auto auto: setautos){
                if(autosAnio.containsKey(auto.getAnio())){
                    Integer valor = autosAnio.get(auto.getAnio())+1;
                    autosAnio.put(auto.getAnio(),valor);
                }else{
                    //en caso no este
                    autosAnio.put(auto.getAnio(),1);
                }
            }
        }
        return autosAnio;
    }





}
