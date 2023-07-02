package Exproblemas.Natacion;

public class Profesor extends Persona{


    @Override
    public void nadar() {

    }

    public Profesor(String codigo, String nombre, String email, int edad ) {
        validaCampos(codigo, nombre, email, edad);
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }



    public void dirigirClase(){

    }
}
