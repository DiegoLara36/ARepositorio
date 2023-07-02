package Exproblemas.Auto.autosme;

public class mainAuto {
    public static void main(String[] args) {
        Auto a1 = new Auto("Leon", "1234567890abcdefg", 11,30,2015);
        Auto a2 = new Auto("Arona", "1234567890AbCdefg", 11,25,2016);
        Auto a3 = new Auto("Atecxa", "1234567890abcDEFg", 11,30,2015);

        System.out.printf("%s %ses igual que %s\n", a1, a1.equals(a2) ? "" : "no ", a2);
        System.out.printf("%s %ses igual que %s\n", a2, a2.equals(a3) ? "" : "no ", a3);
        System.out.printf("%s %ses igual que %s\n", a1, a1.equals(a3) ? "" : "no ", a3);
        System.out.printf("%s %ses menor que %s\n", a1, a1.compareTo(a2) < 0 ? "" : "no ", a2);
        System.out.printf("%s %ses menor que %s\n", a2, a2.compareTo(a3) < 0 ? "" : "no ", a3);
        new Auto("Atecxa", "1234567890abcDEg", 11,30,2015);
            //valida: nivel contiene 1 throw devulev error
    }
}


/**
 * Expected output:
 *
 * <pre>
 [1234567890abcdefg, 11/30/2015] no es igual que [1234567890AbCdefg, 11/25/2016]
 [1234567890AbCdefg, 11/25/2016] no es igual que [1234567890abcDEFg, 11/30/2015]
 [1234567890abcdefg, 11/30/2015] es igual que [1234567890abcDEFg, 11/30/2015]
 [1234567890abcdefg, 11/30/2015] es menor que [1234567890AbCdefg, 11/25/2016]
 [1234567890AbCdefg, 11/25/2016] no es menor que [1234567890abcDEFg, 11/30/2015]
 Exception in thread "main" uni.edu.pe.coches.AutosException: La distribuidora de autos tuvo el siguiente error:  : La longitud del niv es invalida
 at uni.edu.pe.coches.Auto.valida(Auto.java:33)
 at uni.edu.pe.coches.Auto.validaCmapos(Auto.java:28)
 at uni.edu.pe.coches.Auto.<init>(Auto.java:17)
 at uni.edu.pe.main.MainAuto.main(MainAuto.java:16)
 * </pre>
 */

