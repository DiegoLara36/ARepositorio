package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.util.ArrayList;
import java.util.List;

public class Testeando {
    public static void main(String[] args) {
        List<Producto> productostest = new ArrayList<>();
        Producto p1 = new Producto("martillo",3,9);
        Producto p2 = new Producto("lija",3,12);
        Producto p3 = new Producto("zerucho",3,20);
        Producto p4 = new Producto("martillo",16,5);
        Producto p5 = new Producto("cemento",30,6);
        Producto pb = new Producto("martillo",24,35);
        Producto pb2 = new Producto("llaveinglesa",24,35);
        productostest.add(p1);
        productostest.add(p2);
        productostest.add(p3);
        productostest.add(p4);
        productostest.add(p5);
        System.out.println("1 y 4 :"+p1.equals(p4));
        System.out.println("antes");
        System.out.println(productostest);
        System.out.println("despues");
        Verificar(pb,productostest);
        System.out.println(productostest);
    }

    static void Verificar(Producto p,List<Producto> productostest){
        double aux=0;
        for(Producto s: productostest){
            if(p.equals(s)==true) {
                //todo se cambia menos el precio
                s.setCantidad(p.getCantidad());// lo unico que cambia es la cnatidad
            }
        }
        //si son iguales se reemplaza y mantiene el precip del anterior

        //si no esta se agrega al final
        if(productostest.indexOf(p)==-1){
            productostest.add(p);
        }
    }
}
