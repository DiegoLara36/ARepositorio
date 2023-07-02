package Stringbuffer;

import javax.print.attribute.AttributeSetUtilities;
import java.util.Scanner;

public class Algoritmosymas {
    public static void main(String[] args) {
        String ora1 = "uss";
        String ora2 = ora1 + "-Maine";
        System.out.println(ora1);
        System.out.println(ora2);
        //StringBuffer util para meter y scar "strings"
        demoStringBuffer();
        Insertar();
        Delete();
        StringBuffer s6 = new StringBuffer("el camino asi es");
        RemmplyMayuscula(s6);
        Randomizar(3);//3 cifras
        //distinto de String pero util para usar tryScanner y scannear una oracion
        ScaneryTrycatch();
        //escanear un String y dividirlo segun scan
        ScanneandoInput();

        AutoEjemplo a1 = new AutoEjemplo();
        //Operadorinstanceof(a1);
        if(a1 instanceof  AutoEjemplo){
            System.out.println("a rambo no le gusta la guerra");
        }

        //separadpr de strings cada vez qu se ve un caracter especifico
        //argumento como java
        //verificar si dos objetos son iguales equals
        //herencia multiple

    }

    private static void demoStringBuffer() {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hms");
        sb1.append(sb1);
        System.out.println(sb1);

        StringBuffer hm = new StringBuffer("aloha");
        hm.append(" mundosolitario");
        System.out.println(hm.toString());
        String s4 = "pipipi : ";
        String s5 = s4 + hm;//para que es necesario el toString


    }

    private static void Insertar() {
        StringBuffer or1 = new StringBuffer();
        or1.append("taxi driver");
        or1.insert(5, "fukin ");
        System.out.println(or1);
    }
    private static void Delete() {
        StringBuffer or1 = new StringBuffer();
        or1.append("nicolas copola cage");
        or1.delete(8,14);
        System.out.println(or1);
    }

    //mayusucla y reemplazar
    private static void RemmplyMayuscula(StringBuffer c){
        //c.concat(" mandaloriano")
        c.append(" mandaloriano");
        c.toString().toUpperCase().replace('a','o');
        System.out.println(c.toString());
        //necesita ser srtring para meterle mayuscula
        //ncesita ser string para aplicar concat
        // es mejor append porque es de la foma StrinBuffer}
        }

    public static void Randomizar(double n){
        double aux = Math.random()*Math.pow(10,n);
        /*directo
        System.out.println(Math.random()*Math.pow(10,n));
        System.out.println((int)(Math.random()*Math.pow(10,n)));
        */
        System.out.println(aux);
        System.out.println((int)(aux));
        //un dia del año entre y 360
        //Math.floor(  (Math.random()*(max-min+1))   +min);
        int dia = (int)Math.floor(Math.random()*(2-1+1)+1);
        System.out.println("dia del año: "+dia);
        //redondeo
        System.out.println("redondeo de -10.5; "+Math.round(-10.5));
        //raiz
        System.out.println("raiz de 34: "+Math.sqrt(34));
    }

    public static void ScaneryTrycatch(){
        //podersoa detecta texto y entero por eso se llama
        //scanner xd
        try(Scanner sc = new Scanner("Anakin 34 Julio 96")){
            String nombre1= sc.next();
            int edad1 = sc.nextInt();
            String nombre2 = sc.next();
            int edad2 = sc.nextInt();
            System.out.println("nombre1: "+nombre1+", edad1: "+edad1);
            System.out.println("nombre2: "+nombre2+", edad2: "+edad2);
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("error al extraer la edad ");
        }

    }
        public static void ScanneandoInput(){
            Scanner sc = new Scanner(System.in);
            String nombre, direccion;
            int edad;
            System.out.println("introduce tu nombre: ");
            nombre=sc.nextLine();

            sc.nextLine();
            //limpia el buffer de entrada

            System.out.println("introduce tu direccion: ");
            direccion=sc.nextLine();
            System.out.println("introduce tu edad: ");
            edad=sc.nextInt();
            System.out.println("nombre: "+nombre);
            System.out.println("direccion: "+direccion);
            System.out.println("edad: "+edad);
        }

    public static class AutoEjemplo{
        String color;

        public AutoEjemplo(String color) {

        }
        public AutoEjemplo(){

        }
        //
    }
}
