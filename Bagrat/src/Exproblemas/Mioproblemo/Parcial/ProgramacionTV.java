package Exproblemas.Mioproblemo.Parcial;

import java.util.*;

public class ProgramacionTV  {

    protected Map<String, Set<ProgramasTV>> cadenasYProgramas;

    //nombres de canaels = cadenas de tv

    //ingresa un mapa (nombre del canal, conjuntos de datos(set))

    public ProgramacionTV() {//constructor sin argumentos
        cadenasYProgramas = new TreeMap<String, Set<ProgramasTV>>();
        //ordena de manera automatica por nombre String
        this.cadenasYProgramas = cadenasYProgramas;
    }
        //en el main se crea un objeto de la clase filtrosprogrmaas

    public Set<ProgramasTV> filtrosProgramas(FiltrosProgramas seleccion){
        Set<ProgramasTV> programasrestriccion = new TreeSet<>();
        for(Map.Entry<String,Set<ProgramasTV>> map: cadenasYProgramas.entrySet()){

            //seleccion.filtro(map.getValue());
            programasrestriccion.addAll(seleccion.filtro(map.getValue()));
        }
        return programasrestriccion;
    }
    public void agregar(String cadenaTV, ProgramasTV programa){
        //Map<String, set<Programas>>
        //agregar datos,
        //Set<ProgramasTV> programas = new TreeSet<>();

        //el valor del mapa, el mapa que tiene
        //String , Set<Progrma>
        //strin key agrego programa si no tiene nada
        //pero si no lo creo
        if(!cadenasYProgramas.containsKey(cadenaTV)){
            Set<ProgramasTV> programas = new TreeSet<>();
            //en algun momento lo tengo que agregar
            programas.add(programa);
            cadenasYProgramas.put(cadenaTV,programas);
        }else{
            //al set le agrego el programa
            cadenasYProgramas.get(cadenaTV).add(programa);
        }
       // this.cadenasYProgramas.put(cadenaTV,programas);
    }
    //ejemplo
    //BBC One>Money for Nothing@14:15-40#Sky News>Kay Burley@8:00-25
    public void leerPrograma(String leerPrograma) {
        List<String> separados = new ArrayList<>();
        String[] separando1 = leerPrograma.split("#");
        //BBC One>Money for Nothing@14:15-40
        //Sky News>Kay Burley@8:00-25
        for (String s : separando1) {
            System.out.println(s);
        }//concentration, concemtration
        //String[] partes
        for (int i = 0; i < separando1.length; i++) {
            String[] partes = separando1[i].split("[>@:-]");

            if (partes.length == 5) {
                for (int k = 0; k < partes.length; k++) {

                    separados.add(partes[k]);
                }
            }
        }
        System.out.println(".......valores.........");
        for (int i = 0; i < separados.size(); i++) {
            System.out.println(separados.get(i));
        }
        System.out.println("........................");
        int i = 0;
        while (i < separados.size()) {
            ProgramasTV pt = new ProgramasTV();
            pt.setNombredelprograma(((separados.get(i + 1))));
            pt.setHorainicioprog(new Hora(Integer.parseInt(separados.get(i + 2)), Integer.parseInt(separados.get(i + 3))));
            pt.setDuracion(Integer.parseInt(separados.get(i + 4)));//i=4
            agregar(separados.get(i), pt);
            i = i + 5;// leidos y agregados
            //canal,progrma,Hora(hora,minutos),duracion
        }
    //funcuona
    }
    public boolean esConsistente(String cadenaTV){
        List<ProgramasTV> listaaux= new ArrayList<ProgramasTV>(cadenasYProgramas.get(cadenaTV));

                int cont =0;
                //tengo el conjunto pero quiero el orden
             //pasar a una cadena string
             //si la duracion del primero es mayor que la diferencia entre el primero y el sigueinte

             for(int i=0;i<cadenasYProgramas.get(cadenaTV).size()-1;i++){
                    for(int j=i+1;j<cadenasYProgramas.get(cadenaTV).size();j++){
                        if((listaaux.get(i).getDuracion()>listaaux.get(i).getHorainicioprog().diferenciaMinutos(listaaux.get(j).getHorainicioprog()))){
                           cont++;
                        }
                    }
             }


        //si se pasa de la hora del siguiente no es consistente
       if(cont==0){
           return true;
       }else{
           return false;
       }
    }

    public Map<String, Set<ProgramasTV>> getCadenasYProgramas() {
        return cadenasYProgramas;
    }
    //Map.Entry<String, Set<Auto>> map: mapaa.entrySet()
    public void mostrarProgramas() {
            for(Map.Entry<String,Set<ProgramasTV>> map: cadenasYProgramas.entrySet()){
                //StringBuilder sb = new StringBuilder(map.getKey()+" :+\n+")
                System.out.println(map.getKey()+":");
                for(ProgramasTV s: map.getValue()){
                    System.out.println("\t"+s);
                }

            }
            //usando StringBUilder
    }
    /*ProgramasTVCortos tvc = new ProgramasTVCortos(45);

    public Set<ProgramasTV> filtro(Set<ProgramasTV> progs,) {
        //recibe un conjunto de progrmas
        //y a partir de este evalua si pasan la duracion minina
        Set<ProgramasTV> programasaprobados = new TreeSet<>();

        for(ProgramasTV s : progs){
            if(s.getDuracion()>=tvc.duracionReferencia){
                programasaprobados.add(s);
            }
        }

        return programasaprobados;
    }*/
    @Override
    public String toString() {
        return "ProgramacionTV{" +
                "cadenasYProgramas=" + cadenasYProgramas +
                '}';
    }
}






