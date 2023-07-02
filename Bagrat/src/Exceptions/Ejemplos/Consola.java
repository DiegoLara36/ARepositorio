package Exceptions.Ejemplos;

public class Consola {
    public static void main(String[] args) {

        //PREstamoTO tiene (codigodeusuario, codigoejemplar)
        //prestamo manager (disinto)
        PrestamoTO prestamoTO = new PrestamoTO();
        prestamoTO.setCodigoUsuario("U001");
        prestamoTO.setCodigoEjemplar("144-002");

        PrestamoManager pm = new PrestamoManager();
        try{
            pm.registrarPrestamo(prestamoTO);
        }catch (PrestamoManagerException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
