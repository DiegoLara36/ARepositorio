package Exproblemas.Mioproblemo.Pan1.NatacionM;

public class Profesor extends  Persona{



    public Profesor(int edad, String nombre, String codigo, String email) {
        this.codigo=codigo;
        this.edad=edad;
        this.email=email;
        this.nombre=nombre;
    }

    @Override
    public void nadar() {

    }
    public void dirigirClase(){
        System.out.println("para crear un profesor se tiene que indicar nombre, codigo ,edad y emial");

    }
}
