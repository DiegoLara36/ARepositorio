package exColecciones.Mapsample;

import Exproblemas.Auto.autos.Auto;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Map2 {

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        //interfaces ..... implementaciones
        hm.put("Nestor", 8);
        hm.put("Daniel", 39);
        hm.put("Anacleta", 35);
        hm.put("Zorraida", 26);
        hm.put("Bartolomeo", 34);
        //lo guarda pero no te garazntiza el orden

        System.out.println("###########Hashmap###########");
        System.out.println(hm);

        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Nestor", 8);
        lhm.put("Daniel", 39);
        lhm.put("Anacleta", 35);
        lhm.put("Zorraida", 26);
        lhm.put("Bartolomeo", 34);
        //linekd hashmap, se garantiza el orden de insercion

        System.out.println("###########LinkedHasgMap#############");
        System.out.println(lhm);

        Map<String, Integer> tm = new TreeMap<>();
        tm.put("Nestor", 8);
        tm.put("Daniel", 39);
        tm.put("Anacleta", 35);
        tm.put("Zorraida", 26);
        tm.put("Bartolomeo", 34);
        //orden natural, el orden segun el String
        System.out.println("#############TreeMap###########");
        System.out.println(tm);

        Map<Integer, String> tm2 = new TreeMap<>();
        tm2.put(8, "Nestor");
        tm2.put(39, "Daniel");
        tm2.put(35, "Anacleta");
        tm2.put(26, "Zorraida");
        tm2.put(34, "Bartolomeo");
        System.out.println("#############TreeMap2(alrevez)###########");
        System.out.println(tm2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>APREMDIENDO<<<<<<<<<<<<<<<<<<<<<");
        //aprendiendo maps de verdad
        Map mappy = new HashMap();//no garantiza el orden
        mappy.put("key1", "valor1");
        mappy.put("key2", "valor2");
        mappy.put("key3", "valor3");
        mappy.put("key4", "valor4");
        mappy.put("key5", "valor5");
        mappy.put("key6", "valor6");
        mappy.put("key7", "valor7");

        System.out.println(mappy);
        System.out.println(mappy.get("key8"));//if key not exist return null;
        //iterator???
        ///////////////////////////////////////////////////////////////////////////////////
        ///VALORES DE LOS KEYYS Y  DEL LOS VALUES
        System.out.println("soutenado");
        for (Object key : mappy.values()) {
            System.out.println(key);
        }//son objetos aahh son objetos del key'
        for (Object key2 : mappy.keySet()) {
            System.out.println("key: " + key2 + ", value: " + mappy.get(key2));
        }
        ///////////////////////////////////////////////////////////////////////////////////
        System.out.println("MAPPY2");
        Map<String, String> mappy2 = new HashMap();//no garantiza el orden
        mappy2.put("key1", "valor1");
        mappy2.put("key2", "valor2");
        mappy2.put("key3", "valor3");
        mappy2.put("key4", "valor4");
        mappy2.put("key5", "valor5");
        mappy2.put("key6", "valor6");
        mappy2.put("key7", "valor7");
        //el orden de map es el mismo para la misma instancia??
        for (String key : mappy2.keySet()) {
            System.out.println("key: " + key + "--value: " + mappy2.get(key));
        }

        //como cambiar
        Map<String, Integer> palagbras = new HashMap<>();
        palagbras.put("hello", 1);
        palagbras.put("goodbye", 2);
        palagbras.put("mrs jones", 3);
        //arrow operator in java,
        palagbras.computeIfPresent("hello", (k, v) -> v + 13);
        System.out.println(palagbras.get("hello"));
        palagbras.put("mrs jones", 45);
        palagbras.put("goodbye", 5);
        //se reemplaza xD
        //elimina si encuentra un key de ese valor
        palagbras.computeIfPresent("goodbye", (key, value) -> null);
        //palagbras.put("tumama",null);//lo reemplaza sin su valor
        //palagbras.put("hello",null);//lo vuelve nulo pero no lo elimina

            //palagbras.computeIfAbsent("mrsjones",(key,value)->value+100);
            //no compila
        System.out.println(palagbras);
        //palagbras.computeIfAbsent("tumama",12);// no sirvexD
        System.out.println(palagbras.containsKey("hello"));//devuelve boolean
        System.out.println(palagbras.containsValue(45));//debuelve boole;

           Map<String , Set<Auto>> mapaa = new TreeMap<>();
            Set<Auto> autosmain = new TreeSet<>();
            autosmain.add(new Auto("escarabajo","52345678952345676",2,4,1960));
            autosmain.add(new Auto("r8","42345678944234567",3,5,2001));
        mapaa.put("gmany",autosmain);
        Auto auto1 = new Auto("prosche","62345678944234567",4,6,1995);
        System.out.println(mapaa);
        mapaa.put("gmany",autosmain);
        Auto auto2 = new Auto("krupp","22345678944234567",3,2,1919);
        Auto auto3 = new Auto("Audi","82345678944234567",4,6,2004);
        Auto auto4      = new Auto("opel","72345678944234567",7,6,2010);
        Auto auto5 = new Auto("bmw","92345678944234567",4,9,1996);
        if(mapaa.containsValue(autosmain.contains(auto1))){
            System.out.println("si lo contiene");
        }else{
            System.out.println("no los contiene" );
        }
        Set<Auto> autosmain2 = new TreeSet<>(Set.of(auto2,auto3,auto4,auto5));

      //  mapaa.computeIfPresent("gmany",(u,v)->v.add(auto1));
        mapaa.get("gmany").add(auto1);//funciono
        //consigo el valor correspodiente a la key y luego le agrego el objeto auto1
        System.out.println(mapaa);
        //agregar un array de autos
        //interseccion de conjuntos, uniion de conjkuntos, difemcia de conjuntos
        //addALL , union
        //retaim, interseccion
        //removeall, diferencia
        //deben declararse antes

        Set<Auto> union = new TreeSet<>(autosmain);
        union.addAll(Set.of(auto2,auto3,auto4));
        System.out.println("autos unidos 1: \n"+union);
        //agregando uno mas
        union.add(new Auto("berlin","62456789723446578",3,6,1955));
        Set<Auto> union2 = new TreeSet<>(autosmain);
        System.out.println("autos unidos 1: \n"+union);
        union.addAll(autosmain2);
        System.out.println("autos unidos 2: \n"+union2);
        //diferencia simetrica
        //a-b u b-a
        //
        Set<Auto> autosaux = union; //autosaux
        autosaux.removeAll(union2);//union-union2
        Set<Auto> autosaux2= union2; //union2-union
        autosaux2.removeAll(union);
        autosaux.addAll(autosaux2);
        System.out.println("la diferencia simetrica\n"+autosaux2);

        //agregarle otro set a un map
        System.out.println("antes de agregar:\n"+mapaa);
        //se agrego xD
        mapaa.get("gmany").addAll(union);
        System.out.println("despues de agregar:\n"+mapaa);
        System.out.println(mapaa.get("gmany").contains(auto1));
        System.out.println("valores del mapa por linea");
        for(Map.Entry<String, Set<Auto>> map: mapaa.entrySet() ){
            for(Auto s : map.getValue()){
                System.out.println("valores : "+s.getModelo());
            }
            System.out.println("......................");
        }

        mapaa.put("usa",new HashSet<>(Set.of(new Auto("charger","55555555555555534",3,5,2012),new Auto("camaro","66666666666666676",4,5,1976),new Auto("pontiak","98989895555555534",3,5,1968))));
        for(Map.Entry<String, Set<Auto>> map: mapaa.entrySet() ){
                List<Auto> poranio = new ArrayList<>();
                int cont =0;
            for(Auto s : map.getValue()){
                if(poranio==null){
                    poranio = new LinkedList<>();
                }
                poranio.add(s);
                cont++;
                if(map.getValue().size()==cont){
                    Collections.sort(poranio);
                    //ordnear por anio
                    for(Auto s2 : poranio){
                        Set<Auto> autosanio2= new LinkedHashSet<>();
                        autosanio2.add(s2);
                        if(poranio.lastIndexOf(s2)==poranio.size()){
                            mapaa.put(map.getKey(),autosanio2);
                        }
                    }
                    System.out.println("mostrando el hashset: ");
                    System.out.println(poranio);
                }
            }

            System.out.println("......................");
        }

        System.out.println("mapa reformado : "+mapaa);


    }
}
