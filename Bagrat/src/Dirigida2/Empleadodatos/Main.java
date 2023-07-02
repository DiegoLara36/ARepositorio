package Dirigida2.Empleadodatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Empleado> emplados = new ArrayList<>();
        //System.out.println("numero de empleados a tomar");
        //Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();

        //Empleado [] empleados = new Empleado[n];
       /* for(int i=1;i<=n;i++){
            System.out.println("datos del empleado # "+i);
            System.out.println("nombre: ");
            empleados[i].setNombre(sc.nextLine());
            System.out.println("apellido: ");
            sc.nextLine();
            System.out.println("sueldo base: ");
            sc.nextDouble();
            sc.nextLine();
            System.out.println("pago por horasesxtracadahora");
            sc.nextDouble();
            sc.nextLine();
            System.out.println("horas extra: ");
            sc.nextDouble();
            System.out.println();
        }
        */
        /*
         private String nombre;
    private String apellido;
    private String DNI;//no es obligatorio
    private double sueldobase;
    private double pagoporhoraextracadahora;
    private double horasextrames;
    private double tipo; //porcentaje
    private String estadocivil;
    private int nrohijos;

         */
        Empleado [] empleados = new Empleado[2];
            //practicidad
        empleados[0].setNombre("damian");
        empleados[0].setApellido("gamonal");
        empleados[0].setEstadocivil("C");
        empleados[0].setNrohijos(4);
        empleados[0].setPagoporhoraextracadahora(12);
        empleados[0].setHorasextrames(18);
        empleados[0].setTipo(15.d);
        empleados[0].setDNI("12345");



        empleados[1].setNombre("ana");
        empleados[1].setApellido("garcia");
        empleados[1].setEstadocivil("S");
        empleados[1].setNrohijos(1);
        empleados[1].setPagoporhoraextracadahora(15);
        empleados[1].setHorasextrames(36);
        empleados[1].setTipo(13.d);
        empleados[1].setDNI("12345");
        Empleado[] emp={empleados[0],empleados[1]};

        for(Empleado s : emp) {
            s.visualizartodo();
        }

        System.out.println("son iguales?: "+ empleados[0].equals(empleados[1]));

        //equalsignorecase ve si son iguales
    }
}
