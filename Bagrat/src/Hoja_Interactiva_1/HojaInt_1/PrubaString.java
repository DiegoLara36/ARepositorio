package Hoja_Interactiva_1.HojaInt_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.IllegalFormatCodePointException;

public class PrubaString {

    public static void main(String[] args) {
        //OrdenarNumeros();
        //OrdenarNombres();
        String n1 = "aeamano";
        String n2 =  "zzzzctv";
        //n1>n2
        System.out.println(n1.compareTo(n2));//-25
        System.out.println(n2.compareTo(n1));//25
        //n1.compareTo(n2) (n1 comparado a n2) ----si(), no()
        //n1 comparado a n2 (es n1 mayor a n2) si (-25), no(+25).

        // pasar un arreglo de String a un array
        //Arrays.sort(nombre);


        //invertir un
    }

    private static void OrdenarNombres() {
        String[] nombres = {"anabel", "armando","zakaevh" ,"betsy", "damian","winston","pancrasio"};
        String[] nombres2=nombres;

        Arrays.sort(nombres);
        //comparar Strings
        //Nombre[1].copareto(nombre[2]) =
        for(String s:nombres){
            System.out.println(s);
        }
        String aux2;
        for(int i=0;i<nombres2.length-1;i++){
            for(int j=0;j<nombres2.length-i-1;j++){
                if(nombres2[j].compareTo(nombres2[j+1])>0){
                    aux2=nombres2[j+1];
                    nombres2[j+1]=nombres2[j];
                    nombres2[j]=aux2;
                }
            }
        }

        for(String colection : nombres2){
            System.out.println(colection);
        }

        //invertirs
        System.out.println("-----invertir-----");
        Arrays.sort(nombres2, Collections.reverseOrder());
        for(String col2 : nombres2){
            System.out.println(col2);
        }
    }



    private static void OrdenarNumeros() {
        int[] numeros = {1, 5, 6, 12, 56, 34, 67, 22, 78, 11, 87, 11, 44, 54, 32};
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 1; j < numeros.length - i - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (Integer s : numeros) {
            System.out.println(s);
        }



    }
}
