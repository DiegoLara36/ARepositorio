package Ejercicios.Parcial20202.Hospital;

public class NacidoAntesDe implements  Criterio{

    private int anio;

    public NacidoAntesDe(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean CumpleCondicion(Paciente paciente, Habitacion habitacion) {
        return false;
    }
}
