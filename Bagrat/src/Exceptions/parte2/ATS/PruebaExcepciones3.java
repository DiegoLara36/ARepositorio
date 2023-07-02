

package Exceptions.parte2.ATS;

import java.io.*;
import  java.util.Scanner;
public class PruebaExcepciones3 {

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

    public void leerArchivo2() {

        try{
            //try es intenetar
            leerArchivo();
        }catch(FileNotFoundException ex ){//ESTE ES UN OBJETO DE FileNotFoundException
            //con trycatchnosedetienemiprograma
            System.out.println("(1ercatch)-No se ha ecnontrado el archivo deseado(pipipi)");
        }catch(IOException e){
            System.out.println("(2docatch)-ha ocurrido una excepcion verificada(its a disaster)");
        }catch(Exception ex2) {
            System.out.println("(3ercatch)-exepcion general");
        }finally {
            //tratando de leer un archivo. si selee genial, sino
            //pero el finally se ejecuta aun si el try encuentra una excepcion
            System.out.println("(finally)aparezco aun asi no sea necesario");
        }


        System.out.println("PROGRAMA-TERMINADO");
    }
    //con la clase inmediata o su csuperclase
    //se pueden declara cuantas excepciones se requieran
   /* public static void leerArchivo2() throws  IOException{
       //leerArchivo(); // nos sale error
        // o la caputaramos con trycatch o declaramos dicha excepcion

    }*/

    public static void main(String[] args) {
      PruebaExcepciones3 p1 = new PruebaExcepciones3();
        p1.leerArchivo2();
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
