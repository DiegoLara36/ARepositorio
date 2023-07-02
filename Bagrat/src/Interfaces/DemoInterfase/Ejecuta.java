package Interfaces.DemoInterfase;

public class Ejecuta {

    public static void main(String[] args) {

        AutoDeLujo al1 = new AutoDeLujo();
        AutoDeLujo al2 = new AutoDeLujo();
        AutoDeLujo al3 = new AutoDeLujo();

        AutoDeportivo ad1 = new AutoDeportivo();
        AutoDeportivo ad2 = new AutoDeportivo();
        AutoDeportivo ad3 = new AutoDeportivo();

        System.out.println("\n?????????????AUTODELUJO??????????????");
        al1.CalcularCombustible();
        al1.recargarCombustible();
        al1.desacelerar();
        al1.acelerar();

        System.out.println("\n?????????????AUTODEPORTIVO????????????");
        ad1.CalcularCombustible();
        ad1.recargarCombustible();
        ad1.desacelerar();
        ad1.acelerar();

        Auto[] autos = {ad1, ad2, ad3, al1, al2, al3};
        System.out.println("//////////////////////////////////////////");
        for (Auto a : autos) {
            a.acelerar();
        }
        System.out.println("//////////////////////////////////////////");

        AutoDeLujo[] autosdelujo = {al1, al2, al3};
        for (AutoDeLujo a : autosdelujo) {
            a.acelerar();
        }
        System.out.println("//////////////////////////////////////////");

        //dos tipos de auto y avion, dentro de una rray
        Avion av1 = new Avion();
        Avion av2 = new Avion();

        Desplazable[] desplazables = {ad1, ad2, ad3, al1, al2, al3, av1, av2};

        for (Desplazable a : desplazables) {
            a.acelerar();
        }
        System.out.println("//////////////////////////////////////////");
    }
}
