package Ejercicios.Peliculeria;

import java.lang.ref.Cleaner;

public class Basededatos {
/*
    Cliente cliente1 = new Cliente("damian","losnardos","924523452");
    Cliente cliente2 = new Cliente("carlos","4esquinas","912345674");

    Pelicula peli1 = new Pelicula("elfantasma","terror",34.5f);
    Pelicula peli2 = new Pelicula("jajaxdxd","comeidia",32.5f);
*/
    //crear la clase tesCLases

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("damian", "losnardos", "924523451");
        Cliente cliente2 = new Cliente("carlos", "4esquinas", "912345642");
        Cliente cliente3 = new Cliente("damian", "jrturkmekistan", "12345663");
        Pelicula peli1 = new Pelicula("elfantasma", "terror", 34.5f);
        Pelicula peli2 = new Pelicula("jajaxdxd", "comeidia", 32.5f);

        // cliente1.Codigo();
        System.out.println(".............clientes..............");
        System.out.println(cliente1.toString());
        //cliente2.Codigo();;
        System.out.println(cliente2.toString());
        cliente2.getCodigo();
        System.out.println(cliente3.toString());
        cliente3.getCodigo();
        System.out.println("codigo1 :" + cliente1.getCodigo());
        System.out.println("codigo2 :" + cliente2.getCodigo());
        System.out.println("codigo3 :" + cliente3.getCodigo());
        //ahora el valor codigo le pertenece al objeto y no a la clase
        System.out.println("-----------peliculas................");
        System.out.println(peli1.toString());
        System.out.println(peli2.toString());

    }
}
