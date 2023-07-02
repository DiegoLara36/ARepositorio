package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

import java.util.List;
import java.util.Objects;

public class Conductor {
    private String codigo;//codioconductor
    private String dni;
    private String nombre;
    private int anhiosManejo;
    private List<String> Capacitaciones;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnhiosManejo() {
        return anhiosManejo;
    }

    public void setAnhiosManejo(int anhiosManejo) {
        this.anhiosManejo = anhiosManejo;
    }

    public List<String> getCapacitaciones() {
        return Capacitaciones;
    }

    public void setCapacitaciones(List<String> capacitaciones) {
        Capacitaciones = capacitaciones;
    }

    public Conductor(String codigo, String dni, String nombre) {
        if(codigo==null||dni==null||nombre==null){
            throw  new TransporteException("los datos del conductor no pueden ser nulos");
        }
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conductor conductor = (Conductor) o;
        return Objects.equals(codigo, conductor.codigo) && Objects.equals(dni, conductor.dni) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, dni, nombre, anhiosManejo, Capacitaciones);
    }

    @Override
    public String toString() {
        return "Conductor(" +this.codigo+", "+this.dni+", "+this.nombre+")";
    }
}
