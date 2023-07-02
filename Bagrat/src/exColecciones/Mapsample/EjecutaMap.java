package exColecciones.Mapsample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjecutaMap {

    public static void main(String[] args) {
    //      mapStringInteger();
        //el mapa necesita un objeto???
        Map<String,Person> map1 = new HashMap<>();
        map1.put("2004567f",new Person("Jaime Saavedra",15));
        map1.put("2003345t",new Person("Anibal Barca",16));
        map1.put("1776566k",new Person("Napoleon Bonaparte",45));
        map1.put("3121255l",new Person("Zion Zapata",56));
        map1.put("5666666k",new Person("Pepe Veraz",40));
        //creo el mapa
        //y luego le agrego los dats con map1.put

        System.out.println(map1);
        //mapStringInteger();
        //implementacion hashmap no garantiza el orden, pero te da
        //un diciconario
        //orden de llegada el esl tree

        //hashmap:          al azar
        //linkedhashmap     ordenacion por introdiuccion
        //treemap           ordenacion por orden natural(Se ordena solo)
        System.out.println(map1);
        Map<String,Person> map2 = new TreeMap<>();
        map2.put("2004567f",new Person("Jaime Saavedra",15));
        map2.put("2003345t",new Person("Anibal Barca",16));
        map2.put("1776566k",new Person("Napoleon Bonaparte",45));
        map2.put("3121255l",new Person("Zion Zapata",56));
        map2.put("5666666k",new Person("Pepe Veraz",40));
        System.out.println("..........................................");
        System.out.println("conversion ");
        System.out.println(map2);
        //lo oerdena segun el primer factor
        Map<Integer,String> map3 = new TreeMap<>();
        map3.put(3,"aniblal");
        map3.put(6,"zion");
        map3.put(2,"deutoronomio");
        map3.put(7,"lilith");
        map3.put(1,"gabriel");
        System.out.println(map3);
        //legen dos valores a map3
        //person,
        //Integer n1 = new Integer(14);
        Map<Integer,Person2> map4in = new TreeMap<>();
        map4in.put(12,new Person2("adanel"));
        map4in.put(11,new Person2("zdanel"));
        map4in.put(17,new Person2("bdanel"));
        map4in.put(13,new Person2("vdanel"));
        System.out.println(map4in);
        //con comparator se le puede indicar el orden deseado, hay dos tipos
        // de comparator
        //treemap orden automatico
        //hashmap alwebo
        //linkedmap orden
    }
   private static void mapStringInteger() {
        Map<String,Integer> alumnosmap = new HashMap<>();
        alumnosmap.put("Mario",45);
        alumnosmap.put("dario",3000);
        alumnosmap.put("Alexander",2950);
        alumnosmap.put("Anibal",2500);

        System.out.println(alumnosmap);
        System.out.println("alumnosmap.get('Alexander')= "+alumnosmap.get("Alexander"));

        for(String sx: alumnosmap.keySet()){
            System.out.println(sx);
        }
        for(Integer sf: alumnosmap.values()){
            System.out.println(sf);
        }

    }
}
