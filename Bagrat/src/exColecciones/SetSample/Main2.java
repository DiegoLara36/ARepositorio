package exColecciones.SetSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {


        //tu eres un hashset pero te comportas como un set
        //INTERFACE------> IMPLEMENTACION
        Set<String> names = new HashSet<>();
        System.out.println("#############HashSet###############");
        names.add("Pizzarro");
        names.add("Bolognesi");
        names.add("Ramon");
        names.add("Andrade");
        names.add("Pizarro");
        names.add("Bolognesi");
        names.add("Ramon");
        //desordenado
        for(String s : names ){
            System.out.println(s);
        }


        Set<String> names2 = new LinkedHashSet<>();
        System.out.println("#############LinkedHashSet###############");
        names2.add("Pizzarro");
        names2.add("Bolognesi");
        names2.add("Ramon");
        names2.add("Andrade");
        names2.add("Pizarro");
        names2.add("Bolognesi");
        names2.add("Ramon");
        //orden de insercion
        for(String s : names2 ){
            System.out.println(s);
        }

        Set<String> names3 = new TreeSet<>();
        System.out.println("#############TreeHashSet###############");
        names3.add("Pizzarro");
        names3.add("Bolognesi");
        names3.add("Ramon");
        names3.add("Andrade");
        names3.add("Pizarro");
        names3.add("Bolognesi");
        names3.add("Ramon");
        //ordenando Strings
        for(String s : names3 ){
            System.out.println(s);
        }

    }
}
