package Object_Equals.Equalas1;

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
        //misma poscicion de memoria son los mismos
        if (this == o) return true;
        // son nulos o de deistinta clase
        if (o == null || getClass() != o.getClass()) return false;
        //comparadno un aux
        Alumno alumno = (Alumno) o;
                //paraque solo me reconozca el codigo
        return Objects.equals(codigo, alumno.codigo);
                //general
        //return Objects.equals(codigo, alumno.codigo) && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }
}
