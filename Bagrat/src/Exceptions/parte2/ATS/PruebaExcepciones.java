package Exceptions.parte2.ATS;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import  java.util.Scanner;

public class PruebaExcepciones {
        //cheked
    public static void main(String[] args) throws FileNotFoundException,IOException{
        //throws, si ves un error. Lanzame estos
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\diego\\Documents\\20223-II\\po\\st.txt"));
        //lectura de un arvchivo de texto
        String linea;
        //dos opciones o throw a la clase try catch l metodo
        while ((linea=bf.readLine())!=null){
            System.out.println(linea);
        }


    }
}
