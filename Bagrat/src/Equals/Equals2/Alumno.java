package Equals.Equals2;

import java.util.Objects;

public class Alumno {

    private String codigo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
            //son de la misma posicion de momoria
        if (this == o) return true;
        // si el objeto es nulo o la  clase es distinta de det clas
        //retornar flaso
        if (o == null || getClass() != o.getClass()) return false;
        //en el otro caso llamo al objeto alumno
        Alumno alumno = (Alumno) o;

        return Objects.equals(codigo, alumno.codigo) ;//&& Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }
}
