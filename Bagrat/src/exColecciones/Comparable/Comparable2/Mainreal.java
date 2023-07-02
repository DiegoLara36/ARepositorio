package exColecciones.Comparable.Comparable2;

import exColecciones.Mapsample.Person;

import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainreal {
    public static void main(String[] args) {
        Main m1 = new Main();

        List<Main> lista1 = new ArrayList<>();
        lista1.add(m1);
        System.out.println(lista1);
        System.out.println("........................................................");
        List<Persona> lista2 = new ArrayList<>();
        Persona p1 = new Persona("gabriel",455,false);
        Persona p2 = new Persona("zanabriel",657,false);
        Persona p3 = new Persona("anadriel",353,false);
        Persona p4 = new Persona("pedro",6667,false);
        Persona p5 = new Persona("anadriel",712,false);
        lista2.add(p1);//
        lista2.add(p2);
        lista2.add(p3);
        lista2.add(p4);
        lista2.add(p5);
        System.out.println("antes de comparable");
        System.out.println(lista2);
        //lsita2 comparada con el orden de la edad dada o nombre
        //segun el comparable que hayamos definido, pero
        //solo uno por clase
        System.out.println("despues de comparable");
        Collections.sort(lista2);//le indico el ordenamiento
        System.out.println(lista2);

        //queda

        //no se puede Collections.sort(lista2);
        //ahora si agrego los objetos creados en una clase anterior

        //tomaara todos los datos

        //



    }
}
