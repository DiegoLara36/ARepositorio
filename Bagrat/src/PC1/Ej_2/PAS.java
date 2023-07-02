package PC1.Ej_2;

public class PAS extends Empleados implements Mostrar{
    private String unidadaadministrativa;

    public void Adscribirse(String unidadaadministrativa){
        this.unidadaadministrativa=unidadaadministrativa;
    }

    public PAS(String nombre, String direccicon, String nrRegistro) {
        super(nombre, direccicon, nrRegistro);

    }

    public String getUnidadaadministrativa() {
        return unidadaadministrativa;
    }

    @Override
    public void Mostrar() {
        System.out.println("PAS["+getNombre()+"@"+getDireccion()+"@"+getNrRegistro()+"@"+getUnidadaadministrativa()+"]");
    }

    //te unes o no ();


}
