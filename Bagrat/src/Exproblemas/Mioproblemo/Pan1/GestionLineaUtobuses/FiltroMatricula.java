package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

public class FiltroMatricula implements  Criterio{

    private String cadenaBuscar;

    public FiltroMatricula(String cadenaBuscar) {
        if(cadenaBuscar==null){
            throw  new TransporteException("la cadena a abuscar no puede ser nula");
        }
        this.cadenaBuscar = cadenaBuscar;
    }
    public boolean busEsSeleccionable(Bus bus){
        if(bus.getMatricula()==cadenaBuscar){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Autobuses cuya matricula contiene ["+cadenaBuscar+"]";
    }
}
