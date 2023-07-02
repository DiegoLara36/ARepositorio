package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.util.ArrayList;
import java.util.List;

public class PruebaFerreteriaOfertaConRestriccion {
    public static void main(String[] args) {
        List<String > productosrestringidos = new ArrayList<>();
        productosrestringidos.add("Acido Muriatico");
        productosrestringidos.add("Acido Sulfurico");
        //protductos restringfidos
        TipoRestriccion tipoRestriccion = new RestriccionTipoProducto(productosrestringidos);
        //inicializada el tipo de restriccion
        List<String> productosofertados = new ArrayList<>();
        productosofertados.add("martillo");
        productosofertados.add("sierra");
        //productos ofertados listos
        //se requiere una lista de nombres nada mas
        FerreteriaOfertaConRestriccion focr = new FerreteriaOfertaConRestriccion(productosofertados,tipoRestriccion);
        Producto prd1 = new Producto("martillo", 25,2.2);
        Producto prd2 = new Producto("sierra", 12,5.3);
        Producto prd3 = new Producto("taladro", 16, 8.4);
        focr.anhiadirProducto(prd1);
        focr.anhiadirProducto(prd2);
        focr.anhiadirProducto(prd3);
        System.out.println(focr);//tiene toString
        Producto prd4 = new Producto("Martillo", 9,6.45);
        Producto prd5 = new Producto("Sierra", 6,3.25);
        Producto prd6 = new Producto("Taladro", 3, 9.35);
        focr.anhiadirProducto(prd4);
        focr.anhiadirProducto(prd5);
        focr.anhiadirProducto(prd6);
        System.out.println(focr);

        System.out.println(focr.seleccionar(4,10));
        System.out.println(focr.calcSumaPrecio(4, 10));
        System.out.println(focr.calcSumaPrecio(100, 200));

        focr.eliminar("martillo");
        System.out.println(focr);

        Producto prd7 = new Producto("acido muriatico", 5,8.50);
        focr.anhiadirProducto(prd7);


    }
}
