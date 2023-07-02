package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

public class Empleado {
    //cada uno tiene dni, nombre, edad, domicilio, #niostrajbando

    protected int dni;
    protected String nombre;
    protected String domicilio;
    protected int aniostrabajando;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getAniostrabajando() {
        return aniostrabajando;
    }

    public void setAniostrabajando(int aniostrabajando) {
        this.aniostrabajando = aniostrabajando;
    }

    public Empleado(int dni, String nombre, String domicilio, int aniostrabajando) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.aniostrabajando = aniostrabajando;
    }
    public float Salario() {


        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", aniostrabajando=" + aniostrabajando +
                '}';
    }
}
