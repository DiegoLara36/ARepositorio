package Object_Equals;

public class Ejecuta {
    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        a1.setNombre("damian");
        a1.setCodigo("00023");

        Alumno a2 = new Alumno();
        a2.setNombre("damian");
        a2.setCodigo("00023");

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a2);


    }
}
