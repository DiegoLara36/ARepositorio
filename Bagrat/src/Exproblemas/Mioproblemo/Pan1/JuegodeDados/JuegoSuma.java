package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

import java.util.ArrayList;

public class JuegoSuma extends Juego{
    //jugar hasta conseguir un cachito de cierta suma
    private int numDados;
    private int sumaBuscada;

    @Override
    //el metodo abasteracto que faltaba??
    public int simula() {
        //el metodo cachito se crea en simula
        int cant=0;
        int suma ;

        Cachito cachito = new Cachito(numDados);
        //numero deveces que fue necesaria para que
        //saliera el valor buscado
        do{
            suma =0;
            cachito.tira();
            for(Dado s: cachito.getDados()) {//es el list de dados cada uno con su valor
                suma = suma +s.getCara();
            }
            cant++;
        }while(suma!=this.sumaBuscada);
        return cant;
    }

    public JuegoSuma(int numDados, int sumaBuscada) {
        if(numDados<=0||(sumaBuscada>=numDados||sumaBuscada<=6*numDados)){
            throw new DadoException("la suma buscada debe de cumplir  n<suma<6n");
        }
        this.numDados = numDados;
        this.sumaBuscada = sumaBuscada;
    }


}
