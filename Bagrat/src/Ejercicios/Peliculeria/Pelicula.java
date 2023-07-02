package Ejercicios.Peliculeria;

public class Pelicula {
    static int  codigo=9000;

    private int codigodelobjeto;
    private String  titulo;
    private String tipo;
    private float precio;

    public Pelicula(String titulo, String tipo, float precio) {
        this();
        this.titulo = titulo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Pelicula(){
        this.codigodelobjeto=Pelicula.codigo;
        Pelicula.codigo++;
    }
    public int getCodigo() {
        return codigodelobjeto ;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", codigo='" + codigodelobjeto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
