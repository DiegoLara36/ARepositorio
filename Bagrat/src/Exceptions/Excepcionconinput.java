package Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcionconinput {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        //IMPUT CON LOOP DOWHILE Y TRYCATCH
        System.out.println("flag antes " + flag);
        //System.out.println(flag);
        int n = 0;
        do {
            flag = true;

            try {
                System.out.println("ingresa el numero sobrino");
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                flag = false;
                sc.nextLine();//limpiando el buffer
                //reproduce lo que hay aca
            }finally{
                System.out.println("inecesarioperonecesario");
            }
            System.out.println("el productox10 es: " + (n * 10));
            System.out.println("flag despues " + flag);

        } while (!flag);




    }
}
