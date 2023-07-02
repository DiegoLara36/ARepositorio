package exColecciones.Mapsample;

public class Person {

    private String nombre;
    private int edad;


    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
