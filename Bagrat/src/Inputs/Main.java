package Inputs;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer valor: ");
        int n1= Integer.parseInt(sc.nextLine());
        System.out.println("ingrese el primer valor: ");
        int n2= Integer.parseInt(sc.nextLine());
        System.out.println("diguite la 1ra oracion: ");
        String ora1 = sc.nextLine();
        System.out.println("diguite la 2da oracion: ");
        String ora2 = sc.nextLine();


        Operacion op1= new Operacion();

        System.out.println("la suma es: +" + op1.Suma(n1,n2));
        System.out.println("la resta es: "+ op1.Resta(n1,n2));

        System.out.println("la concatenacion es: "+op1.Concatenar(ora1, ora2));

        System.out.println("desea mosstrar: (1-10)");
        int n3=Integer.parseInt(sc.nextLine());

        if(n3<=10&&n3>=0){
            System.out.println("los resultados son: ");
            op1.mostar(n1, n2, ora1, ora2);
        }

        System.out.println("desea mosstrar por segunda vez: (10-20)");
        int n4=Integer.parseInt(sc.nextLine());

        if(n4<=20&&n4>=10){
            System.out.println("los resultados son: ");
            op1.mostar2(op1.Suma(n1, n2), op1.Resta(n1,n2), ora1, ora2);
        }

    }

}

