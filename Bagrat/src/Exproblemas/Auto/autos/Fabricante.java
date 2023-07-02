package Exproblemas.Auto.autos;

import java.util.*;

public class Fabricante {
    protected  String nombre;
    protected Map<String, Set<Auto>> autos;
    //constructorString
    //validar que exista auto
    //anademodelo
    //anadeautto  void ambos
    //toString
    //llmarcriterio auto[]
    //leerautos(string9)ovid
    public Fabricante(String nombre){
        if(nombre==null&&"".equals(nombre)){
            throw new AutosException("el nombre del auto no puede ser nulo");
        }
        this.nombre=nombre;
        autos= new LinkedHashMap<>();
    }

    public void ValidarNoeExistaNIV(Auto auto){
        if(auto==null){
            throw new AutosException("el auto no puede ser nulo");
        }
        //para los valores del mapa
        for(Map.Entry<String,Set<Auto>> set: autos.entrySet()){
            //si el valor del key (set.getvalue) contiene el objeto auto
            //retorna error "ya lo tiene en la "lista""
            if (set.getValue().contains(auto)) {
                throw new AutosException("el auto a agregar ya se encuentra en la coleccion");
            }
        }
        /*if(!autos.containsValue(auto)){
            throw  new AutosException(">>>>el auto a agregar ya esta ");
        }*/
    }
    public void anadeModelo(String modelo){
        if(modelo ==null||"".equals(modelo)){
            throw new AutosException("el modelo no puede ser nulo o vacio");
        }
        //map autos (String modelo, set de <Auto>
        if(autos.containsKey(modelo)){
            throw new AutosException("el modelo ingresado ya existe");
        }
        //reemplza por un nuevo hashset???
        autos.put(modelo,new HashSet<>());
    }
    public void anadeAuto(Auto auto){
        //aniade un nuevo auto a la estructura autos
        //key modelo, ...>set Auto autos(map
        if(auto==null){
            throw new AutosException("el auto no puede ser nulo");
        }//autos es el set de autos
        if(!autos.containsKey(auto.getModelo())){
            //si la key  deol auto no coincide con el modelo
            throw new AutosException("el modelo del auto no existe");
        }
        validarNoExistaNIV(auto);// es solo para validaaar
        Set<Auto> autoset = autos.get(auto.getModelo());
        //declaro el set autoset donde agrego
        if(autoset!=null){
            autoset.add(auto);
        }else{
            autoset= new HashSet<>();
            autoset.add(auto);
        }

    }
    //aniadiendo a una lista de manera automatica
    //ArrayList<Auto> l1 = new ArrayList<>(List.of(new Auto("caña","timma",12,45,12),new Auto("rohan","legalocl",12,11,4)));
    private void validarNoExistaNIV (Auto auto) {
        if (auto == null) {
            throw new AutosException("el auto no puede ser nulo");
        }

        for(Map.Entry<String,Set<Auto>> set : autos.entrySet()){
            if(set.getValue().contains(auto)){
                throw new AutosException("el auto a aguregar ya se encuentra en la coleccion");
            }
        }


    }

    public Auto[] llama(Criterio c){
        //si cumple criterio devuelve array, con todos los autos que cumplen el
        //criterio
        List<Auto> autostotales = new ArrayList<>();
        for(Map.Entry<String, Set<Auto>> set : autos.entrySet()){
            for(Auto auto: set.getValue()){
                if(c.cumpleCondicion(auto)){
                    autostotales.add(auto);
                }
            }
        }
        Auto[] arr = new Auto[autostotales.size()];
        arr=autostotales.toArray(arr);//convierte el list a un array de autos
        return arr;
    }
    // nombre,nivel,dia,mes,anio
    //"Leon,5GZCZ43D13S812721,4/15/2020#Arona,SGZCZ43D13S812716,4/15/2020#Ateca,KLATF08Y1VB363637,4/15/2020#Ateca,WP0ZZZ99ZTS392125,4/15/2020"
    public void leeAutos(String cadenadetexto){
        List<String> separados = new ArrayList<>();
        String[] separando1 = cadenadetexto.split("#");

        for (String s : separando1) {
            System.out.println(s);
        }//concentration, concemtration
        //String[] partes
        for (int i = 0; i < separando1.length; i++) {
            String[] partes = separando1[i].split("[,/]");

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
          Auto auto = new Auto(separados.get(i),separados.get(i+1),Integer.parseInt(separados.get(i+2)),Integer.parseInt(separados.get(i+3)),Integer.parseInt(separados.get(i+4)));//modelo,nivel,mes,dia,anio
         // pt.setNombredelprograma(((separados.get(i + 1))));
         // pt.setHorainicioprog(new Hora(Integer.parseInt(separados.get(i + 2)), Integer.parseInt(separados.get(i + 3))));
         // pt.setDuracion(Integer.parseInt(separados.get(i + 4)));//i=4
         // agregar(separados.get(i), pt);
          anadeAuto(auto);
          i = i + 5;// leidos y agregados
          //canal,progrma,Hora(hora,minutos),duracion
      }
    }

    public void leeAutosAudante(String relacionAutos) {
        String[] autosString = relacionAutos.split("#");
        for (String autoString : autosString) {
            String[] campos = autoString.split(",");
            String modelo = campos[0];
            String niv = campos[1];
            String[] camposFecha = campos[2].split("/");
            int mes = Integer.valueOf(camposFecha[0]);
            int dia = Integer.valueOf(camposFecha[1]);
            int anio = Integer.valueOf(camposFecha[2]);
            Auto auto = new Auto(modelo, niv, mes, dia, anio);
            anadeAuto(auto);


        }

    }
    //llamar leer
    //
}
