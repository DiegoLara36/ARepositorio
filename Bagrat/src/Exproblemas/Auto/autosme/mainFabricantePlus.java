package Exproblemas.Auto.autosme;


import java.util.Map;
import java.util.Set;

public class mainFabricantePlus {
    public static void main(String[] args) {
        FabricantePlus fabricante = new FabricantePlus("Seat");
        fabricante.anadeModelo("Leon");
        fabricante.anadeModelo("Arona");
        fabricante.anadeModelo("Ateca");
        fabricante.anadeAuto(new Auto("Leon", "5GZCZ43D13S812715",5,27,2020));
        fabricante.anadeAuto(new Auto("Arona", "SGZCZ43D13S812715",7,1,2021));
        fabricante.anadeAuto(new Auto("Arona", "KLATF08Y1VB363636",4,15,2020));
        fabricante.anadeAuto(new Auto("Ateca", "WP0ZZZ99ZTS392124",1,30,2019));

        Auto[] autosMismoAnio = fabricante.llama(new MismoModelo("Arona"));
        System.out.println("### Autos mismo anio ####");
        for(Auto auto: autosMismoAnio)
            System.out.println(auto);
        Auto[] autosMismoModelo = fabricante.llama(new MismoAnio(2020));
        System.out.println("### Autos mismo modelo ####");
        for(Auto auto: autosMismoModelo)
            System.out.println(auto);


        Map<Integer, Set<Auto>> autosPorAnio =  fabricante.autosPorAnio();
        System.out.println("### autos por Anio ####");
        System.out.println(autosPorAnio);


        Map<Integer, Integer> nroAutosAnio =  fabricante.numeroDeAutosPorAnio();
        System.out.println("### numero de autos por anio ####");
        System.out.println(nroAutosAnio);

    }
}

/**
 * Expected output:
 *
 * <pre>
 ### Autos mismo anio ####
 [SGZCZ43D13S812715, 7/1/2021]
 [KLATF08Y1VB363636, 4/15/2020]
 ### Autos mismo modelo ####
 [KLATF08Y1VB363636, 4/15/2020]
 [5GZCZ43D13S812715, 5/27/2020]
 ### autos por Anio ####
 {2019=[[WP0ZZZ99ZTS392124, 1/30/2019]], 2020=[[5GZCZ43D13S812715, 5/27/2020], [KLATF08Y1VB363636, 4/15/2020]], 2021=[[SGZCZ43D13S812715, 7/1/2021]]}
 ### numero de autos por anio ####
 {2019=1, 2020=2, 2021=1}
 * </pre>
 */