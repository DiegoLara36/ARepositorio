package PC1.Ej_2;

import Interfaces.Ejemplomio.Madre;

import java.util.Objects;

public class Alumnos extends  Universitario implements Mostrar {
    //UNIVERSITARIOS: alumnos, profesores, pas
    //EMPLEADOS: profesores, pas

    String centro;
    public void Matricularse(String centro){
        this.centro=centro;
    }
    public Alumnos(String nombre, String direccicon) {
        super(nombre, direccicon);

    }

    public String getCentro() {
        return centro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return Objects.equals(centro, alumnos.centro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centro);
    }

    @Override
    public void Mostrar() {
        System.out.println("Alumno==|"+getNombre()+"|"+getCentro()+"|"+getDireccion()+"|");
    }


    //alumnos nombre. cnetro, direccion
}
