package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

public class Cajero extends  Empleado{



    public Cajero(int dni, String nombre, String domicilio, int aniostrabajando, int aniosdeexpeiencia) {
        super(dni, nombre, domicilio, aniostrabajando);
    }

    @Override
    public float Salario() {

        return aniostrabajando*50;
    }
}
