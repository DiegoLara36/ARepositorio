package Exproblemas.Mioproblemo.Pan1.NatacionL;

import Exproblemas.Natacion.NatacionException;

import java.util.Objects;

public abstract class Persona {
    protected int edad;
    protected String nombre;
    protected String codigo;
    protected  String email;

    public abstract  void nadar();

    public int getEdad() {
        return edad;
    }

    protected void validaCampos(String nombre, int edad,String codigo, String email ) {
        if(codigo ==null || nombre == null || email == null || edad < 0)
        {
            throw new NatacionException("Campos de texto nulos o campos numericos negativos");
        }
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    //Equals de codigo e email
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre, codigo, email);
    }
}
