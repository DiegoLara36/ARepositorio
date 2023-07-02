package PC1.Ej_2;

public abstract class Universitario {
    private String nombre;
    private String direccion;
    public Universitario(String nombre, String direccicon){
        this.direccion=direccicon;
        this.nombre=nombre;
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
}
