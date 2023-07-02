package exColecciones.Comparator.Comparator2;

import java.util.Comparator;

public class Posibilidad {
    private String nombre;
    private int edad;
    private float posibilidad;

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

    public float getPosibilidad() {
        return posibilidad;
    }

    public void setPosibilidad(float posibilidad) {
        this.posibilidad = posibilidad;
    }

    public Posibilidad(String nombre, int edad, float posibilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.posibilidad = posibilidad;
    }

    @Override
    public String toString() {
        return "Posibilidad{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posibilidad=" + posibilidad +
                '}';
    }

    public static Comparator<Posibilidad> comparacionporedad = new Comparator<Posibilidad>() {
        @Override
        public int compare(Posibilidad o1, Posibilidad o2) {
         return o1.getEdad()- o2.getEdad();
        }// no se puede comparar un float??
    };

    public static Comparator<Posibilidad> comparacionpoposibilidad = new Comparator<Posibilidad>() {
        @Override
        public int compare(Posibilidad o1, Posibilidad o2) {
            return (int) -((o1.getPosibilidad()*Math.pow(10,12)- o2.getPosibilidad()*Math.pow(10,12)));
        }// no se puede comparar un float??
    };


    public static Comparator<Posibilidad> comparacionpornombre = new Comparator<Posibilidad>() {
        @Override
        public int compare(Posibilidad o1, Posibilidad o2) {
            return (int)(o1.getNombre().compareTo(o2.getNombre()));
        }
    };





}
