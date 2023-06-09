package Dirigida1;

public class Producto {
    private String nombre;
    private String codigo;
    private Double monto;
    private int cantidad;

    public Producto(String nombre, String codigo, Double monto, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.monto = monto;
        this.cantidad = cantidad;
    }
    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", monto=" + monto +
                ", cantidad=" + cantidad +
                '}';
    }
    // para que no me de lugar de memoria
}
