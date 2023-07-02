package Exproblemas.Mioproblemo.Pan1.NatacionL;

import Exproblemas.Natacion.TipoEstilo;

public class EstiloEspalda extends Estilo{

    public EstiloEspalda(){
        super();
        this.tipoestilo=tipoEstilo.ESPALDA;
        //aplico super
    }

    @Override
    public void movimientoBrazos() {
        System.out.println("alternancia de brazos");
    }

    @Override
    public void movimientoPiernas() {
        System.out.println("batido alternado de piernas");
    }

    @Override
    public void respiracion() {
        System.out.println("respiracion boca arriba");
    }

    /*
    public EstiloEspalda(){
        super();
        this.tipoestilo = TipoEstilo.ESPALDA;
    }*/




}
