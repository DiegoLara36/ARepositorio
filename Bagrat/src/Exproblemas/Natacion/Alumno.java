package Exproblemas.Natacion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alumno extends Persona{

   private List<Estilo> estilos;

   public List<Estilo> getEstilos() {
      return estilos;
   }

   Alumno(String codigo, String nombre, String email, int edad ) {
      validaCampos(codigo, nombre, email, edad);
      this.codigo = codigo;
      this.nombre = nombre;
      this.email = email;
      this.edad = edad;

   }

   @Override
   public void nadar() {

   }

   public void EjecutarLaClase(){
      System.out.println("dentro de EjecutarLaClase");
   }

   public void agregarEstilo(Estilo estilo){
      //validamos que el estilo ingresado no sea nulo
      if(estilo == null)
         throw new NatacionException("No se ha indicado un estilo");
      if(estilos == null){
         estilos = new ArrayList<>();
      }

      if(estilos.size()>3){
         throw  new NatacionException("No se puede realizar mas de 3 estilos");
      }

      if(TipoEstilo.MARIPOSA.equals(estilo.tipoEstilo)){
         if (estilos.size()<2){
            estilos.add(estilo);
         }
      }else{
         if(estilos.size()<3){
            estilos.add(estilo);

         }
      }
   }

   public static Comparator<Alumno> nameComparator = new Comparator<Alumno>() {
      @Override
      public int compare(Alumno a1, Alumno a2) {
         return (int) (a1.getNombre().compareTo(a2.getNombre()));
      }
   };

   /*public static Comparator<Alumno> nameComparator = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return (int)(o1.getNombre().compareTo(o2.getNombre()));
        }
    };
    */

}