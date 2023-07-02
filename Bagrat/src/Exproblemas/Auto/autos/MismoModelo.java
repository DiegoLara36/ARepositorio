package Exproblemas.Auto.autos;

public class MismoModelo implements  Criterio {

    private String modelo;

    public MismoModelo(String modelo) {
        if(modelo==null){
            throw new AutosException("el modelo no puede ser nulo");
        }
        this.modelo = modelo;
    }

    @Override
    public boolean cumpleCondicion(Auto a) {
        if(modelo==a.getModelo()){
            return true;
        }else{
            return false;
        }
    }
}
