package Dirigida2.Contrasenia;

import java.util.Objects;

public class Usuario {

   // public static void main(String[] args) {


        //funciona
       /*
        Constrasenia c1 = new Constrasenia("pepepepepeBRAZIL12345");

        System.out.println(c1.esClaveFuerte());
        c1.VisualizarTodo();
        */
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    protected String contrasenia;

    public Usuario(String nombre, String apellido, int edad, String DNI, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return DNI+"|"+nombre+"|"+apellido+"|"+edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(DNI, usuario.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, DNI, contrasenia);
    }
}
