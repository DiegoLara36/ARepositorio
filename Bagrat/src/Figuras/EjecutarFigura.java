package Figuras;
import java.util.ArrayList;

public class EjecutarFigura {

    public static void main(String[] args) {

        Figura figura = new Figura();
        figura.calculodelArea();

        Circulo circulo = new Circulo(2,4,5);
        circulo.calculodelArea();

        Cuadrado cuadrado = new Cuadrado(12);
        cuadrado.calculodelArea();

        Triangulo triangulo = new Triangulo(3,8);
        triangulo.calculodelArea();

        //Triangulo figuratrafa = new Circulo(12);

        //polimorfismo
        /*
            a una  variable se le puede asignar objetos de la misma clase
            o de una subclase
            izquierda da tipo , derecha instancia
        */
        System.out.println("-------------POLIOMORFISMO-------------------");        ;
        Figura circulo2= new Circulo(3);
        //circulo2.getradio(); no se puede ya que ciruclo se esta comportando como figura
        //circulo comportate como una figura
        //los metodos que puedes usar solo son los declarads en la clase figura

        circulo2.calculodelArea();
        System.out.println("-----------------recuperndo identidad----------------");
        Circulo circulo3 = (Circulo) circulo2;
        System.out.println("radio de figura recuperda: "+  circulo3.getRadio());

        Figura cuadrado2 = new Cuadrado(20);
        Figura triaungulo2 = new Triangulo(12,3);
        Figura circulo4 = new Circulo(11);
        // traungulo2.calculodelArea();


        Figura figuritas[]= new Figura[19];

        // la clase Sting
        ArrayList<String> list = new ArrayList<>();
        //arreglo de objetos, sin poner la cantidad de objetos xD
        //es un array list dinamico
        list.add("innocente");
        list.add("rosales");
        list.add("morales");
        list.add("aduante");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //for mas bacan
        for(String s: list){
            System.out.println(s);
        }

        ArrayList<Figura> figuras = new ArrayList<>();
        //figuras.add(cuadrado2); no me deja
        figuras.add(cuadrado); // me deja
        //figuras.add(triangulo2); no me deja
        //  figuras.add(circulo2); no me deja
        figuras.add(circulo2);
        figuras.add(triaungulo2);
        figuras.add(circulo4);

        for(Figura figuditass: figuras){
            figuditass.calculodelArea();
        }
    }
}
