package Dirigida2.Empleadodatos;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private String DNI;//no es obligatorio
    private double sueldobase;
    private double pagoporhoraextracadahora;
    private double horasextrames;
    private double tipo; //porcentaje
    private String estadocivil;
    private int nrohijos;


    //private double montodehorasextra;
    //private double sueldobruto;
    //private double retenciones;//Impuesto a la renta

    public double getMontohorasextra(){
        return pagoporhoraextracadahora*horasextrames;
    }
    public double  getSueldoBruto(){
        return sueldobase+getMontohorasextra();
    }
    //mismo dni, son igales
    public double Retenciones() {
        //imúesto a la renta
        if (estadocivil == "C") {
            if (tipo - 2 - (double)nrohijos > 0) {
                return (tipo - 2 - (double)nrohijos);
            } else {
                return 0.d;
            }
        }else if (estadocivil == "S") {
            if (tipo - (double)nrohijos > 0) {
                return (tipo - (double)nrohijos);
            } else {
                return 0.d;
            }
        }else{
            return 0.f;
        }

    }

    public double getHorasextrames() {
        return horasextrames;
    }

    public void setHorasextrames(double horasextrames) {
        this.horasextrames = horasextrames;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }

    public double getPagoporhoraextracadahora() {
        return pagoporhoraextracadahora;
    }

    public void setPagoporhoraextracadahora(double pagoporhoraextracadahora) {
        this.pagoporhoraextracadahora = pagoporhoraextracadahora;
    }

    public Double getTipo() {
        return tipo;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getNrohijos() {
        return nrohijos;
    }

    public void setNrohijos(int nrohijos) {
        this.nrohijos = nrohijos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldobase=" + sueldobase +
                ", pagoporhoraextracadahora=" + pagoporhoraextracadahora +
                ", horasextrames=" + horasextrames +
                ", tipo=" + tipo +
                ", estadocivil='" + estadocivil + '\'' +
                ", nrohijos=" + nrohijos +
                '}';
    }
    public void visualizarEmpleado(){

    }
    public void visualizartodo(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(DNI, empleado.DNI);
        //mismo dni, entonces osn igauales

    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, DNI, sueldobase, pagoporhoraextracadahora, horasextrames, tipo, estadocivil, nrohijos);
    }
}
