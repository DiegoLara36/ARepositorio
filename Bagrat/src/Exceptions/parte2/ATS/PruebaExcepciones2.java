package Exceptions.parte2.ATS;

import java.io.*;
import  java.util.Scanner;
public class PruebaExcepciones2 {

    public static void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\diego\\Documents\\20223-II\\po\\ste.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea2;
        while ((linea2=bf.readLine())!=null){
            System.out.println(linea2);
        }
        //no se ha reportado java.io.FileNotFoundException, de la linea 9
        // o declaramos dicha excepcion o la capturamos con trycacth
        System.out.println("aea mano");
    }
    //con la clase inmediata o su csuperclase
    //se pueden declara cuantas excepciones se requieran
    public static void leerArchivo2() throws  IOException{
        //leerArchivo(); // nos sale error
        // o la caputaramos con trycatch o declaramos dicha excepcion

    }

    public static void main(String[] args) throws IOException{
        System.out.println("antes del error");
        leerArchivo();
        System.out.println("despues del error");
    }
    // dos opciones o con throw arriba, o con trycatch
     /*   while (true){
        try {
            if (!((linea=bf.readLine())!=null)) break;

        System.out.println(linea);
    }
*/

    //dos opciones o throw a la clase try catch l metodo




}
