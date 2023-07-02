package Exproblemas.Panaderia;

public class Main {

    public static void main(String[] args) {
        //1-administrador(super,gradoinstruccion,(list)10 ultimosvenetos??))
        //2-cajeros (super,codigocaja)
        //3-maestros(super,añosexperiencia,(list)productosqueelaboran)

        Administrador a1 = new Administrador("123456", "carlos", 34, "jrzepita", 12, "superior");

        Cajero c1 = new Cajero("23456", "damian", 23, "jrlsoheroes", 2, "universitario");
        Cajero c2 = new Cajero("34567", "sofia", 24, "jrlperu", 1, "universitario");


        Producto[] ob1pan = new Producto[3];
        ob1pan[0] = new Producto("0023", "panfrances", 2.4f);
        ob1pan[1] = new Producto("0025", "panbaggete", 6.5f);
        ob1pan[2] = new Producto("0255", "panserrano", 5.4f);

        Producto[] ob2pan = new Producto[4];
        ob2pan[0] = new Producto("0023", "panfrances", 2.4f);
        ob2pan[1] = new Producto("0025", "panbaggete", 6.5f);
        ob2pan[2] = new Producto("1234", "pastelfresa", 20.1f);
        ob2pan[3] = new Producto("1523", "pastelchoclo", 15.6f);

        Producto[] ob3pan = new Producto[2];
        ob3pan[0] = new Producto("0023", "panfrances", 2.4f);
        ob3pan[1] = new Producto("0025", "panbaggete", 6.5f);

        Panadero p1 = new Panadero("012334", "pedro", 45, "jrcasa", 12);
        Panadero p2 = new Panadero("017989", "francisco", 55, "jrbolivia", 20);
        Panadero p3 = new Panadero("056789", "samuel", 25, "jrberlin", 1);

        p1.setListaProducto(ob1pan);
        p2.setListaProducto(ob2pan);
        p3.setListaProducto(ob3pan);
/*
        p1.Calcularsalario();
        Sistema s1 = new Sistema();
        System.out.println("aporte de panaderos");
        s1.aporte(p1);
        s1.aporte(p2);
        s1.aporte(p3);
    */





    }
}
