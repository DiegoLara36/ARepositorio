package Interfaces.Caso2;

public class Cliente {
    static int codigo=2000;
    private int codigoob;
    private String nombre,direccion,telefono;

    public Cliente(){
        Cliente.codigo++;
        this.codigoob= Cliente.codigo;
        codigoob=this.codigoob;

    }
    public Cliente(String nombre, String direccion, String telefono) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public int getCodigo() {
        return codigoob;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigoob +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
