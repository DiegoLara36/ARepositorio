package Exproblemas.Auto.autos;

public class MismoAnio implements  Criterio{

    private int anio;

    public MismoAnio(int anio) {
        if(anio<0){
            throw new AutosException("el anio no puede ser negativo");
        }
        this.anio = anio;
    }

    @Override
    public boolean cumpleCondicion(Auto a) {
       if(anio==a.getAnio()){
           return true;
       }else{
           return false;
       }
    }
}
