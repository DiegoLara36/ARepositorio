package Exproblemas.Natacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Separar {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        File file = new File("robotGeneralizado.in");
        Scanner sc = new Scanner(file);
        //String entrada = "1 9W#1 1|2 101 102 1|#1@4 1U4 1@#1 1|2 3=2 1|#2 1%5_1/";

        int casos = Integer.parseInt(sc.nextLine());
        String[] lineas = new String[casos];//separando las lineas

        for(int i=0;i<casos;i++){//
            lineas[i]=sc.nextLine();
        }

        ordenaCasos(casos, lineas);

        System.out.println();
        for(int i=0;i<casos;i++){
            System.out.println("caso #["+lineas[i].substring(0,1)+"]");
            dibujaRobot(lineas[i].substring(2));
            System.out.println();
        }
    }

    private static void ordenaCasos(int casos, String[] lineas) {
        for(int i = 0; i< casos; i++){
            for(int j = i+1; j< casos; j++){
                if(lineas[i].substring(0,2).compareTo(lineas[j].substring(0,2))>0){
                    String lineaAux = lineas[i];
                    lineas[i] = lineas[j];
                    lineas[j] = lineaAux;
                }
            }
        }
    }

    private static void dibujaRobot(String entrada) {
        String[] lineas = entrada.split("#");
        for(String linea : lineas ){
            //System.out.println("["+linea+"]");
            int i=0;
            while(i<linea.length()){
                int cont = linea.charAt(i) -'0';
                char dibujar = linea.charAt(i+1);
                for(int j=0;j<cont;j++)
                    System.out.print(dibujar);
                i=i+2;
            }
            System.out.println();
        }
    }
}
