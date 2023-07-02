package Exceptions.Ejemplos;

public class PrestamoManager {
    //metodo que toma objeto, te manda disponible, si
    public void registrarPrestamo(PrestamoTO prestamoTO) throws PrestamoManagerException {
        boolean disponible = comprobarDisponiblidad(prestamoTO.getCodigoEjemplar());
        if(!disponible)
            throw new PrestamoManagerException("El ejemplar no se encuentra disponible");
    }
    private boolean comprobarDisponiblidad(String codigoEjemplar) {
        return false;
    }
}

