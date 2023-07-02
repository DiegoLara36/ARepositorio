package Exproblemas.Panaderia;

public class Persona {
        //1 administrador
        //2 carjeros
        //3 maestros panaderos
        //cada uno(DNI,nombre,edad,domicilio,nrhañostrabajo)
        //1-administrador(super,gradoinstruccion,(list)10 ultimosvenetos??))
        //2-cajeros (super,codigocaja)
        //3-maestros(super,añosexperiencia,(list)productosqueelaboran)

    //Productos(codigo,nombre,precio)
    //Salario(admin) =  añosexperiencia*100;
    //Salario(cajero) = añosexp*50;
    //Salario(maestriopanadero) = añosexp*90;
    private String DNI;
    private String nombre;
    private int edad;
    private String domicilio;
    private int aniosdetrabajao;

    public Persona(String DNI, String nombre, int edad, String domicilio, int aniosdetrabajao) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.aniosdetrabajao = aniosdetrabajao;
    }
    public Persona(){
    }

    public void Calcularsalario(){
        System.out.println("salario de persona");
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getAniosdetrabajao() {
        return aniosdetrabajao;
    }

    public void setAniosdetrabajao(int aniosdetrabajao) {
        this.aniosdetrabajao = aniosdetrabajao;
    }
}
