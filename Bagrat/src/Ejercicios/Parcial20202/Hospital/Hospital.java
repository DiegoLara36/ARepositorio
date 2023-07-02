package Ejercicios.Parcial20202.Hospital;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hospital {
    private String nombre;
    private int plantas;
    private int habPlanta;
    Map<Paciente,Habitacion> habitacion= new TreeMap<>();
    TreeSet<Habitacion> libres = new TreeSet<>();

    public Hospital(String nombre, int plantas, int habPlanta) {
        this.nombre = nombre;
        this.plantas = plantas;
        this.habPlanta = habPlanta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPlantas() {
        return plantas;
    }

    public int getHabPlanta() {
        return habPlanta;
    }

    public Map<Paciente, Habitacion> getHabitacion() {
        return habitacion;
    }

    public TreeSet<Habitacion> getLibres() {
        return libres;
    }

    //toString
    //leepacientes(String):void
    //valida campos alta(paciente)
    //valida campos (string int int ) void
}
