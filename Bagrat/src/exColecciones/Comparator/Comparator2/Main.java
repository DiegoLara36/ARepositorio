package exColecciones.Comparator.Comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class Main {

    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<<<<<USANDOCOMPARATOR>>>>>>>>>>>>>>>");

        Posibilidad p1 = new Posibilidad("Caella3s", 25, 0.00005f);
        Posibilidad p2 = new Posibilidad("Un-Ellacpre", 22, 0.00007f);
        Posibilidad p3 = new Posibilidad("PaEllabrit", 27, 0.000000000001f);
        Posibilidad p4 = new Posibilidad("Un-unixD", 19, 0.000000001f);

        //Collections.sort();
        List<Posibilidad> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        lista1.add(p3);
        lista1.add(p4);

        Collections.sort(lista1, Posibilidad.comparacionporedad);
        System.out.println(lista1);

        for (Posibilidad s : lista1) {
            System.out.println(s.getEdad());
        }
        Collections.sort(lista1, Posibilidad.comparacionpoposibilidad);
        System.out.println(lista1);

        for (Posibilidad s : lista1) {
            System.out.println(s.getPosibilidad());
        }

        Collections.sort(lista1, Posibilidad.comparacionpornombre);
        System.out.println(lista1);

        for (Posibilidad s : lista1) {
            System.out.println(s.getNombre());
        }


        //es una clase estatica eso significa que la puedo llamar son ningun porblema
    }
}
