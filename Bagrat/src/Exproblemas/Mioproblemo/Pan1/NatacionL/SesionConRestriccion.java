package Exproblemas.Mioproblemo.Pan1.NatacionL;

import java.util.ArrayList;

public class SesionConRestriccion extends  SesionNatacion {
    //se comporta como la anterior, polomorfismo???
    //tipo restriccion fecha negra
    //copia la clase tipo rstriccion
    TipoRestriccion tipoRestriccion;//va a validar a los otras
    //dos de manera indirecta y lo vaa heredar a la sesion natacion

    //sesion con restriccion , dar alta

    //boleano
    public SesionConRestriccion(TipoRestriccion tipoRestriccion) {

        this.tipoRestriccion = tipoRestriccion;
    }

    @Override
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
}
