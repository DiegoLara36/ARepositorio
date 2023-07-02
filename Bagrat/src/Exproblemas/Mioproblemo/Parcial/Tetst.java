package Exproblemas.Mioproblemo.Parcial;

import exColecciones.Comparator.Comparator2.Posibilidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tetst {
    public static void main(String[] args) {

        ProgramasTV pt = new ProgramasTV("escalofrios",new Hora(16,30),30);
        ProgramasTV pt2 = new ProgramasTV("edyedi",new Hora(10,0),20);
        ProgramasTV pt3 = new ProgramasTV("Coraje",new Hora(16,30),20);
        ProgramasTV pt4  = new ProgramasTV("PowerRangers",new Hora(11,30),25);
        ProgramasTV pt5 = new ProgramasTV("Billyymandy",new Hora(11,30),25);
        ProgramasTV pt6 = new ProgramasTV("bacaypollito",new Hora(7,30),25);

        List<ProgramasTV> programas = new ArrayList<>();

        programas.add(pt);
        programas.add(pt2);
        programas.add(pt3);
        programas.add(pt4);
        programas.add(pt5);
        programas.add(pt6);

        System.out.println(programas);
        //Collections.sort(programas,ProgramasTV.comparacion_horainicio_duracion_ordenalfabetico);
        System.out.println(programas);

        System.out.println("segundo oreden");
        Collections.sort(programas,ProgramasTV.comparacion_alfabetico_duracion_horainicio);
        System.out.println(programas);
        System.out.println("......................................................");
        String leerPrograma="BBC One>Money for Nothing@14:15-40#Sky News>Kay Burley@8:00-25#NBC news>Morningnews@7:30-60";
        //leerPrograma3(leerPrograma);
        ProgramacionTV pt1 = new ProgramacionTV();
        pt1.leerPrograma("BBC One>Money for Nothing@14:15-40#Sky News>Kay Burley@8:00-25#NBC news>Morningnews@7:30-60");
        pt1.agregar("NBC news",new ProgramasTV("mtvmusic",new Hora(5,30),60));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<MOSTRNSADO PROGRMAAS>>>>>>>>>>>>>>>>>>>>><");
        pt1.mostrarProgramas();
        System.out.println(pt1.getCadenasYProgramas());

        System.out.println(">>>>>>>>>>>>>>>>>>>>><PROGRAMAS COM PUBLICIDAD>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ProgramacionTVPublicidad pub = new ProgramacionTVPublicidad();
        pub.leerPrograma("HISTORY CHANNEL>Alienigenas Ancestrales@14:15-40#DISCOVERY CHANEL>Mythbusthers@8:00-25#ANIMAL PLANET>El encantador de perros@7:30-60");
        pub.mostrarProgramas();
        //salio
        //funciona xd
        System.out.println(">>>>>>>>>>>>>>>MOSTRANDO LOS PROGRMAAS CON FILTRO>>>>>>>>>>>>>");
        FiltrosProgramas filtrosProgramas = new ProgramasTVCortos(45);
        System.out.println(pt1.filtrosProgramas(filtrosProgramas));
        //mes salio todo
    }
    static void leerPrograma2(String leerPrograma){
        List<String> separados;
       String[]separando1=leerPrograma.split("#");
        //BBC One>Money for Nothing@14:15-40
        //Sky News>Kay Burley@8:00-25
        for(String s: separando1){
            System.out.println(s);
        }
        //ArrayList<String> partes = new ArrayList<>();
        for(int i=0;i< separando1.length;i++){
            //cantidad de lineas a operar
            int j=0;
            int cont=0;
            String[][] datos = new String[separando1.length][];
            //matriz agregar
            while(j<separando1[i].length()){
                //solo ve una linea--- BBC One>Money for Nothing@14:15-40
                //split 4 terminos
                char aux = separando1[i].charAt(j);
                if(aux=='>'||aux=='@'||aux==':'||aux=='-'){
                    cont++;
                }
                if(cont==4){
                    String datos2[] = separando1[i].split("[>@:-]");
                    }
                }
                j++;
            }


        }
        //descartar la linea que no se desea
        /*for(int i=0;i< separadosss.length;i++){
            int cont =0;
            ArrayList<String> separando = new ArrayList<>();
            for(int j=0;i<separadosss[i].length();j++) {
                if (separadosss[i].charAt(j) == '>' || separadosss[i].charAt(j) == '@' || separadosss[i].charAt(j) == ':' || separadosss[i].charAt(j) == '-') {
                    cont++;
                }
            }
            if(cont==4){
                separando.add(separadosss[i]);
            }

        }/
        */


    static void leerPrograma3(String leerPrograma){
        List<String> separados = new ArrayList<>();
        String[]separando1=leerPrograma.split("#");
        //BBC One>Money for Nothing@14:15-40
        //Sky News>Kay Burley@8:00-25
        for(String s: separando1){
            System.out.println(s);
        }//concentration, concemtration
        //String[] partes
            for(int i=0;i< separando1.length;i++){
                String[] partes = separando1[i].split("[>@:-]");

                if(partes.length==5){
                    for(int k=0;k< partes.length;k++){

                        separados.add(partes[k]);
                    }
                }
            }

            for(String s : separados){
                System.out.println(s);
            }

        }


    public void mostrarProgramas(){
        StringBuilder sb = new StringBuilder();
        //sb.
    //StringBuilderS
        StringBuffer sc = new StringBuffer();
    }



}
