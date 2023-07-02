package Exproblemas.Panaderia;

public class Panadero extends Persona {

    //1-administrador(super,gradoinstruccion,(list)10 ultimosvenetos??))
    //2-cajeros (super,codigocaja)
    //3-maestros(super,añosexperiencia,(list)productosqueelaboran)

    // private int añosdeexp;
    //list productosqueelabora
    private Producto[] listaProducto;

    public Producto[] getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(Producto[] listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Panadero(String DNI, String nombre, int edad, String domicilio, int aniosdetrabajao, Producto[] listaProducto) {
        super(DNI, nombre, edad, domicilio, aniosdetrabajao);
        this.listaProducto = listaProducto;
    }
    public Panadero(String DNI, String nombre, int edad, String domicilio, int aniosdetrabajao) {
        super(DNI, nombre, edad, domicilio, aniosdetrabajao);

    }
    public void Calcularsalario(){
        System.out.println("salario de Panadero: "+(getAniosdetrabajao()*90));
    }


    public Panadero(Producto[] listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Panadero(){

    }

    //ordenar los productos de panadero segun el orden por precio

}
