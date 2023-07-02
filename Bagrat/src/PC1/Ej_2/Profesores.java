package PC1.Ej_2;

public class Profesores extends Empleados implements Mostrar{
    private String departamento;

    public void Adscribirse(String departamento){
        this.departamento=departamento;
    }
    public Profesores(String nombre, String direccicon, String nrRegistro) {
        super(nombre, direccicon, nrRegistro);
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void Mostrar() {
        System.out.println("Profesor#"+super.getNombre()+"-"+super.getDireccion()+"-"+super.getNrRegistro()+"-"+getDepartamento());
    }
    //flata heredar nro de registro



}
