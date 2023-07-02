package Exproblemas.Auto.autosme;


public class mainFabricante {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("Seat");
        fabricante.anadeModelo("Leon");
        fabricante.anadeModelo("Arona");
        fabricante.anadeModelo("Ateca");
        fabricante.anadeAuto(new Auto("Leon", "5GZCZ43D13S812715",5,27,2020));
        fabricante.anadeAuto(new Auto("Arona", "SGZCZ43D13S812715",7,1,2021));
        fabricante.anadeAuto(new Auto("Arona", "KLATF08Y1VB363636",4,15,2020));
        fabricante.anadeAuto(new Auto("Ateca", "WP0ZZZ99ZTS392124",1,30,2019));
        System.out.println(fabricante);

        Auto[] autosMismoAnio = fabricante.llama(new MismoModelo("Arona"));
        System.out.println("### Autos mismo anio ####");
        for(Auto auto: autosMismoAnio)
            System.out.println(auto);
        Auto[] autosMismoModelo = fabricante.llama(new MismoAnio(2020));
        System.out.println("### Autos mismo modelo ####");
        for(Auto auto: autosMismoModelo)
            System.out.println(auto);

        System.out.println("#### despues de cargar la cadena de autos ###");
        String cadena = "Leon,5GZCZ43D13S812721,4/15/2020#Arona,SGZCZ43D13S812716,4/15/2020#Ateca,KLATF08Y1VB363637,4/15/2020#Ateca,WP0ZZZ99ZTS392125,4/15/2020";
        fabricante.leeAutos(cadena);
        System.out.println(fabricante);

        System.out.println("### insertando auto de marca no registrada ###");
       fabricante.anadeAuto(new Auto("Civic", "SGZCZ43D13S812716",7,1,2021));

    }

    /**
     * Expected output:
     *
     * <pre>
     Seat<Leon:[[5GZCZ43D13S812715, 5/27/2020]], Arona:[[SGZCZ43D13S812715, 7/1/2021], [KLATF08Y1VB363636, 4/15/2020]], Ateca:[[WP0ZZZ99ZTS392124, 1/30/2019]]>
     ### Autos mismo anio ####
     [SGZCZ43D13S812715, 7/1/2021]
     [KLATF08Y1VB363636, 4/15/2020]
     ### Autos mismo modelo ####
     [5GZCZ43D13S812715, 5/27/2020]
     [KLATF08Y1VB363636, 4/15/2020]
     #### despues de cargar la cadena de autos ###
     Seat<Leon:[[5GZCZ43D13S812721, 4/15/2020], [5GZCZ43D13S812715, 5/27/2020]], Arona:[[SGZCZ43D13S812716, 4/15/2020], [SGZCZ43D13S812715, 7/1/2021], [KLATF08Y1VB363636, 4/15/2020]], Ateca:[[WP0ZZZ99ZTS392124, 1/30/2019], [WP0ZZZ99ZTS392125, 4/15/2020], [KLATF08Y1VB363637, 4/15/2020]]>
     ### insertando auto de marca no registrada ###
     Exception in thread "main" uni.edu.pe.autos.AutosException: La distribuidora de autos tuvo el siguiente error:  : El modelo del auto no existe
     at uni.edu.pe.autos.Fabricante.anadeAuto(Fabricante.java:28)
     at uni.edu.pe.main.MainFabricante.main(MainFabricante.java:35)
     * </pre>
     */
}
