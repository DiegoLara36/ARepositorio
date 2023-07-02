package Exproblemas.Mioproblemo.Pan1.NatacionM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alumno extends  Persona {
    //relacion de estilos a llevar list
    List<Estilo> estilos;


    public void ejecutarLaClase() {
        System.out.println("clase ejecutada");
    }

    public List<Estilo> getEstilos() {
        return estilos;
    }

    //agregar los estilos completos
    public void agregarEstilos(List<Estilo> estilos) {

        if (estilos == null) {
            throw new NatacionException("la lista agregada es nula");
        }


    }

    public void agregarEstilos(Estilo estilo) {
        if (estilo == null) {
            throw new NatacionException("el estilo agregado no existe");
        }//si la lista a agregar es tambien nulla, crear una
        if (estilos == null) {
            estilos = new ArrayList<>();
        }
        if (estilos.size() > 3) {
            throw new NatacionException("no se pueden agregar mas de 3 ");
        }
        if (TipoEstilo.MARIPOSA.equals(estilo.tipoestilo)) {
            if (estilos.size() < 2) {
                estilos.add(estilo);
            }//si el estilo tiene mariposa agregar hasta que sean menor que 2
        } else {
            if (estilos.size() < 3) {
                estilos.add(estilo);
                //si estilos llegan a ser 2
            }
        }
    }

    //alumno con flecha azul hacia arriba???

    //es otra manera de llamar al consstructor
    Alumno(int edad, String nombre, String codigo, String email) {
        //edad , nombre , codigo ,e mail
        validaCampos(edad, nombre, codigo, email);
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }
    Alumno(){
        validaCampos(edad, nombre, codigo, email);
    }

    public static Comparator<Alumno> nombreComparator = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            //comparator del mismo nombre para el objeto nombre
            return (int) (a1.getNombre().compareTo(a2.getNombre()));
        }
    };

    @Override
    public void nadar() {
        System.out.println("el alumno esta nadando");
    }


}
