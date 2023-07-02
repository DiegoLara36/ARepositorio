package Exproblemas.Mioproblemo.Pan1.NatacionM;

import Exproblemas.Natacion.NatacionException;

import java.util.Objects;

public abstract class Persona {

    protected   int edad;
    protected   String nombre;
    protected   String codigo;
    protected   String email;


    //valida los campos de Persona, constructor???
    protected void validaCampos(int edad, String nombre, String codigo, String email) {
        if(codigo ==null || nombre == null || email == null || edad < 0)
        {
            throw new NatacionException("Campos de texto nulos o campos numericos negativos");
        }

    }

    public int getEdad() {
        return edad;
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

    public abstract void nadar();

    @Override
    public String toString() {
        return nombre+" "+codigo+" "+edad+" ["+email+"]\n";
    }
    //son iguales so tienen el mismo codigo e email se hereda
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo) && Objects.equals(email, persona.email);
    }//las personas son igales si tienen el mosmo codigo y email

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre, codigo, email);
    }
}
