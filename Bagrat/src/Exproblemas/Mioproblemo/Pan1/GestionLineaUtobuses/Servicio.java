package Exproblemas.Mioproblemo.Pan1.GestionLineaUtobuses;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
    //relacion de buses de la ciudad
    private String ciudad ;
    private List<Bus> busesDisponibles;
    private List<Bus> busesFiltrados;

    //filtra(Criterio) list<Bus>
    //filatra(criterio, list<Bus>)  list<Bus>



    public List<Bus> getBusesDisponibles() {
        return busesDisponibles;
    }

    public void setBusesDisponibles(List<Bus> busesDisponibles) {
        this.busesDisponibles = busesDisponibles;
    }

    public List<Bus> getBusesFiltrados() {
        return busesFiltrados;
    }

    public void setBusesFiltrados(List<Bus> busesFiltrados) {
        this.busesFiltrados = busesFiltrados;
    }

    public Servicio(String ciudad, List<Bus> busesDisponible) {
        this.ciudad = ciudad;
        this.busesDisponibles = busesDisponible;
        //busesFiltrados=new ArrayList<>();

        //inicializar el array buses fitrados
    }

    public List<Bus> filtra(Criterio criterio) {
        if(criterio==null){
            throw new TransporteException("el criterio no puede ser nulo");
        }
        return filtra(criterio, busesDisponibles);
        //filtra los buses en funcion al creiterio indicado
    }

    public List<Bus> filtra(Criterio criterio, List<Bus> busesAFiltrar){
        List<Bus> busesselec  = new ArrayList<>();
        for(int i=0;i<busesAFiltrar.size();i++){
            if(criterio.busEsSeleccionable(busesAFiltrar.get(i))){
                busesselec.add(busesAFiltrar.get(i));
            }
        }
        return busesselec;
    }
    //falta corregir


    @Override
    public String toString() {
        return "Servicio{" +
                "ciudad=" + ciudad +
                ", buseDisponible=" + busesDisponibles +
                '}';
    }
}