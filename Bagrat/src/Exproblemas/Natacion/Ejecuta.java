package Exproblemas.Natacion;


import java.util.Collections;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {
        Estilo eMariposa = new EstiloMariposa();
        Estilo eEspalda = new EstiloEspalda();
        Estilo ePecho = new EstiloPecho();
        Estilo eLibre = new EstiloLibre();

        TipoRestriccion tipoRestriccion = new RestriccionEdad(5);
        SesionConRestriccion scr = new SesionConRestriccion(tipoRestriccion);

        Profesor profe = new Profesor("002142KG", "Juan Perez", "jperez@uni.edu.pe", 35 );

        Alumno a1 = new Alumno("20162541J", "Hector Rivadeneyra", "erivadeneyra@uni.pe", 21);
        a1.agregarEstilo(eMariposa);
        a1.agregarEstilo(eEspalda);
        Alumno a2 = new Alumno("20162541G", "Percy Chocata", "lmendiz@uni.pe", 20);
        a2.agregarEstilo(eLibre);
        a2.agregarEstilo(ePecho);
        a2.agregarEstilo(eEspalda);
        //Alumno a3 = new Alumno("20161041G", "Luis Mendiz", "pchocata@uni.pe", 3);
        Alumno a3 = new Alumno("20161041G", "Luis Mendiz", "pchocata@uni.pe", 15);
        a3.agregarEstilo(eLibre);
        a3.agregarEstilo(eEspalda);
        scr.darAlta(a1);
        scr.darAlta(a2);
        scr.darAlta(a3);
        scr.setProfesor(profe);

        System.out.println("#### Antes de ordenar ####");
        for(Alumno a : scr.getAlumnos()){
            System.out.println(a);
        }

        System.out.println("#### Despues de ordenar #####");
        Collections.sort(scr.getAlumnos(), Alumno.nameComparator);
        for(Alumno a : scr.getAlumnos()){
            System.out.println(a);
        }

        System.out.println("#### mostrando los estilos ####");
        //mostrando los estilos y ejecute sus métodos para respirar y mover brazos y piernas.
        for(Alumno a : scr.getAlumnos()){
            System.out.println();
            System.out.println(a);
            List<Estilo> estilos = a.getEstilos();
            for(Estilo est: estilos){
                System.out.println(est);
                est.movimientoBrazos();
                est.movimientoPiernas();
                est.respiracion();
            }
        }

    }
}
