package Exproblemas.Auto.main;

import Exproblemas.Auto.autos.Auto;
import Exproblemas.Auto.autos.Fabricante;

import java.util.ArrayList;
import java.util.Collections;

public class MainAuto {

    public static void main(String[] args) {

        Auto a1 = new Auto("fordmustang","gargamel787878555",4,2,2013);
        Auto a2 = new Auto("imnotinlove","gargamel787878555",4,2,2013);
        Auto a3 = new Auto("justvbeacause","zargamel787878555",4,2,2013);
        System.out.println("son igauels: "+a1.equals(a2));
        //mismo nivel equals
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
       /* for(Auto s : autos){
            System.out.println(s.getAnio()+s.getNivel());
        }
        Collections.sort(autos);
        for(Auto s : autos){
            System.out.println(s.getAnio()+s.getNivel());
        }*/
        System.out.println(autos);
        Collections.sort(autos);
        System.out.println(autos);

        String cadena = "Leon,5GZCZ43D13S812721,4/15/2020#Arona,SGZCZ43D13S812716,4/15/2020#Ateca,KLATF08Y1VB363637,4/15/2020#Ateca,WP0ZZZ99ZTS392125,4/15/2020";
        Fabricante fb = new Fabricante("artemosk");
        fb.leeAutos(cadena);//funciona
    }
}
