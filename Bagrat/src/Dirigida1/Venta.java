package Dirigida1;

public class Venta {

    private String codigo;
    private Producto[] productos;
    // arreglo de productos dentro del argumento del sontructor
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    // se puede meter un objeto de argumento
    public Venta(String codigo, Producto[] productos) {
        this.codigo = codigo;
        this.productos = productos;
    }
    public Venta(){

    }
}

