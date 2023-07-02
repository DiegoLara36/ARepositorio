package exColecciones.ListSample;

//import Ejercicios.Pelota.Arquero;

import java.lang.module.FindException;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("nestor");
        names.add("zambo");
        names.add("legolas");
        names.add("aragon");
        names.add("kirintor");
        //los da en el orden de inserciond
        for(String s: names){
            System.out.println(s);
        }

        System.out.println("get(2) "+names.get(2));//dame el orden 2
        System.out.println("index de aragon "+ names.indexOf("aragon"));

        System.out.println("kirintor index: "+names.indexOf("kirintor"));
        System.out.println("sargeras index ??:"+names.indexOf("sargeras"));


    }
}
