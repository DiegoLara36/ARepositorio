package Dirigida2.Ecuacioncuadratica;

import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("valor de a: ");
        a=sc.nextDouble();
        sc.nextLine();
        System.out.println("valor de b: ");
        b=sc.nextDouble();
        sc.nextLine();
        System.out.println("valor de c: ");
        c=sc.nextDouble();

        double discriminante;
        discriminante = Math.pow(b,2)-(4*a*c);
        double aux =0,aux2=0;
        if (discriminante<0){
            System.out.println("no hay solucion real");
        }else{
            aux = (-b+Math.sqrt(discriminante))/2*a;

            aux2 = (-b-Math.sqrt(discriminante))/2*a;

           if(aux==aux2){
               System.out.println("la solucion es unica y son: "+aux);
           }else{
               System.out.println("la soluciones  son: "+aux +", "+aux2);
           }

        }
    }
}
