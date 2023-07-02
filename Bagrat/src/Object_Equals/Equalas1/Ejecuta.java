package Object_Equals.Equalas1;

public class Ejecuta {
    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        a1.setNombre("damian");
        a1.setCodigo("00023");

        Alumno a2 = new Alumno();
        a2.setNombre("mateo");
        a2.setCodigo("00023");

        System.out.println(a1==a2);
        //despues de override si se puede comparar
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a2);
        //ya se hacer override

    }
}
