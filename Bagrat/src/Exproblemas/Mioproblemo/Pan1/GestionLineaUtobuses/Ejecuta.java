package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {
    //Bus(bus126, 25, DHLIQ126)
        List<Bus> busesDisponibles = new ArrayList<>();
        Bus bus1 = new Bus("bus121", 25);
        bus1.setMatricula("LIAQP121");
        Conductor cond1 = new Conductor("con121", "45444721", "Julio Perez");
        cond1.setAnhiosManejo(7);
        cond1.setCapacitaciones(Arrays.asList("Actualizacion de Reglas", "Concientizacion"));
        bus1.setConductor(cond1);

        Bus bus2 = new Bus("bus122", 25);
        bus2.setMatricula("MOBPJ122");
        Conductor cond2 = new Conductor("con122", "45444722", "Jaime Gonzales");
        cond2.setCapacitaciones(Arrays.asList("Actualizacion de Reglas",
                "Concientizacion"));
        cond2.setAnhiosManejo(6);
        bus2.setConductor(cond2);

        Bus bus3 = new Bus("bus123", 25);
        bus3.setMatricula("DHLIQ123");
        Conductor cond3 = new Conductor("con123", "45444723", "Julio Cortazar");
        cond3.setAnhiosManejo(3);
        cond3.setCapacitaciones(Arrays.asList("Manejo de ira"));
        bus3.setConductor(cond3);

        Bus bus4= new Bus("bus124", 27);
        bus4.setMatricula("DHQLI124");
        Conductor cond4 = new Conductor("con124", "45444724", "Jaime Villanueva");
        cond4.setAnhiosManejo(2);
        cond4.setCapacitaciones(Arrays.asList("Manejo de ira", "Actualizacion de Reglas",
                "Concientizacion", "Respeto de normas", "Civismo", "Mecanica basica"));
        bus4.setConductor(cond4);

        Bus bus5 = new Bus("bus125", 25);
        bus5.setMatricula("DHEAQ123");
        Conductor cond5 = new Conductor("con125", "45444725", "Mario Donofre");
        cond5.setAnhiosManejo(5);
        cond5.setCapacitaciones(Arrays.asList("Manejo de ira"));
        bus5.setConductor(cond5);

        Bus bus6 = new Bus("bus126", 25);
        bus6.setMatricula("DHLIQ126");
        Conductor cond6 = new Conductor("con126", "45444726", "Carlos Carlin");
        cond6.setAnhiosManejo(3);
        cond6.setCapacitaciones(Arrays.asList("Manejo de ira","Actualizacion de Reglas",
                "Concientizacion", "Respeto de normas", "Civismo", "Mecanica basica"));
        bus6.setConductor(cond6);

        busesDisponibles.add(bus1);
        busesDisponibles.add(bus2);
        busesDisponibles.add(bus3);
        busesDisponibles.add(bus4);
        busesDisponibles.add(bus5);
        busesDisponibles.add(bus6);


        System.out.println("#######Impirmiendo los datos del servicio #########");
        System.out.println(busesDisponibles);

        Servicio servicio = new Servicio("Lima",busesDisponibles);

        System.out.println("#########imprimiendo los buse filtrados, sus conductores y sus capacitaciones #########");
        System.out.println("#####Bus######");
        //instatnciados los 3 tipos de criterios
        Criterio criterioliena = new FiltroLinea(25);
        Criterio criteriomatricula = new FiltroMatricula("LI");
        Criterio criterioexperiencia = new FiltroExpManejo(5);

        //filtrar con el criterio indicado arrb
        //el criterio ya fue indicado, falta llamar al objeto
        //funciona de momento ....
        List<Bus> filtradospolinea = servicio.filtra(criterioliena);
        List<Bus> filtradospormatricula = servicio.filtra(criteriomatricula);
        List<Bus> filtradospoerexperiencia = servicio.filtra(criterioexperiencia);
        System.out.println("##########imprimiendo los datos del serivicio##############");

        System.out.println(servicio);

    }
}
