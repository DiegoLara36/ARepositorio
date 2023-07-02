package exColecciones.SetSample;

import java.util.HashSet;
import java.util.Set;

public class SetOperaciones {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(1);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(1);
        set2.add(6);
        set2.add(6);
        set2.add(11);
        set2.add(13);
        System.out.println(set2);

        Set<Integer> setUnion = new HashSet<>(set1);
        //incializado en set1
        Set<Integer> setInterseccion = new HashSet<>(set1);
        Set<Integer> setDiferencia = new HashSet<>(set1);

        System.out.println("union de conjuntis");
        setUnion.addAll(set2);
        System.out.println(setUnion);


        System.out.println("interseccion de conjuntos");
        setInterseccion.retainAll(set2);
        System.out.println(setInterseccion);

        System.out.println("diferencia de conjuntos");
        setDiferencia.removeAll(set2);
        System.out.println(setDiferencia);
    }
    //Comparator

    //SET CON STRING


}
