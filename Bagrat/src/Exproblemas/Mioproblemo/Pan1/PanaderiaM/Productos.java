package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

import Dirigida1.Producto;

import java.util.Collections;
import java.util.Comparator;

public class Productos {

    //codigo, nobmre, precio
    private String codigo;
    private String nombre;
    private float precio;

    public Productos(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
/*
    public static Comparator<Producto> comparacionporprecio= new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            return  (int)(o1.getMonto()-(o2.getMonto()));
        }// no se puede comparar un float??
    };
    */

    /*
    *  Cliente c1 = new Cliente("anabel","jrMancocapac","123456789");
    Cliente c2 = new Cliente("rafael","jrCaceres","234567890" );
    Cliente c3 = new Cliente("marisol","jrPachactec","345678901");

    Pelicula p1 = new Pelicula("lanochedelterror","terror",8.5f);
    Pelicula p2 = new Pelicula("diadeaccion","accion",10.45f);
    Pelicula p3 = new Pelicula("diaD","drama",7.5f);
    Pelicula p4 = new Pelicula("Vergadores","comedia",4.5f);
    Pelicula p5 = new Pelicula("drMencgeche","comedia",6.7f);
    Pelicula p6 = new Pelicula("Avatar","drama",15.40f);

    Cliente [] clientes = {c1,c2,c3};
    Pelicula [] peliculas = {p1,p2,p3,p4,p5,p6};
    *
    * */
}
