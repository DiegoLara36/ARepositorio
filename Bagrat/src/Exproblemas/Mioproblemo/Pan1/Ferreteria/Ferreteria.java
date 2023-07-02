package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.util.ArrayList;
import java.util.List;

public class Ferreteria {
    //iual
    protected List<Producto> productos;

    public Ferreteria(){

    }
    //anihadir procutos
    //eliminar
    //sleccionar list<Pricuto>
    //calSumaprecio
        //buscar
        //to String
    //get Productos lits productos
    //set productos

    public void anhiadirProducto(Producto p){
        if(productos==null){
            productos = new ArrayList<>();
        }
        //p.equals,ssp
        double aux=0;
        for(Producto s: productos){
            if(p.equals(s)==true) {
                //en caso sea mayuscula
                s.setDescripcion(p.getDescripcion());
                //todo se cambia menos el precio
                s.setCantidad(p.getCantidad());// lo unico que cambia es la cnatidad
            }
        }
        //si son iguales se reemplaza y mantiene el precip del anterior

        //si no esta se agrega al final
        if(productos.indexOf(p)==-1){
            productos.add(p);
        }
    }

    public void eliminar(String descripcion){

        int numer = productos.size();
        int[] cont = new int[numer];
      //tiene error
       Producto paux = new  Producto(descripcion,0,0);
       if(productos.indexOf(paux)==-1){
            throw new FereteriaException("error no se encuentra la herramienta con la descripcion"+descripcion);
        }
      /*  for(Producto s : productos){
            if(paux.equals(s)==true){
                cont=productos.indexOf(s);
                productos.remove(cont);
         */int k=0;
            for(int i=0;i<productos.size();i++){
                if(paux.equals(productos.get(i))){
                    cont[k] = productos.indexOf(i);
                    k++;
                }
            }
            for(int i=0;i<k;i++){
                productos.remove(cont[k]);
            }

        //remover  }*/

    }
    //le doy 2 indices y me debuelve esca seccion de array list
    List<Producto> productostomados;

    public List<Producto> seleccionar(int x , int y) {
        for(int i=x;i<=y;i++){
            productostomados.add(productos.get(i));
        }
        return productostomados;
    }

    public double calcSumaPrecio(int min , int max ){
        //Producto p = new Producto();
        ;// da el lugar donde esta x
        //productos.indexOf(y);
        //finto
        /* lapuss precio
        double suma =0;
        for(Producto s: productos){
            if(((double)min<s.getPrecio())&&(s.getPrecio()<(double)max)){
                suma = suma+ s.getPrecio();
            }
        }
        return suma;*/
        double suma =0;
        for(Producto s: productos){
            if(min<s.getCantidad()&&(s.getCantidad()<max)){
                suma = suma+ s.getPrecio();
            }
        }
        return suma;
    }
    //Calular suma
    //seleccionar de la lista Producto
    //eliminar de la lista producto void
    //aniadir producto a la lista
    public void buscar(Producto p){
        //producctos.indexOf(p);
    }

    //getter and setter de productos
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    //buscar?
    //del profesor
    /*
    public Ferreteria() {
        this.prodcutos = new ArrayList<>();}
    * */
    @Override
    public String toString() {
        return  this.productos.toString();
    }


}
