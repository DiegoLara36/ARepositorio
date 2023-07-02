package exColecciones.ListSample;

import java.io.StringBufferInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("toyota");
        cars.add("wolkswagen");
        cars.add("ford");
        cars.add("tesla");
        cars.add("hyundai");
        cars.add("BMW");

        System.out.println("numero de elementos: "+cars.size());
        System.out.println("Antes de ordenar los carros");
        System.out.println("desordenado");
        for(String s: cars){
            System.out.println(s);
        }/*
        String aux=null;
        for(int i=0;i<cars.size()-1;i++){
           for(int j=0;j<cars.size()-i-1;j++){
                 if(cars.get(j).compareTo(cars.get(j+1))>0){
                     aux = cars.get(j+1);
                     cars.add(j+1,cars.get(j));
                     cars.add(j,aux);
                 }
           }
        }
        /*
        System.out.println("ordenado");
        for(String s2: cars){
            System.out.println(s2);
        }

        /*   for(int i=0;i<nombres2.length-1;i++){
            for(int j=0;j<nombres2.length-i-1;j++){
                if(nombres2[j].compareTo(nombres2[j+1])>0){
                    aux2=nombres2[j+1];
                    nombres2[j+1]=nombres2[j];
                    nombres2[j]=aux2;
                }
            }
        }
        * */
        System.out.println("--------------------------------");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            String itString = iterator.next();
            System.out.println(itString);
        }

        System.out.println();
        System.out.println("despues de ordenar");
        //ordenar list
        Collections.sort(cars);

        for(String s2:cars){
            System.out.println(s2);
        }

        //cambiar el valor cars.set(i,"tuvieja");
        //remover  cars.renove(i);
        //cars.clear(i);
        //borra los elementos de un item
        cars.clear();


    }



}
