package Exproblemas.Natacion;


import java.util.Objects;

public abstract class Persona{

    protected String nombre;
    protected int edad;
    protected String codigo;
    protected String email;

    public abstract void nadar();

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected void validaCampos(String codigo, String nombre, String email, int edad) {
        if(codigo ==null || nombre == null || email == null || edad < 0)
        {
            throw new NatacionException("Campos de texto nulos o campos numericos negativos");
        }
    }


    @Override
    public String toString() {
        return nombre + ' ' + edad + ' ' + codigo + " [" + email + ']';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, email);
    }


}
