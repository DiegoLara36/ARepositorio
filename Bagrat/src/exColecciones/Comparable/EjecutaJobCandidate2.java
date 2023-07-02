package exColecciones.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EjecutaJobCandidate2 {

    public static void main(String[] args) {

        JobCandidate j1  = new JobCandidate("Kyle Reese","Male",35);
        JobCandidate j2 = new JobCandidate("TommyWiessau","Male",54);
        JobCandidate j3 = new JobCandidate("Betty Davies", "Female",78);
        JobCandidate j4 = new JobCandidate("Zordon PR","Male",116);
        JobCandidate j5 = new JobCandidate("Frank Zaine","Male",76);
        JobCandidate j6 = new JobCandidate("Arthas Menethil","Male",13);

        ArrayList<JobCandidate> jobCandidateslista = new ArrayList<>();
        jobCandidateslista.add(j1);
        jobCandidateslista.add(j2);
        jobCandidateslista.add(j3);
        jobCandidateslista.add(j4);
        jobCandidateslista.add(j5);
        jobCandidateslista.add(j6);
        System.out.println(".............antes de ordenar.............");
        for(JobCandidate s: jobCandidateslista){
            System.out.println(s);
        }

        //una vez asignado el orden que quiero hacer en el override
        Collections.sort(jobCandidateslista);
        //ORDENA SGUN LOS NOMBRES CTV
        System.out.println("..................despues de ordenar.............");

        for(JobCandidate s: jobCandidateslista){
            System.out.println(s);
        }


    }


}
