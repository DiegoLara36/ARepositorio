package exColecciones.Comparable.Comparable2;

import exColecciones.Comparator.Comparator2.Posibilidad;

import java.util.Comparator;

public class Persona implements  Comparable<Persona>{

    //sin el corchete no lo reconoce
    private String nombre;
    private int edad;
    private boolean tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Persona(String nombre, int edad, boolean tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo=" + tipo +
                '}'+"\n";
    }

    /*
        @Override
        public int compareTo(Persona o) {
            return (this.edad-o.getEdad());
        }//1556
    */
    //comparacion con edad, de la clase persona
    /*@Override
    public int compareTo(Persona o) {
        //comparable de edad
            //edad  del objeto - edad del otro objeto
        return (this.edad-o.getEdad());
    }*/
    //comparacion por nombre de la clase persona
    @Override
    public int compareTo(Persona o) {
        //edad de
        //coparacion por nombrereturn
        //si no son el mismo,retorna el comparator
        if(this.nombre.compareTo(o.getNombre())!=0){
            return this.nombre.compareTo(o.getNombre());
            //si tienen lo mismo compara por edad
        }else{
            return (this.edad-o.getEdad());
           //compaaracdo con dos campos simultaneanmente
            //para uan misma coleccion de objetos
        }
        //sit eienen el mismo nombre ordenalos por dead

    }
    public static Comparator<Posibilidad> comparacionpornombre = new Comparator<Posibilidad>() {
        @Override
        public int compare(Posibilidad o1, Posibilidad o2) {
            return (int)(o1.getNombre().compareTo(o2.getNombre()));
        }
    };

}
