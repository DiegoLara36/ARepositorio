package Dirigida2.Contrasenia;

public class EjecutaContraseia {

    public static void main(String[] args) {
        Usuario us1 = new Usuario("stalin", "stalinsvhilli", 34, "123456", "choloPAYET_tuterror45");
        Usuario us2 = new Usuario("grigory", "zhukov", 56, "123456", "jaimitoelmalito");

        System.out.println(us1.equals(us2));
        System.out.println(us1.toString());
        System.out.println(us2.toString());

        Constrasenia c1 = new Constrasenia(us1.getNombre(), us1.getApellido(),us1.getEdad(),us1.getDNI(),us1.getContrasenia());
        c1.esClaveFuerte();
        c1.VisualizarTodo();
        Usuario ss[] = {us1,us2,c1};

        //Usuario poli = new Constrasenia();


    }



}