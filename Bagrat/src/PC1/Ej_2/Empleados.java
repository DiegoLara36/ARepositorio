package PC1.Ej_2;

public abstract class Empleados extends Universitario {

    private String nrRegistro;

    public Empleados(String nombre, String direccicon, String nrRegistro) {
        super(nombre, direccicon);
        this.nrRegistro = nrRegistro;
    }
    //para que puedan llamar los metos que heredan xddxd

    public String getNrRegistro() {
        return nrRegistro;
    }

    public void setNrRegistro(String nrRegistro) {
        this.nrRegistro = nrRegistro;
    }
}
