package Exproblemas.Natacion;

import java.util.ArrayList;
import java.util.List;

public class SesionNatacion {

    protected Profesor profesor;
    protected List<Alumno> alumnos;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    protected int buscar(Alumno a){
        return alumnos.indexOf(a);
    }
    //te da el indice del objeto buscado en

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
}
