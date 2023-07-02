package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;


import java.util.Objects;

public class Bus {
    //String codigo, int codLinea, String matricula
    private String codbus;
    private int codLinea;
    private String matricula;
    private Conductor conductor;

    public Bus(String codbus, int codLinea) {
        if(codbus==null||codLinea<0)
            throw new TransporteException("el codigo no puede ser nulo ni la linean negativa");
        this.codbus = codbus;
        this.codLinea = codLinea;
    }

    public String getCodbus() {
        return codbus;
    }

    public void setCodbus(String codbus) {
        this.codbus = codbus;
    }

    public int getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(int codLinea) {
        this.codLinea = codLinea;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(codbus, bus.codbus) && Objects.equals(matricula, bus.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codbus, codLinea, matricula, conductor);
    }

    @Override
    public String toString() {
        return "Bus("+this.codbus+", "+this.codLinea+", "+this.matricula+")";
    }
}
