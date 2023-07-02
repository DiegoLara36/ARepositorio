package exColecciones.Comparable.Comparable2;

import exColecciones.Mapsample.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //queiro comparar con el prarametro que desee
    Persona p1 = new Persona("daniel",45,true);
    Persona p2 = new Persona("Armando",67,false);
    Persona p3 = new Persona("Zamuel",33,true);
    Persona p4 = new Persona("Manuel",67,false);

    @Override
    public String toString() {
        return "Main{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }
}
