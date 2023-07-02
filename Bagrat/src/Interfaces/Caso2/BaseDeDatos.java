package Interfaces.Caso2;

public class BaseDeDatos {
        //si qcliente tiene to String
    // al llmar a la clase y sus objetos me daran toString directamente
    Cliente c1 = new Cliente("anabel","jrMancocapac","123456789");
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
}
