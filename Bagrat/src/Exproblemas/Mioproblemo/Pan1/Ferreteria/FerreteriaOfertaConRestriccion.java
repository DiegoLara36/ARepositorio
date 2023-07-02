package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.util.ArrayList;
import java.util.List;

public class FerreteriaOfertaConRestriccion extends  Ferreteria {
    //aca se van a almacenar los datos
    TipoRestriccion tipoRestriccion;//tipo de restriccionque
    //deben psaar los productos a aniadir

    List<String> productosenoferta;//previamente mencionado

    public FerreteriaOfertaConRestriccion(List<String> productosenoferta, TipoRestriccion tipoRestriccion) {
        if(productosenoferta ==null)
            throw new FereteriaException("La lista de herramientas ofertadas no puede ser vacia");
        if(tipoRestriccion == null)
            throw new FereteriaException("Debe definir algun tipo de restriccion");
        this.productosenoferta =productosenoferta ;
        this.tipoRestriccion = tipoRestriccion;

    }


    @Override
    public void anhiadirProducto(Producto p) {
        if(p==null) {
            throw new FereteriaException("El prodcuto no se puede aniadir");
        }//con tipo de restriccion
        if(tipoRestriccion.valida(p)){
            super.anhiadirProducto(p);
        }else{
            throw new FereteriaException("el producto que intentas vender esta restringido");
        }


        /*double aux=0;
        for(Producto s: productos){
            if(p.equals(s)==true) {
                //todo se cambia menos el precio
                s.setCantidad(p.getCantidad());// lo unico que cambia es la cnatidad
            }
        }
        //si son iguales se reemplaza y mantiene el precip del anterior

        //si no esta se agrega al final
           if(productos.indexOf(p)==-1){
            productos.add(p);
        }*/

    }

    //calculo de sumaprecio para ferreteria oferta con restriccion
    @Override
    public double calcSumaPrecio(int min, int max) {


        double suma =0;
        for(Producto s: productos){
           /* if(((double)min<s.getPrecio())&&(s.getPrecio()<(double)max)){
                suma = suma+ s.getPrecio();
            } else if (productosenoferta.indexOf(s)!=-1) {
                suma = suma+ (s.getPrecio()/2);
            }*/

            if((min<s.getCantidad())&&(s.getCantidad()<max)&& productosenoferta.indexOf(s)!=-1){
                suma = suma+ (s.getPrecio()/2);
            } else if ((min<s.getCantidad())&&(s.getCantidad()<max)&& productosenoferta.indexOf(s)==-1) {
                suma = suma+ (s.getPrecio());
            }
        }
        return suma;
    }
    //toStringdelprofesor
    @Override
    public String toString() {
        return "{"+this.productosenoferta+","+this.productos+" }";
        //+prodcuctos??
    }

}