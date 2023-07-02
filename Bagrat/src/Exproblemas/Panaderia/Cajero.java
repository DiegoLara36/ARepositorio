package Exproblemas.Panaderia;

public class Cajero extends Persona {
    //1-administrador(super,gradoinstruccion,(list)10 ultimosvenetos??))
    //2-cajeros (super,codigocaja)
    //3-maestros(super,añosexperiencia,(list)productosqueelaboran)

    private String codigocaja;


    public void setCodigocaja(String codigocaja) {
        this.codigocaja = codigocaja;
    }
    public Cajero(String DNI, String nombre, int edad, String domicilio, int aniosdetrabajao, String codigocaja) {
        super(DNI, nombre, edad, domicilio, aniosdetrabajao);
        this.codigocaja = codigocaja;
    }
    public void Calcularsalario(){
        System.out.println("salario de cajero: "+(getAniosdetrabajao()*50));
    }

    public Cajero(){

    }

    public String getCodigocaja() {
        return codigocaja;
    }

}
