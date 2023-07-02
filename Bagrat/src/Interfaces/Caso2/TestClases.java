package Interfaces.Caso2;

import Ejercicios.Peliculeria.Basededatos;

public class TestClases {
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        //int i=0;+
        //al mandar sout objeto , te da el tostring .... (importancia del toString)
        for(int i=0;i<bd.clientes.length;i++){
            System.out.println(bd.clientes[i]);
        }



        for(int i=0;i<bd.peliculas.length;i++){
            System.out.println(bd.peliculas[i]);
        }

       // System.out.println(bd.peliculas);

        //mostrar el ultimo codigo autogenerado
        System.out.println();
        //mostrando el ultimo codigo autogenerado


        System.out.println();
        /*
        Cliente [] cleintes = {c1,c2,c3};
        for(Cliente s : cleintes){
            System.out.println(s.toString());
        }
        Pelicula [] peliculas = {p1,p2,p3,p4,p5,p6};
        for(Pelicula s:peliculas){
            System.out.println(s.toString());
        }
*/
        System.out.println("ultimo codigo clinte: "+Cliente.codigo);
        //tambien System.out.println("ultimo codigo clinte: "c3.getCodigo());}
        System.out.println("ultimo codigo Pelicula: "+Pelicula.codigo);

        //ORDENAR
        //VERSIHAY REPETIDAS
        //decir que hay repetidas si tienen la misma categoria

    }
}
