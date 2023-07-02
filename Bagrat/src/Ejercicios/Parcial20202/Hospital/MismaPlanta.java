package Ejercicios.Parcial20202.Hospital;

public class MismaPlanta implements Criterio{

    private int planta;

    public MismaPlanta(int planta) {
        this.planta = planta;
    }

    @Override
    public boolean CumpleCondicion(Paciente paciente, Habitacion habitacion) {
        return false;
    }
}
