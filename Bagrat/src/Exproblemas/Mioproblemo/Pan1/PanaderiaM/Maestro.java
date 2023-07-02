package Exproblemas.Mioproblemo.Pan1.PanaderiaM;

import Dirigida1.Producto;

import java.util.Comparator;
import java.util.List;

public class Maestro extends  Empleado {

    private int aniosdeexp;
    //lista de procutos
    private List<Productos> productos;

    public Maestro(int dni, String nombre, String domicilio, int aniostrabajando, int aniosdeexp, List<Productos> productos) {
        super(dni, nombre, domicilio, aniostrabajando);
        this.aniosdeexp = aniosdeexp;
        this.productos = productos;
    }

    public List<Productos> getProductos() {
        return productos;
    }


    public int getAniosdeexp() {
        return aniosdeexp;
    }

    public void setAniosdeexp(int aniosdeexp) {
        this.aniosdeexp = aniosdeexp;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", aniostrabajando=" + aniostrabajando +
                "aniosdeexp=" + aniosdeexp +
                ", productos=" + productos +
                '}';
    }
    public static Comparator<Maestro> comparacionnombre= new Comparator<Maestro>() {
        @Override
        public int compare(Maestro o1, Maestro o2) {
           return  (int)(o1.getNombre().compareTo(o2.getNombre()));
        }// no se puede comparar un float??
    };
    public static Comparator<Producto> comparacionporprecio= new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            return (int)(o1.getMonto()-(o2.getMonto()));
        }// no se puede comparar un float??
    };

     //Collections.sort(productos,Productos.comparacionporprecio); // noFUNCIONA>>>>>>>>>>>>>>>>>>>>
    //clase panaderia
    //1 administrador   gradodeinstruccion, lista de ultimos 10 eventos a los que asistio
    //2 cajeros         codigo caja a su responsabildiad
    //3 maestros        años de experiencia, lsita de productos que saben elaborar
    //cada uno tiene dni, nombre, edad, domicilio, #niostrajbando

    //ordenar productos mediante codigo, nombre y precio

    //salario de cada uno es ños de exp*100(admin)
    //exp*90 = maestro, exp*50 = cajero
    public float Salario() {


        return (aniostrabajando+aniosdeexp)*90;
    }

}
