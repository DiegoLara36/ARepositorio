package Exproblemas.Mioproblemo.Pan1.NatacionM;

import exColecciones.Mapsample.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPrueba {

    public static void main(String[] args) {
        Alumno a1 = new Alumno(122,"Samuel","11225698B","sargeras_67");
        Profesor p1 = new Profesor(142,"Maldonado","56734344F","sargeras_67");
        Alumno a2 = new Alumno(122,"Mancocapac","11225698C","illidanStormgage_56");
        Alumno a3 = new Alumno(142,"Armoniaca","812455123B","ionelectgron_56");
        Alumno a4 = new Alumno(112,"Gargamel","11225698C","elbichosiuuu_56");
        Alumno a5 = new Alumno(142,"Zachary","11225698B","sargeras_67");
        Alumno a6 = new Alumno(162,"Louis","11225698A","messirve_56");
        Alumno a7 = new Alumno(102,"Constantine","11225698R","realdeallisa");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<probando restriccion de edad>>>>>>>>>>>>>>>>>>>>>>>");
        RestriccionEdad re = new RestriccionEdad(18);
        //      EXCEPCION DE LA CLASE ALUMNO, DEL METODO VALIDACAMPOS
        // Da exceocion si edad es menor a
        //Alumno a8 = new Alumno(-12,"Ameno","123123xD","amenonoleamenonolie");
        // Da error si el argumento del alumno es nulo
        //Alumno a9 = new Alumno();
        Persona a10 = new Alumno(12,"williamwallace","134567","freedom_scotland");
        ///debo pasarlo como persona ???
        System.out.println("valida a a10 ?"+re.valida(a10));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Probando comparator>>>>>>>>>>>>>>>>>>>>>>>>>");
        List<Alumno> Alumnotest= new ArrayList<>();
        Alumnotest.add(a1);
        Alumnotest.add(a2);
        Alumnotest.add(a3);
        Alumnotest.add(a4);
        Alumnotest.add(a5);
        Alumnotest.add(a6);
        Alumnotest.add(a7);
        //sale ordenado (nombrecomparator funciona)

        Collections.sort(Alumnotest,Alumno.nombreComparator);
        System.out.println("despues de ordenar por nombre");
        System.out.println(Alumnotest);//tooStringenpersona

        //poliomorfismo, cuando llame a un tipode estilo se comportatra como estilo
        Estilo estiloEspalda = new EstiloEspalda();
        Estilo estiloLibre = new EstiloLibre();
        Estilo estiloMariposa = new EstiloMariposa();
        Estilo estiloPecho = new EstiloPecho();
        //estilo que no existe

        //agregando estilos (debe darme error en caso le agrege el que no debe)
        List<Estilo> estilos1 = new ArrayList<>();
        List<Estilo> estilos2 = new ArrayList<>();
        List<Estilo> estilos3 = new ArrayList<>();
        List<Estilo> estilos4 = new ArrayList<>();

        estilos1.add(estiloEspalda);
        estilos1.add(estiloPecho);

        estilos2.add(estiloMariposa);
        estilos2.add(estiloEspalda);

        estilos3.add(estiloLibre);
        estilos3.add(estiloPecho);
        estilos3.add(estiloEspalda);

        estilos4.add(estiloPecho);
        estilos4.add(estiloMariposa);
        estilos4.add(estiloEspalda);

        a1.agregarEstilos(estilos1);
        a2.agregarEstilos(estilos2);
        a3.agregarEstilos(estilos3);
        a4.agregarEstilos(estilos2);
        a5.agregarEstilos(estilos4);
        a6.agregarEstilos(estilos1);
        a7.agregarEstilos(estilos4);
        //5 y 7 deberian rebotar


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<comprobando si funciona el EQUALS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //hereda de la clase padre en este caso persona
        System.out.println(a1);
        //tambien hereda el equlas de Persona// interesante
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a5));
        //alumno a buscar
       // Alumno alumno = a1;
        //lsita donde buscar
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        //a2,a5
        //a5, busca
        //a5 lo encuentra en a1 pero con equals con override
        System.out.println(buscar(a6,alumnos));
        //a1 esta en la lista
        //el alumno debe estar en la lista
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<busando un alumno que no esta en la lista>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("index de alumnos (si no existe=-1): "+ alumnos.indexOf(new Alumno(34,"muriel","11225698B","sargeras_67")));
        //esta en el index2

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<proando el adde estilos con sus restricciones>>>>>>>>>>>>>>>>>>>>>>>>>");
        //7 objetos alumno creados

        a1.agregarEstilos(estiloPecho);
        a1.agregarEstilos(estiloEspalda);
        a1.agregarEstilos(estiloLibre);
        //a1 tiene tres
        System.out.println(a1.getEstilos());
        //tiene los 3 estilos agregados, funiona el agregar estilos

        a2.agregarEstilos(estiloEspalda);
        a2.agregarEstilos(estiloLibre);
        a2.agregarEstilos(estiloMariposa);

        a3.agregarEstilos(estiloMariposa);
        a3.agregarEstilos(estiloLibre);
        a3.agregarEstilos(estiloEspalda);
        a3.agregarEstilos(estiloPecho);
        //esta mal. si fuese solo mariposa deberia agregar max 2

        System.out.println(a2.getEstilos());
        System.out.println(a3.getEstilos());

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Probando dar de alta >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //agrega hasta un maximo de 3

        SesionNatacion sn = new SesionNatacion() ;
        sn.setProfesor(p1);//´profesor agregado

    }
    //El algoritmo funciona
    static  int  buscar(Alumno alumno,List<Alumno> alumnos){
        int aux =0;
        int pos =0;
        for(Alumno s: alumnos){
            pos++;
            //si alumno es igual al otro
            if(alumno.equals(s)){
                aux++;
                break;
            }
        }
        if(aux==0){
            return -1;
        }else {
            return pos;
        }
    }



}
