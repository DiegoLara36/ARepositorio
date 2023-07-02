package Stringbuffer;

import java.lang.invoke.StringConcatException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Repasando {

    public static void main(String[] args) {
        //para conctenar
        String sh= "hola";
        System.out.println(sh.concat(" chau pum!"));
        //equalsignorecase: compara dos strings si son iguales sin importar mayuscula
        String st="taxi";
        System.out.println("dicen los mismo?: "+st.equalsIgnoreCase(sh));
        //cambiar caracteres
        String sr ="calep";
        System.out.println(sr+"--->"+" reemplazando: " +sr.replace('e','i'));
        //recorctar stribg
        String sh2="holamellamomakanaky";
        System.out.println(sh2.substring(4));
        System.out.println(sh2.substring(4,10));
        //a minuscula
        String may = "UNIVERSITARIODEDEPORTES";
        System.out.println(may.toLowerCase());
        //toString()
        String k="holaqtal";
        System.out.println(k);
        System.out.println(k.toString());
        //quitar espacios en blanco, solo al inicio y al final
        String cal = "   hola que tal me llamo elmo0   ";
        System.out.println(cal.trim());

        //sacar caracter
        String oracion44 ="ella esta siempre en portada a toda cara";

        System.out.println("quitandopartes");
        System.out.println(oracion44.charAt(2));
        System.out.println("................BUSQUEDAS............");
        String texto = "Intento hacer la prueba de certificacion java";
        //Indexof
        System.out.println(texto.indexOf("Intento"));
        System.out.println(texto.indexOf("Intentaba"));
        System.out.println(texto.indexOf("tento"));
        System.out.println(texto.indexOf("la"));
        //ultima vez que aparece esa palabra, si no encuentra nada da -1
        System.out.println(texto.lastIndexOf("a"));
        System.out.println(texto.lastIndexOf("tenia"));
        //comienza con ??
        System.out.println(texto.startsWith("Intento"));
        System.out.println(texto.startsWith("tenia"));
        //existe esa palabra ??? endsWith(termina con)
        System.out.println(texto.endsWith("java"));
        System.out.println(texto.endsWith("oracle"));
        //USANOO STRINGBUFFER

        StringBuffer sbk = new StringBuffer();
        sbk.append("unifiis");
        sbk.append(" :");
        System.out.println(sbk);

        //stringbuffer es mutable puede cambiar
        //ventajas, no genera objetos que se quedan en la memoria
        //sobre la misma referencia trabaja
        //Stringbuilder tiene los mismos referencias que stringbuffer
        //pero no es thread-safe??, para evitar problemas de referencia
        //pero bueno para performance
        //es mas rapido
        //str

        //metodos imporatntes de StringBuffer
        StringBuffer td = new StringBuffer("solito");
        td.append(" solom");
        System.out.println(td.toString());

        StringBuffer tk= new StringBuffer();
        tk.append("cosmonauta");
        tk.insert(4,"ICO");
        System.out.println(tk.toString());

        //reverso
        StringBuffer rev = new StringBuffer();
        rev.append("00alagordadrogala11");
        System.out.println(rev.reverse());
        //insertar
        StringBuffer ins = new StringBuffer();
        ins.append("fiis:");
        ins.insert(3,"cartago");
        System.out.println(ins);
        //delete
        StringBuffer dele = new StringBuffer();
        dele.append("que se cuiden los malditos");
        System.out.println(dele.delete(13,dele.length()));
        //metods de la clase math
        //valor absoluto
        System.out.println(-45+"-->"+Math.abs(-45));
        //techo, como -maximo entero
        System.out.println(12.5+"-->"+Math.ceil(12.5));
        //floor es maximo enter
        System.out.println(12.5+"-->"+Math.floor(12.5));
        //maximo de dos numeros
        System.out.println("1 y 2 "+Math.max(1,2));
        //random de 3 digitos
        System.out.println("random de 3 diguitos "+(int)(Math.random()*Math.pow(10,3)));
        System.out.println("random año de 360 dias "+(int)(Math.random()*361));
        //entero mas cercno math.round
        System.out.println("entero mas cernano: 13,77 "+Math.round(13.77));
        //RADIANES, SENO,TAN,RAIZ,DE RADIAN A SEXAGESIMAL,DESEXAGESIMAL A RADIAN

        //AL USAR SCANNER Y NO SE PUEDE RESOLVER CON UN TRY CATCH (ESCEPCIÓN)

        try(Scanner sc2 = new Scanner("Reznov 65 Febrero 11")){
            //desmenuzar un string con scanner
           String nombrex = sc2.next();
           int edad = sc2.nextInt();
           String mes = sc2.next();
           int fecha = sc2.nextInt();
           System.out.println("nacio: mes "+mes+" hace "+edad+" años");
            // cualquier codigo no seguro se
            //mete en un trycatch

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("eror al extraer los datos");
        }

        //Leer datos
        Scanner sc2 = new Scanner((System.in));
        String nombre, direccion;
        int edad;
        System.out.println("introduce tu nombre");
        nombre = sc2.nextLine();
         System.out.println("introduce tu edad");
        edad = sc2.nextInt();
        sc2.nextLine();//limpia el buffer
        System.out.println("introduce tu direccion");
        direccion = sc2.nextLine();
        sc2.close();
        System.out.println("hola "+nombre+" tu vives en "+direccion+" y tienes "+edad+" anios"  );



    }
}
