package exColecciones.SetSample;

import java.util.*;

public class EjecutaSet {

    public static void main(String[] args) {

        Set<String> lista1 = new LinkedHashSet<>();

        lista1.add("vladimir");
        lista1.add("trostsky");
        lista1.add("ivan");
        lista1.add("brezhnev");
        lista1.add("stalin");
        lista1.add("ivan");

        //set, no permite repetidos
        System.out.println(lista1);
        for (String s : lista1) {
            System.out.println(s);
        }

        //hasset            -sin orden
        //linkedhashset     -orden de insercion
        //treeset           -orden natural (automatico)

        Set<Names> set2 = new HashSet<>();//sin orden

        set2.add(new Names("adamel"));
        set2.add(new Names("zofia"));
        set2.add(new Names("basuri"));
        set2.add(new Names("voltaire"));
        set2.add(new Names("Cardemas"));
        //treeset me manda error con objetos
        //hash set no pasa nada;
        //linkedhash set

        System.out.println(set2);
    }

        //set no acepta repetidos

}
