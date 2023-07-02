package Exproblemas.Mioproblemo.Pan1.Ferreteria;
import java.util.Objects;

public class Producto {
    //cantidad y precio
    private String descripcion;
    private int cantidad;
    private double precio;
    //CONSTRUCTOR CON VALIDACION
    public Producto(String descripcion, int cantidad, double precio) {
        valida(descripcion,cantidad,precio);
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    //validacion
    //validacion:
    private void valida(String descripcion, int cantidad, double precio) {
        if(descripcion==null|| cantidad <0 || precio < 0f )
            throw new FereteriaException("Las descrición no puede ser nula o vacia, ni las cantidasdes o precio negativas");
    }
    public Producto(){

    }
    //
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {
        if(precio<0){
            throw new FereteriaException("el precio no puede ser negativo");
        }
        this.precio = precio;
    }
    //meo
    /*
    @Override//mejor con el objeto que con un valor
    public String toString() {
        return "("+getDescripcion(¿+";"+getCantidad()+";"+getPrecio()+")";
    }*/
    @Override
    public String toString() {
        return "("+this.descripcion+"; "+this.cantidad+"; "+this.precio+")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(descripcion.toUpperCase(), producto.descripcion.toUpperCase());
        //los paso a mayuscula y los comparo
    }
    //Equals dep profesor
    /*
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto that = (Producto) o;
        return this.descripcion.equalsIgnoreCase(that.descripcion);
    }
    */
    //equalsignorecase

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, cantidad, precio);
    }
}
