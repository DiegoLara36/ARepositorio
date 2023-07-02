package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Testeando {
    public static void main(String[] args) {
        Dado dado = new Dado();
        System.out.println(dado);
        System.out.println(dado.getCara());
        System.out.println(dado.getCara());
        System.out.println(dado.getCara());

        List<Integer> listaprueba = new ArrayList<>();
        listaprueba.add(4);
        listaprueba.add(5);
        listaprueba.add(3);
        listaprueba.add(4);
        listaprueba.add(2);
        listaprueba.add(4);
        listaprueba.add(5);
        System.out.println(agrupa(listaprueba));

        //simula(4,16);
        //simula2(4, 16);
        System.out.println("dadot 1");
        Dado d1 = new Dado();
        System.out.println(d1.getCara());
        System.out.println(d1.getCara());
        System.out.println(d1.getCara());
        System.out.println(d1.getCara());
        System.out.println(d1.getCara());

        System.out.println("Dado 2 ");
        Dado d2 = new Dado();
        System.out.println(d2.getCara());
        System.out.println(d2.getCara());
        System.out.println(d2.getCara());
        System.out.println(d2.getCara());

        System.out.println("agitando dado2 ");
        d2.agita();
        System.out.println(d2.getCara());
        System.out.println(d2.getCara());
        System.out.println(d2.getCara());
        System.out.println(d2);
        List<Dado> dadoslistt = new ArrayList<>(6);
        System.out.println("agregando");
        for(Dado s : dadoslistt){
            dadoslistt.add(new Dado());

        }
        System.out.println("valores de los dados");
        for(Dado s : dadoslistt){
            System.out.println(s.getCara());
        }
        List<Dado> dadoslisttt = new ArrayList<>();

        int numerodedados =5;
        for(int i=0;i<numerodedados;i++){
            Dado dado2 = new Dado();
            dadoslisttt.add(dado);
            System.out.println(dado.getCara());
        }

        System.out.println("fueron necesarios: "+simulaff(4,16));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public static int generaaAleatorio() {
        int aleatorio = 0;
        aleatorio = (int) Math.floor((Math.random() * (6 - 1 + 1)) + 1);
        return aleatorio;

    }


    static TreeMap<Integer, Integer> agrupa(List<Integer> list) {
        TreeMap<Integer, Integer> agrupa = new TreeMap<>();
        if (list == null) {
            throw new DadoException("no puedes adjuntar una lista nula");
        }
        for (int i = 1; i <= 6; i++) {
            int cont = 0;
            for (Integer s : list) {
                if (s == i) {
                    cont++;
                }
            }
            if (cont != 0) {
                agrupa.put(i, cont);
            }

        }
        return agrupa;
    }//fumciona

    /* static int simula(int numDados, int sumaBuscada) {
         int cant=0;
         int suma =0;
         Cachito cachito = new Cachito(numDados);
         return 0;//numero deveces que fue necesaria para que
         //saliera el valor buscado
         while (suma!=sumaBuscada){
             for(Dado s: cachito.getDados()) {//es el list de dados cada uno con su valor
                 suma = suma+s.getCara();
             }
             cant++;
         }
         return cant;
     }*/
    static void simula2(int numDados, int sumaBuscada) {
        int cont = 0;
        int suma = 0;
        int suma2 = 0;
        while (sumaBuscada != suma) {
            Cachito cachito = new Cachito(numDados);
            for (Dado s : cachito.getDados()) {
                //la suma me sale 0
                suma2 = suma2 + s.getCara();
                System.out.print(s.getCara() + "  ");
            }
            System.out.println("\nsuma :" + suma2);
            cont++;
            suma = suma2;
        }

    }
    public static int simulaff(int numDados,int sumaBuscada) {
        //el metodo cachito se crea en simula
        int cant=0;
        int suma ;
        int suma2=0;
        Cachito cachito = new Cachito(numDados);
        //numero deveces que fue necesaria para que
        //saliera el valor buscado
        do{
            for(Dado s: cachito.getDados()) {//es el list de dados cada uno con su valor
                suma2 = suma2 +s.getCara();
            }
            suma = suma2;
            cant++;
        }while(suma!=sumaBuscada);
        return cant;
    }

}
