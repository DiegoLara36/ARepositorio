package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

public class FiltroLinea implements  Criterio{

    private int codLinea;

    public FiltroLinea(int codLinea) {
        if(codLinea<0){
            throw  new TransporteException("el codigodelalinea no puede ser neativo");
        }
        this.codLinea = codLinea;
    }
    public boolean busEsSeleccionable (Bus bus){
        //debe berificar que el bus del argumento
        if(bus.getCodLinea()==codLinea){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Autobuses de la linea ["+codLinea+"]";
    }
}
