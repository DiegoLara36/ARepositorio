package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

import java.util.List;

public class Admin extends Empleado {

    private  String gradodeinstruccion;
    private List<String> nombredeeventos;

    public Admin(int dni, String nombre, String domicilio, int aniostrabajando, String gradodeinstruccion, List<String> nombredeeventos) {
        super(dni, nombre, domicilio, aniostrabajando);
        this.gradodeinstruccion = gradodeinstruccion;
        this.nombredeeventos = nombredeeventos;
    }

    public String getGradodeinstruccion() {
        return gradodeinstruccion;
    }

    public void setGradodeinstruccion(String gradodeinstruccion) {
        this.gradodeinstruccion = gradodeinstruccion;
    }

    public List<String> getNombredeeventos() {
        return nombredeeventos;
    }

    public void setNombredeeventos(List<String> nombredeeventos) {
        this.nombredeeventos = nombredeeventos;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "gradodeinstruccion='" + gradodeinstruccion + '\'' +
                ", nombredeeventos=" + nombredeeventos +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", aniostrabajando=" + aniostrabajando +
                '}';
    }
    public float Salario() {


        return aniostrabajando*100;
    }
}
