package PC1.Ej_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       // Alumnos a1 = new Alumnos("damian","barriosaltos123","C001");
        //Profesores p1 = new Profesores("carlos","floresstreet",)
        Alumnos a1 = new Alumnos("damian","avfiss01");
        a1.Matricularse("C001");
        a1.Mostrar();
        //funciona
        Alumnos a2 = new Alumnos("Aladin","avminas02");
        a2.Matricularse("C002");

        Alumnos a3 = new Alumnos("mario","avfaua03");
        a3.Matricularse("C001");

        Alumnos a4 = new Alumnos("Sofia","avfiee05");
        //no se matricula

        Alumnos a5 = new Alumnos("sarmen","avtupac");

        Alumnos a6 = new Alumnos("PhilL","avsinchi");
        a6.Matricularse("C004");

        Profesores p1 = new Profesores("jirafales","jironabato","1");
        p1.Adscribirse("dep01");
        Profesores p2 = new Profesores("batista","4esquinas","3");
        p2.Adscribirse("dep04");

        PAS pas1 = new PAS("camila","blondestreet","chacalonstreet");
        pas1.Adscribirse("UO001");
        PAS pas2 = new PAS ("Matilda","bruneteStreet","2");
        pas2.Adscribirse("UO003");

        ArrayList<Alumnos> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);

        //ordenar alumnos, profesores y cas por nombre
        Alumnos alumnos2[] = {a1,a2,a3,a4,a5,a6};

        Alumnos alaux = null ;
        //ordenando de mayor a menor segun cadena
        System.out.println("------------orden antes................");
        for(Alumnos s : alumnos2){
            s.Mostrar();
        }
        for(int i=0;i< alumnos2.length-1;i++){
            for(int j=0;j< alumnos2.length-i-1;j++){
                if(alumnos2[j].getNombre().toUpperCase().compareTo(alumnos2[j+1].getNombre().toUpperCase())>0){
                    alaux = alumnos2[j+1];
                    alumnos2[j+1]=alumnos2[j];
                    alumnos2[j]=alaux;
                    //traslape
                }

            }
        }

        // sin importar mayusculas
        System.out.println("------------orden despues................");
        for(Alumnos s : alumnos2){
            s.Mostrar();
        }

        /*
        String aux2;
        for(int i=0;i<nombres2.length-1;i++){
            for(int j=0;j<nombres2.length-i-1;j++){
                if(nombres2[j].compareTo(nombres2[j+1])>0){
                    aux2=nombres2[j+1];
                    nombres2[j+1]=nombres2[j];
                    nombres2[j]=aux2;
                }
            }
        }
         */
        Profesores profesores[]={p1,p2};
        Profesores profaux = null;
        for(int i=0;i< profesores.length-1;i++){
            for(int j=0;j< profesores.length-i-1;j++){
                if(profesores[j].getNombre().toUpperCase().compareTo(profesores[j+1].getNombre().toUpperCase())>0){
                    profaux = profesores[j+1];
                    profesores[j+1]=profesores[j];
                    profesores[j]=profaux;
                    //traslape
                }

            }
        }
        System.out.println("---------profesores ordenado----------");
        for(Profesores s: profesores){
            s.Mostrar();
        }

        PAS pasd[]={pas1,pas2};

        PAS pasaux = null;
        for(int i=0;i< pasd.length-1;i++){
            for(int j=0;j< pasd.length-i-1;j++){
                if(pasd[j].getNombre().toUpperCase().compareTo(pasd[j+1].getNombre().toUpperCase())>0){
                    pasaux = pasd[j+1];
                    pasd[j+1]=pasd[j];
                    pasd[j]=pasaux;
                    //traslape
                }

            }
        }
        System.out.println("---------pas ordenado----------");
        for(PAS s: pasd){
            s.Mostrar();
        }

        //hay alumnos repetodps???equals
        //hay igales (usando equals)
        System.out.println(a1.equals(a2));
        int cont =0;
        for(int i=0;i< alumnos2.length-1;i++) {

        for (int j=i; j<alumnos2.length-1;j++){
                if(alumnos2[i].equals(alumnos2[j+1])){
                    cont++;
                }
            }
        }

        Alumnos aprueba1 = new Alumnos("Maicol","casa");
        aprueba1.Matricularse("natacion");

        Alumnos aprueba2 = new Alumnos("Maicol","casa");
        aprueba1.Matricularse("natacion");

        System.out.println("son iguales ap1 y ap2 "+aprueba1.equals(aprueba2));

        //si el centro es el mismo son iguales
        //no son iguales, csv porque
        if(cont!=0){
            System.out.println("hay repetidos");
        }else{
            System.out.println("no hay repetidos");
        }

        System.out.println("iguales a1y a3? "+a1.equals(a3));



    }
}
