package Exproblemas.Natacion;

import java.util.ArrayList;

import java.util.ArrayList;

public class SesionConRestriccion extends SesionNatacion  {
    private TipoRestriccion tipoRestriccion;
    //booblean resitriccion
    //es la unica clase que puede usar los metodos protected de la clase
    //sesion naatacion
    public SesionConRestriccion(TipoRestriccion tipoRestriccion){
        this.tipoRestriccion = tipoRestriccion;
    }
    //boolean
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



