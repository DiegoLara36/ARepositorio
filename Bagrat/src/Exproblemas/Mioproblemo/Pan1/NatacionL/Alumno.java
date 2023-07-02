package Exproblemas.Mioproblemo.Pan1.NatacionL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alumno extends  Persona{
    //estilos a llevar
    List<Estilo> estilos ;

    public List<Estilo> getEstilos() {
        return estilos;
    }

    //ejecutar clase
    public void ejecutarlaClase(){
        System.out.println("clase ejecutada");
    }
    //construccotr con natacion exception
    //le pongo otra lista de estilos
    public void agregarEstilo(List<Estilo> e){

        if(e.size()>3){
            throw  new NatacionException("No se puede realizar mas de 3 estilos");
        }//mariósa esta en la lista y lista mayor a 2
        if((e.indexOf(tipoEstilo.MARIPOSA))!=-1&&estilos.size()>2){
            throw new NatacionException("si estas en mariposa solo menos de 2");
            //si estilo tiene mariposa
        }   //mariposa no esta en la lista
         else{
             estilos=e;
        }
        //no pueden ser la misma

    }
    public void agregarEstilo(Estilo e){
        //agregando uno por uno
        //validamos que el estilo ingresado no sea nulo
        if(e == null)
            throw new Exproblemas.Natacion.NatacionException("No se ha indicado un estilo");
        if(estilos == null){
            estilos = new ArrayList<>();
        }

        if(estilos.size()>3){
            throw  new NatacionException("No se puede realizar mas de 3 estilos");

        }

        if(tipoEstilo.MARIPOSA.equals(e.tipoestilo)){
            if (estilos.size()<2){
                estilos.add(e);
            }
        }else{
            if(estilos.size()<3){
                estilos.add(e);

            }
        }
    }


   Alumno(String nombre, int edad, String codigo,String email){
        //falta la validacion(si es null o edad negativa)error
        validaCampos(nombre,edad,codigo,email);
        this.nombre =nombre;
        this.edad =edad;
        this.codigo=codigo;
        this.email=email;
    }

    @Override
    public String toString() {
        return nombre+" "+codigo+" "+ edad+" ["+email+"]";
    }

    @Override
    public void nadar() {

    }
    //comparator de la clase alumno por nombre
    public static Comparator<Alumno> nameComparatorr = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return (int)(o1.getNombre().compareTo(o2.getNombre()));
        }
    };
    /*
      public static Comparator<Alumno> nameComparator = new Comparator<Alumno>() {
      @Override
      public int compare(Alumno a1, Alumno a2) {
         return (int) (a1.getNombre().compareTo(a2.getNombre()));
      }
   };*/

}
