package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.lang.ref.PhantomReference;

public class PruebaFerreteria {

    public static void main(String[] args) {

       Ferreteria ferreteria = new Ferreteria();
       ferreteria.anhiadirProducto(new Producto("martillo",25,2.2));
       ferreteria.anhiadirProducto(new Producto("sierra",12,5.3));
       ferreteria.anhiadirProducto(new Producto("taladro",16,8.4));
        //se debe incializar al agregar
        System.out.println("    antres de agregar");
        System.out.println(ferreteria.getProductos());

        Producto pro1 = new Producto("Martillo",9,6.45);
        Producto pro2 = new Producto("Sierra",6,3.25);
        Producto pro3 = new Producto("Taladro",3,9.35);
        //se debe reemplzar tambien
        ferreteria.anhiadirProducto(pro1);
        ferreteria.anhiadirProducto(pro2);
        ferreteria.anhiadirProducto(pro3);
        System.out.println("    despues de agregar");
        System.out.println(ferreteria.getProductos());
        //funciona
        System.out.println(ferreteria.calcSumaPrecio(4,10));
        System.out.println("calcular suma 100, 200");
        System.out.println(ferreteria.calcSumaPrecio(100,200));
        ferreteria.eliminar("martillo");
        System.out.println("despues de eliminar martillo: ");
        //ahora si lo elimina, ya no manda error
        System.out.println(ferreteria.getProductos());
        //por alguna razon lo elimina(debug) pero me manda excepcion
        ferreteria.eliminar("xxx");
        //como se hace para que la excepcion salga???

        // FerreteriaOfertaConRestriccion focr = new FerreteriaOfertaConRestriccion();


    }
}
