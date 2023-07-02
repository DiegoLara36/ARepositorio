package Ejercicios.Peliculeria;

public class Cliente {

    static int codigo=2000;
    //si le pido codigo me va a dar el codigo de la l
    private int codigodelobjeto;
    private String nombre;
    private String direccion;
    private String telefono;
    //que sea estatica para aumentar pero necesito una copia que guarde el codigo
    //del momento
    //static int Codigo2
    //codigo incia en 2000
    public Cliente( String nombre, String direccion, String telefono) {
        this(); //depierta el otro constructor??
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
      //  this.codigodelobjeto=codigodelobjeto;
    }
    public Cliente(){
    this.codigodelobjeto=Cliente.codigo;
            Cliente.codigo++;
    }
    //q gozu soy csv
    public int getCodigo() {
        return codigodelobjeto;
    }
    /*public void Codigo(){
        Cliente.codigo++;
        System.out.println(codigo);
    }*/
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
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codigo='" + codigodelobjeto + '\'' +
                '}';
    }

}

