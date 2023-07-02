package Exproblemas.Panaderia;

import java.util.Arrays;

public class Sistema {
    //cual es el aporte de la panaderia??
    public void MiembodeClase(){
        //retorna el aporte a la panderia
        //suma de precios prodcutos que sabe preparar
    }

    public Sistema(){

    }
    //3 panaderos, cada uno realiza ciertos productos
    public static void aporte(Panadero objpanadero){
        //array de objeto productos
        Producto[] listaproductos = objpanadero.getListaProducto();
        float aportePandero =0;//aux;

        for(int i=0;i< listaproductos.length;i++){
            aportePandero=aportePandero+listaproductos[i].getPrecio();
        }
        System.out.println("el aporte del panadero es: "+aportePandero);

    }

    public void ordena(Administrador objadmin){
        String[] listaeventos = objadmin.getEventos();//un array de string
        //igual a los eventos del admin
        String aux =null;//au
        for(int i=0;i< listaeventos.length-1;i++){
            for(int j=0;j<listaeventos.length-i-1;j++){
                if(listaeventos[j].compareTo(listaeventos[j+1])>0){
                    aux=listaeventos[j+1];
                    listaeventos[j+1]=listaeventos[j];
                    listaeventos[j]=aux;
                }
            }
        }


        for(int i=0;i< listaeventos.length;i++){
                System.out.println("evento: "+i+" :"+listaeventos[i]);
            }

    }
}
