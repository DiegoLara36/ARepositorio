package Hoja_Interactiva_1.HojaInt_1.Aplicacion_StringOrdenBuffermas;

import java.util.Scanner;

public class Ejecutar {


    public static void main(String[] args) {

        Registro d1 = new Registro("luisa valledares valencia",45,"123456");
       /*
       try(Scanner sc = new Scanner(d1.nombre)){
           String nombrel = sc.nextLine();
           String apellido1 =sc.nextLine();
           String apellido2 = sc.nextLine();
           sc.nextLine();//limpiando buffer
       }catch(Exception e){
           e.printStackTrace();
           System.out.println("eror al extraer los datos");
       }*/
        //CONSEJO NO TE COMPLIQUES CON EL PROBRAMA HAS LO MAS BASICO Y LUEGO LO VAS COMPLEJIZANDO

        d1.setSaldo(Math.random()*1000);
        System.out.println("cantidad de dinero "+d1.getSaldo());
        System.out.println("saldo "+d1.getSaldo());
       int k=1;
       while(k!=0){
           System.out.println("su cuenta bancaria es"+d1.getId());

           System.out.println("su cuenta tiene esta cantidad de soles "+d1.getSaldo());
           Scanner sc2 = new Scanner(System.in);
           System.out.println("cuanto dinero va a retirar: +sr(a) ");
           Double monto1 = sc2.nextDouble();
           d1.setMonto(monto1);
           System.out.println(".........el monto es "+d1.getMonto()+"..........");
           sc2.nextLine();
           d1.retirar();
           System.out.println("ahora le queda "+d1.getSaldo());
           System.out.println("desea retirar mas dinero?(y=1,n=0) ");
           int yn = sc2.nextInt();

          if(yn==0){
              k=0;
              System.out.println("su saldo es :"+d1.getSaldo());
           }
       }

        System.out.println("esta usted casado? : ");



    }
}
