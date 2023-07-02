package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

public class FiltroExpManejo implements  Criterio {

    private int minAnhios;

    public FiltroExpManejo(int minAnhios) {
        if (minAnhios < 0) {
            throw new TransporteException("la cantidad de anijos no puede ser negativa");
        }
        this.minAnhios = minAnhios;
    }


    @Override
    public boolean busEsSeleccionable(Bus b) {
        if (b.getConductor().getAnhiosManejo() > minAnhios) {
            //si los anios de majoe menores a los reuqrios o
            //diferencia, lo que falta
            return true;
        }
        if (b.getConductor().getAnhiosManejo() < minAnhios && (minAnhios - b.getConductor().getAnhiosManejo()) < b.getConductor().getCapacitaciones().size()) {
            return true;
        } else {
            return false;
        }
    }
}
