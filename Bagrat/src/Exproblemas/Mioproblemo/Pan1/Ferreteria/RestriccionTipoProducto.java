package Exproblemas.Mioproblemo.Pan1.Ferreteria;

import java.util.List;

public class RestriccionTipoProducto implements  TipoRestriccion {

    List<String> nombreProdRestringidos;
    //lista de productos que no pueden ser vendidos
    public RestriccionTipoProducto(List<String> nombreProdRestringidos) {
        this.nombreProdRestringidos = nombreProdRestringidos;
    }

    @Override
    public boolean valida(Producto p) {
        if(nombreProdRestringidos.indexOf(p)!=-1){
            //si esta en la lista de restringidos
            //no validar//si esta va a retornar falso

            return true;
        }else{
            return false;
        }
    }

}
