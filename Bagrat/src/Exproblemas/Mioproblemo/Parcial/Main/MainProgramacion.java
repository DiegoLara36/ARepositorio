package Exproblemas.Mioproblemo.Parcial.Main;

import Exproblemas.Mioproblemo.Parcial.GuiaException;
import Exproblemas.Mioproblemo.Parcial.ProgramacionTV;
import Exproblemas.Mioproblemo.Parcial.ProgramasTVCortos;

import java.io.IOException;

public class MainProgramacion {

    public static void main(String[] args) throws IOException {
        String cadenaEntrada = "BBC One>Money for Nothing@14:15-40#Sky News>Kay Burley@8:00-25#Sky News>Kay Burley@8:30-25#Channel 4>Channel 4 News@19:00-55#BBC Two>Saving Lives at Sea@19:30-25#Channel 4>Hollyoaks@18:30-25#BBC Two>Richard Osman's House of Games@18:00-25#BBC Two>The Farmer's Country Showdown@18:30-55#Channel 4>Food Unwrapped's Sweet Treat@20:00-55#ITV>The Chase@17:00-55#ITV>Tipping point@16:00-55#ITV>Tenable@15:00-55#Channel 4>Suspect@21:00-25#BBC One>Bargain Hunt@12:15-40#BBC One>News at One@13:00-25#ITV>ITV News Regional@18:00-25#ITV>Coronation Street@20:00-25#ITV>Emmerdale@18:30-55#BBC One>Doctors@13:45-25#BBC One>BBC London@13:30-10#ITV>ITV Evening News@18:30-55";
        // Variable para almacenar una guia de programación
        ProgramacionTV guia;

        // Se inicialza guia con los datos de la cadena de texto
        guia = crearGuia(cadenaEntrada);

        try {
            // Se muestra la información de la guia en la consola de salida
            guia.mostrarProgramas();

            // Se consulta la consistencia de la guia de "ITV", que debe ser false
            // Para que sea consistente basta eliminar la última línea de la cadena.
            validarConsistencia(guia, "ITV");
            // Se consulta la consistencia de la guia de "BBC One", que debe ser true
            validarConsistencia(guia, "BBC One");
            // Se consulta la consistencia de la guia de "NBC", que debe producir una
            // excepción, porque la cadena NBC no está en la guia.
            validarConsistencia(guia, "NBC");
        } catch (GuiaException pe) {
            System.err.println(pe.getMessage());
        }

        // Se seleccionan los programas que tienen 30 minutos o menos
        System.out.println("Los programas de menos de media hora son: \n" + guia.filtrosProgramas(new ProgramasTVCortos(30)));
    }

    /**
     * Devuelve un objeto ProgramacionTV a partir de la información almacenada
     * en la cadena que se pasa como argumento
     *
     * @return Una ProgramacionTV
     */
    private static ProgramacionTV crearGuia(String cadena){
        ProgramacionTV res = new ProgramacionTV();
        res.leerPrograma(cadena);
        return res;
    }

    private static void validarConsistencia(ProgramacionTV guia, String cadena) {
        String esNoEs = guia.esConsistente(cadena) ? " es " : " no es ";
        System.out.println("La cadena " + cadena + esNoEs + "consistente");
    }

}

/**
 * Expected output:
 *
 * <pre>
 BBC One:
 BARGAIN HUNT@[12:15]-40
 NEWS AT ONE@[13:0]-25
 BBC LONDON@[13:30]-10
 DOCTORS@[13:45]-25
 MONEY FOR NOTHING@[14:15]-40
 BBC Two:
 RICHARD OSMAN'S HOUSE OF GAMES@[18:0]-25
 THE FARMER'S COUNTRY SHOWDOWN@[18:30]-55
 SAVING LIVES AT SEA@[19:30]-25
 Channel 4:
 HOLLYOAKS@[18:30]-25
 CHANNEL 4 NEWS@[19:0]-55
 FOOD UNWRAPPED'S SWEET TREAT@[20:0]-55
 SUSPECT@[21:0]-25
 ITV:
 TENABLE@[15:0]-55
 TIPPING POINT@[16:0]-55
 THE CHASE@[17:0]-55
 ITV NEWS REGIONAL@[18:0]-25
 EMMERDALE@[18:30]-55
 CORONATION STREET@[20:0]-25
 Sky News:
 KAY BURLEY@[8:0]-25
 KAY BURLEY@[8:30]-25

 La cadena ITV es consistente
 La cadena BBC One es consistente
 Los programas de menos de media hora son:
 [BBC LONDON@[13:30]-10, CORONATION STREET@[20:0]-25, DOCTORS@[13:45]-25, HOLLYOAKS@[18:30]-25, KAY BURLEY@[8:0]-25, KAY BURLEY@[8:30]-25, NEWS AT ONE@[13:0]-25, RICHARD OSMAN'S HOUSE OF GAMES@[18:0]-25, SAVING LIVES AT SEA@[19:30]-25, SUSPECT@[21:0]-25]
 La programacion presenta el siguiente error:  : La cadena de tv: [NBC] no existe
 * </pre>
 */


