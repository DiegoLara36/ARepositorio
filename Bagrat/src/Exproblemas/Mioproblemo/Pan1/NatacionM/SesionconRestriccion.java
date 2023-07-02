package Exproblemas.Mioproblemo.Pan1.NatacionM;

import java.util.ArrayList;
import java.util.List;

public class SesionconRestriccion extends SesionNatacion{

    private TipoRestriccion tipoRestriccion;
    //antes de acudir a sesion deben cumplir las restricciones
    //interfaz tipo restriccion para todos los objetos alumnos
    //por sentido comun es una restriccion nochequeada

    //clase restriccionedad implement el tiporestriccion
    //flecha negra trae la clase como atributo de otra clase

    public SesionconRestriccion(TipoRestriccion tipoRestriccion) {
        this.tipoRestriccion = tipoRestriccion;
    }

    public void darAlta(Alumno alumno) {
        //del profesor
        /*
         public void darAlta(Alumno a){
        if(alumnos == null)
            alumnos = new ArrayList<>();
        if(a == null){
            throw new NatacionException("El alumno a dar de alta no puede ser nulo");
        }

        if(tipoRestriccion.valida(a)){
            if(buscar(a) == -1){
                alumnos.add(a);
            }
        }
    }
        * */
        ///si el array es nullo crea uni nuevo
        if(alumnos == null ){
            alumnos = new ArrayList<>();
        }if(alumno==null){
            throw new NatacionException("el alumno no existe");
        }
        //valida es publica es un metodo que puede ser accedid por todos
        if(tipoRestriccion.valida(alumno)){//revisar esta parte en el video
            if(buscar(alumno)==-1){
                alumnos.add(alumno);//heredada de la clase sesion natacion
                //si no encuentra al alumno en la lista lo agrega
            }
        }
/*
        for(Estilo s: alumno.getEstilos()){
            //cada s es un list de estilos de cada objeto alumno
            //como identificar las condiciones para validar e bojeto

        }*/

    }

}
