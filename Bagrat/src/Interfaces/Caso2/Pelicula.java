package Interfaces.Caso2;

public class Pelicula {
    static int codigo = 9000;
    private int codigopel;
    private String titulo;
    private String tipo;
    private Float precio;

    public Pelicula(){
        Pelicula.codigo++;
        this.codigopel=Pelicula.codigo;
        codigopel=this.codigopel;
    }

    public Pelicula(String titulo, String tipo, Float precio) {
        this();
        this.titulo = titulo;
        this.tipo = tipo;
        this.precio = precio;
    }


    public int getCodigopel() {
        return codigopel;
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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigopel +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
