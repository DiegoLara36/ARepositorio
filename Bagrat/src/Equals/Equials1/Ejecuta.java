package Equals.Equials1;

public class Ejecuta {
    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();

        a1.setNombre("anabel");
        a1.setCodigo("0005");

        a2.setNombre("anabel");
        a2.setCodigo("0005");

        System.out.println(a1==a2);     //false
        System.out.println(a1.equals(a2));//false

        System.out.println(a1);
        System.out.println(a2);

    }

}