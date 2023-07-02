package Exproblemas.Mioproblemo.Pan1.NatacionL;

import java.util.ArrayList;
import java.util.List;

public class SesionNatacion {
    //1 profesor 10 alumnos
    protected Profesor profesor;
    protected List<Alumno> alumnos;


    protected int buscar(Alumno a){
        return alumnos.indexOf(a);
    }

    public void darAlta(Alumno a){
        if(alumnos == null)
            alumnos = new ArrayList<>();
        if(a == null){
            throw new NatacionException("El alumno a dar de alta no puede ser nulo");
        }

        if(buscar(a) == -1 ){
            // si el alumno no esta en la lista agregar
            alumnos.add(a);
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
