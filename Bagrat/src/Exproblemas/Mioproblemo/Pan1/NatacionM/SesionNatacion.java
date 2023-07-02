package Exproblemas.Mioproblemo.Pan1.NatacionM;

import Exproblemas.Natacion.NatacionException;
import exColecciones.Mapsample.Person;

import java.util.ArrayList;
import java.util.List;

public class SesionNatacion {
    //se le dio protected para qie sesionconrestriccion acceda
        //a estos sin ncesidad de un getter
    protected Profesor profesor;
    protected List<Alumno> alumnos = new ArrayList<>();
    /*Profesor p1 = new Profesor(142,"Maldonado","56734344F","sargeras_67");
    Alumno a1 = new Alumno(122,"samuel","11225698B","illidanStormgage_56");
    Alumno a2 = new Alumno(122,"Mancocapac","567781221A","illidanStormgage_56");
    Alumno a3 = new Alumno(152,"Gabriel","11225698B","illidanStormgage_56");
   *//*
    Alumno a4 = new Alumno(122,"samuel","11225698B","illidanStormgage_56");
    Alumno a5 = new Alumno(122,"Mancocapac","567781221A","illidanStormgage_56");
    Alumno a6 = new Alumno(152,"Gabriel","11225698B","illidanStormgage_56");
    Alumno a7 = new Alumno(122,"samuel","11225698B","illidanStormgage_56");
    Alumno a8 = new Alumno(122,"Mancocapac","567781221A","illidanStormgage_56");
    Alumno a9 = new Alumno(152,"Gabriel","11225698B","illidanStormgage_56");
    */
    //getter and setter del objeto profesor
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    //el alumno debe estar en la lista
    protected int  buscar(Alumno alumno){
        int aux =0;
        int pos =0;
        for(Alumno s: alumnos){
            pos++;
            if(alumno.equals(s)){
                aux++;
                break;
            }
        }
        if(aux==0){
            return -1;
        }else {
            return pos;
        }
    }
    protected int buscaraudante(Alumno alumno){
        return alumnos.indexOf(alumno);
    }
    //probaar algoritmo
    //metododarAlta
    public void darAlta(Alumno alumno){
        if(alumnos == null)//si la lista de alumnos es nula crea otra, y a alli agregar al que falta
            alumnos = new ArrayList<>();
        if(alumno == null){
            System.out.println("excepcion por aplicar");
            // throw new NatacionException("El alumno a dar de alta no puede ser nulo");
        }
        if(alumnos.indexOf(alumno)==-1){
            alumnos.add(alumno);//agregado al array de alumnos
        }
        //si alumno esta en el listado no se hace nada
        //lo mimo de arriba pero con excepcion
    }

}
