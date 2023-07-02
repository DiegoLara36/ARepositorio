package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

import java.util.*;

public class Cachito {
    private List<Dado> dadoslist;// = new ArrayList<>();
    private int numerodedados;//
    //cada vez que genero un constructor creo un cachito
    public Cachito(int numerodedados){
      dadoslist = new ArrayList<>();
      if(numerodedados<=0){
          throw new DadoException("el numero de dados no puede ser negativo");
      }
      for(int i=0;i<numerodedados;i++){
          Dado dado = new Dado();
          dadoslist.add(dado);
          //son del mismo valor
      }
    }
    //consigues los dados para le cachito

    //simular el agitado de los dados,( de la lista dados)

   // Set<Dado> tira;

    public Set<Dado> tira() {
        Set<Dado> setdados = new LinkedHashSet<>();
        for (Dado s: getDados()){
            s.agita();//agira para que se cambie el valor
            setdados.add(s);
        }
        //retorma un conjunto de datos pero agitados
        return setdados;
    }

    public List<Dado> getDados(){
        //el cosntructor crea la lista dados
        return dadoslist;
    }
    // da el valor de la lista de dados
    public void setDadoslist(List<Dado> dadoslist) {
        this.dadoslist = dadoslist;
    }

}
