package Exproblemas.Mioproblemo.Pan1.NatacionL;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejecutableee {

    public static void main(String[] args) {
        Profesor p1 = new Profesor("Maldonado", 142, "56734344F", "sargeras_67");

        Alumno a1 = new Alumno("Samuel", 122, "11225698B", "sargeras_67");
        Alumno a2 = new Alumno("Mancocapac", 122, "11225698C", "illidanStormgage_56");
        Alumno a3 = new Alumno("Armoniaca", 142, "812455123B", "ionelectgron_56");
        Alumno a4 = new Alumno("Gargamel", 112, "11225698C", "elbichosiuuu_56");
        Alumno a5 = new Alumno("Zachary", 142, "11225698B", "sargeras_67");
        Alumno a6 = new Alumno("Louis", 162, "11225698A", "messirve_56");
        Alumno a7 = new Alumno("Constantine", 102, "11225698R", "realdeallisa");
        //en base a sesion con restriccion
        //agregar cada uno con su estilo
        //ordenar los alumnos por nombre, con sus estilos, y ejecute sus metodos para cada uno

        System.out.println("<<<<<<<<<<<<<<<<<<Comprobando validacion de alumno y prof>>>>>>>>>>>>>>>");
        //Alumno a8 = new Alumno("Darthes",-5,"asdasdg","gangdalf_stree");
        //Profesor p2 = new Profesor("Dave Musfaine",-6,"121121200","peacesells");
        System.out.println("<<<<<<<<<<<<<<<<<<Comprobando arraylist>>>>>>>>>>>>>>>>>>>>>>>>>");
        Estilo estilolibre = new EstiloLibre();
        Estilo estiloespalda = new EstiloEspalda();
        Estilo estilopecho = new EstiloPecho();
        Estilo estilomariposa = new EstiloMariposa();
        System.out.println("con array");
        List<Estilo> estilos1 = new ArrayList<>();
        estilos1.add(estilolibre);
        estilos1.add(estiloespalda);
        estilos1.add(estilopecho);
        //estilos1.add(estilomariposa);
        a1.agregarEstilo(estilos1);
        System.out.println(a1.estilos);
        System.out.println("uno por uno");
        a2.agregarEstilo(estilolibre);
        a2.agregarEstilo(estiloespalda);
        a2.agregarEstilo(estilopecho);
        a3.agregarEstilo(estilolibre);
        a3.agregarEstilo(estiloespalda);
        a5.agregarEstilo(estilomariposa);
        a5.agregarEstilo(estilopecho);
        a6.agregarEstilo(estilopecho);
        //a2.agregarEstilo(estilomariposa);
        System.out.println(a2.estilos);

        TipoRestriccion tipoRestriccion = new RestriccionEdad(18);
        SesionConRestriccion scr = new SesionConRestriccion(tipoRestriccion);

        scr.darAlta(a1);
        scr.darAlta(a2);
        scr.darAlta(a3);
        scr.darAlta(a5);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<seision conr restrion>>>>>>>>>>>>>>>>>>>>>>>");
        //scr.darAlta(p1);
        System.out.println("antes de ordenar");
        for(Alumno a : scr.getAlumnos()){
            System.out.println(a);
        }/*
        List<Alumno> altest = new ArrayList<>();
        altest.add(a1);
        altest.add(a5);
        altest.add(a6);
        //no puedo acceder al comparator
        Collections.sort(scr.getAlumnos(),Alumno.nameComparatorr);
        //se debe poner el nombre de la clase mrd
        */
        System.out.println("ordenado");
        for(Alumno s: scr.getAlumnos()){
            System.out.println(s);
        }
        //como aplicar todas las clases
        //me muestre todos los estilos

        /*for(Alumno a : scr.getAlumnos()){
            System.out.println();
            System.out.println(a);
            List<Estilo> estilos = a.getEstilos();
            for(Estilo est: estilos){
                System.out.println(est);
                est.movimientoBrazos();
                est.movimientoPiernas();
                est.respiracion();
            }
        }*/
        for(Alumno a: scr.getAlumnos()){
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
            System.out.println(a);
            List<Estilo> estilos =a.getEstilos();
            for(Estilo est: estilos){
                System.out.println(est);
                est.movimientoBrazos();
                est.movimientoPiernas();
                est.respiracion();
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
            }
        }

        System.out.println("EL PROGRAMA FUNCIONA");


    }
}
