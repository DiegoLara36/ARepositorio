package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Productos p1 = new Productos("001", "Pancfrances", 0.3f);
        Productos p2 = new Productos("002", "PanChuta", 4.5f);
        Productos p3 = new Productos("003", "PanBaguette", 6.0f);
        Productos p4 = new Productos("005", "pandemantequilla", 0.7f);
        Productos p5 = new Productos("006", "PanSerrano", 4.0f);
        Productos p6 = new Productos("007", "PanBaguette", 0.7f);
        Productos p7 = new Productos("008", "PanSalado", 0.3f);
        List<Productos> plistpan1 = new ArrayList<>();
        plistpan1.add(p1);
        plistpan1.add(p5);
        plistpan1.add(p3);
        plistpan1.add(p4);
        plistpan1.add(p6);
        plistpan1.add(p7);
        List<Productos> plistpan2 = new ArrayList<>();

        plistpan2.add(p2);
        plistpan2.add(p3);
        plistpan2.add(p7);
        List<Productos> plistpan3 = new ArrayList<>();
        plistpan3.add(p2);
        plistpan3.add(p5);
        plistpan3.add(p6);
        Maestro maestro1 = new Maestro(123456, "Maximo", "jrPeru", 12, 23, plistpan1);
        Maestro maestro2 = new Maestro(123456, "Damocles", "jrEsparta", 4, 2, plistpan2);
        Maestro maestro3 = new Maestro(123456, "Armenides", "jrPezet", 2, 0, plistpan3);

        System.out.println(maestro1);
        System.out.println(maestro2);
        System.out.println(maestro3);
       /*List<Productos> list1 = new ArrayList<>();
        System.out.println(list1);
*/
/*
        Sistema s1 = new Sistema(maestro1);
        Sistema s2 = new Sistema(maestro2);
        Sistema s3 = new Sistema(maestro3);
        System.out.println("ela porte del maestro 1 es "+s1.Aporte());
        System.out.println("ela porte del maestro 2 es "+s2.Aporte());
        System.out.println("ela porte del maestro 3 es "+s3.Aporte());
        */
        Maestro[] maestrose = new Maestro[3];
        ArrayList<Maestro> maestroconarraylist = new ArrayList<>();
        maestroconarraylist.add(maestro1);
        maestroconarraylist.add(maestro2);
        maestroconarraylist.add(maestro3);


        //ordenar el aporte de los maestros

/*      SIN STATIC
        Sistema s4 = new Sistema();
        System.out.println("aporte(11) 1: " + s4.Aporte(maestro1));
        System.out.println("aporte (10.5) 2: " + s4.Aporte(maestro2));
        System.out.println("aporte (8.5) 3 : " + s4.Aporte(maestro3));
        //LOS MISMO QUE LO DE ARRIBA
*/
        //CON STATIC
        System.out.println("APORETES CON LA clase sistema Estatica");
        System.out.println("aporte 1: " + Sistema.Aporte(maestro1));
        System.out.println("aporte 2: " + Sistema.Aporte(maestro2));
        System.out.println("aporte 3: " + Sistema.Aporte(maestro3));

        List<String> nombreeventos = new ArrayList<>();
        nombreeventos.add("mistura");
        nombreeventos.add("casacriolla");
        nombreeventos.add("rinconcitopunenio");
        nombreeventos.add("casaelmanjarblanco");
        nombreeventos.add("casillerodeldiablo");

        System.out.println(nombreeventos);
        Admin admin1 = new Admin(6778909, "sofocles", "jrpochita", 14, "universitario", nombreeventos);
      /*  List<Admin> soyadmin = new ArrayList<>();
        soyadmin.add(admin1);
       // Collections.sort(soyadmin,Sistema.comparacionferia);
        System.out.println("-------------------------------");
        System.out.println("comparacion por feria");
        System.out.println(soyadmin);
        for(Admin s: soyadmin){
            s.getNombredeeventos();
        }
        System.out.println("-------------------------------");
*/
        /*
        Collections.sort(lista1, Posibilidad.comparacionpornombre);
        System.out.println(lista1);

        for (Posibilidad s : lista1) {
            System.out.println(s.getNombre());
        }
        */
        // Collections.sort()
        //se debe colocar el array list de maestro
        System.out.println("mostrando uno solo");
        Collections.sort(maestroconarraylist, Maestro.comparacionnombre);
        for (Maestro s : maestroconarraylist) {
            System.out.println(s);
        }
        System.out.println("mostrando todos los datos");
        System.out.println(maestroconarraylist);
        //como ordenar una colleccion dentro de una collecion de objetos
        //los ordeno 1 por uno
        //Collections.sort(maestroconarraylist<Productos>,Productos.comparacionporprecio);

        //con un comparable en la clase


    }
}
