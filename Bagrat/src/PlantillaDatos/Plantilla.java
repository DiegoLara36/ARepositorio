package PlantillaDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Plantilla {

    //Proudctos static para que los atributos
    public static class Productos {
        private int cantidad;
        private float precio;

        public Productos(int cantidad, float precio) {
            this.cantidad = cantidad;
            this.precio = precio;
        }
    }

    public static void Mostrar() {
        System.out.println("---------------Datos----------------");

    }

    public static void main(String[] args) {

        ArrayList<Productos> productos = new ArrayList<>();
        //add null
        //debo meter un add con null
        //con for
        boolean x=false;
        int i=1;
        String agregando;

        while(x=false){
            //seguir agregando
            System.out.println("agregando datos"+i);
            //bolleano con input
            System.out.println("...............................");

            Scanner sc = new Scanner(System.in);
            int  cantidad;
            float precio;
            System.out.println("diguite la cantidad: ");
            cantidad=sc.nextInt();
            sc.nextLine();
            //limpia el buffer de entrada
            System.out.println("introduce el precio: ");
            precio=sc.nextFloat();
            sc.nextLine();
            productos.add(new Productos(cantidad ,precio));
            //debo ponerle valores de size a productos
            System.out.println("desea agregar mas datos(Y/N) ? : ");
            do {
                agregando = sc.nextLine();

            }while(agregando!="y"||agregando!="Y"||agregando!="N"||agregando!="n");

            if(agregando!="Y"||agregando!="y"){
                x = false;
            }
            i++;
        }
        System.out.println("los datos recopilados son: ");
        for(Productos s:productos){
            System.out.println(s);
        }
        //ver seminario 1
        // formas de ordenamiento



    }

}
