package exColecciones.ListSample;
import java.util.*;

public class Ejecutar {

    public static void main(String[] args) {

            //interface .... implementacion
        //buena practica de progrmacion
        auxpav a1 = new auxpav();
        a1 = new auxpav("Mariano");//le da otro valor al objeto



        List<String> lista1 = new ArrayList<>();
        List<Integer> lista2 = new LinkedList<>();
        //rodenarar un arraylist

        //List<Integer> lista3 = new LinkedHashSet<>();
        //ArrayList<String> lista1 = new ArrayList<>();
        //tu eres un arraylist pero te comportas como un list
        lista1.add("Vlad");
        lista1.add("sergei");
        lista1.add("Miroslav");
        lista1.add("abigail");
        lista1.add("zoraida");
        //orden antes
        System.out.println("orden antes");
        for(String s: lista1){
            System.out.println(s);
        }
        //sort con comparator f

        Collections.sort(lista1);
        //burbuja compare to

        //programando sobre una interface
        System.out.println("orden despues");
        for(String s: lista1){
            System.out.println(s);
        }

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(50);
        lista2.add(13);
        lista2.add(1);
        System.out.println("---------------------------------");
        System.out.println("antes del cambio");

        for(Integer s: lista2){
            System.out.println(s);
        }
        Collections.sort(lista2);
        System.out.println("despues del cambio");
        for(Integer s: lista2){
            System.out.println(s);
        }

    }


}
