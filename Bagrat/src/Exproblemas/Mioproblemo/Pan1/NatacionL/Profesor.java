package Exproblemas.Mioproblemo.Pan1.NatacionL;

import Exceptions.Ejemplos.PrestamoTO;

public class Profesor extends Persona{

    public void dirigirClase(){
        System.out.println("para crear profesor debe indicar nombre, codigo, email, edad ");
    }
    //como se ve en uml persona no tiene construcotr pero laumno y profesor si
    public Profesor(String nombre, int edad, String codigo,String email){
        validaCampos(nombre,edad,codigo,email);
        this.nombre =nombre;
        this.edad =edad;
        this.codigo=codigo;
        this.email=email;
    }
    @Override
    public void nadar() {

    }
}
