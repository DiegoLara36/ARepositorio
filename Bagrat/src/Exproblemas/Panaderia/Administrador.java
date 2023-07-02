package Exproblemas.Panaderia;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Persona {
    //1-administrador(super,gradoinstruccion,(list)10 ultimosvenetos??))
    //2-cajeros (super,codigocaja)
    //3-maestros(super,añosexperiencia,(list)productosqueelaboran)

    private String grado;
    //lista
    private String[] eventos;//lsita de eventos en los que participa


    public Administrador(String DNI, String nombre, int edad, String domicilio, int aniosdetrabajao, String grado) {
        super(DNI, nombre, edad, domicilio, aniosdetrabajao);
        this.grado = grado;
    }
    public Administrador(){

    }

    public void Calcularsalario(){
        System.out.println("salario de Administrador: "+(getAniosdetrabajao()*100));
    }
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String[] getEventos() {
        return eventos;
    }

    public void setEventos(String[] eventos) {
        this.eventos = eventos;
    }

    //listado de eventos del administrador

}
