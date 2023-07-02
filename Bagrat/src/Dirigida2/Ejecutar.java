package Dirigida2;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Ejecutar {
    ;
    private static int Mayor(ArrayList<CuentaBancaria> cuentas[]){
        int aux;
        for(int i=0;i<cuentas.length;i++){

        }
       return 0; // no me sale con arraylist aún
    }
    private static int Mayorr(CuentaBancaria cuentas[]){
        double auxiliar=cuentas[0].getSaldoactual();
        int mayor=0;
        for(int i=1;i<cuentas.length;i++){
            if (auxiliar<cuentas[i].getSaldoactual()){
                auxiliar=cuentas[i].getSaldoactual();
                mayor=i;
            }
        }
        return mayor;
    }
    private static int prom(CuentaBancaria cuentas[]){
           double  cont=0;
        for(int i=1;i<cuentas.length;i++){
            cont = cont +cuentas[i].getSaldoactual();
            }
            return (int) (cont/ cuentas.length);
    }

    public static void main(String[] args) {



        CuentaBancaria usuario1 = new CuentaBancaria(12345678,1500,0.5);
        CuentaBancaria usuario2 = new CuentaBancaria(45678123,2000,0.3);
        CuentaBancaria usuario3 = new CuentaBancaria(56789123,600,0.4);
        usuario1.setDia(12);//dia 12
        System.out.println(usuario1.getDia());
        System.out.println(usuario1.getSaldoactual());

        usuario1.actualizarSaldo();
        System.out.println(usuario1.getSaldoactual());
        //acutaliza el saldo actual
        usuario1.setIngresar(400);
        System.out.println(usuario1.getSaldoactual());
        usuario1.setRetirar(1000);
        System.out.println(usuario1.getSaldoactual());
        usuario1.setRetirar(926);
        System.out.println(usuario1.getSaldoactual());
        usuario1.formatearDNI();
        usuario1.imprimirDetalle();
        usuario2.setDia(95);
        usuario2.actualizarSaldo();
        usuario2.imprimirDetalle();
        System.out.println("el formateo es: "+usuario2.formatearDNI());
        //q gozu csv
        //el codigo funciona, solo falta el arreglo
        usuario3.actualizarSaldo();
        usuario3.imprimirDetalle();
        //arary list o un arreglo de objetos
        //VALODAR QUE NO EXISTAN CUENTAS IGAULES
        //SALDO PROMEDIO DE LAS CUENTAS
        //DNI FORMATEADO DEL CLIENTE CON MAYOR SALDO
        /*

        ArrayList<Figura> figuras = new ArrayList<>();
        //figuras.add(cuadrado2); no me deja
        figuras.add(cuadrado); // me deja
        //figuras.add(triangulo2); no me deja
        //  figuras.add(circulo2); no me deja
        figuras.add(circulo2);
        figuras.add(triaungulo2);
        figuras.add(circulo4);
         */

        ArrayList<CuentaBancaria> cuentas = new ArrayList<>(List.of());
        cuentas.add(usuario2);
        cuentas.add(usuario1);
        cuentas.add(usuario3);

        //Mayor(cuentas);

        CuentaBancaria[] cuenta= new CuentaBancaria[3];
        cuenta[0]=usuario1;
        cuenta[1]=usuario2;
        cuenta[2]=usuario3;
        System.out.println("el usuario con mayor monto es el dni : "+cuenta[Mayorr(cuenta)].getDni()+" con un monto de "+cuenta[Mayorr(cuenta)].getSaldoactual());
        System.out.println("el promedio de montos es: " +prom(cuenta));
        // q gozu mrd

    List<CuentaBancaria> lista= new ArrayList<>();
        lista.add(usuario1);
        lista.add(usuario2);
        lista.add(usuario3);


/*
        int nroCtas = lstCta.size();
        for(int i=0; i<nroCtas-1;i++){
            for(int j=i+1;j<nroCtas;j++){
                if(lstCta.get(i).equals(lstCta.get(j))){
                    System.out.println("cuentas iguales encontradas");
                    // agregandole una excepción para validar, bastaba con el mensaje anterior
                    throw new RuntimeException("Cuentas iguales");
                }
            }
        }
     */

        //creo un auxiliar objeto

        CuentaBancaria ctaMayorSaldo = null;
        //creamdp un objeto de cuentabancarria sin datos
        double montoTotal=0;
        double mayorSaldo=-1.d;
        for(CuentaBancaria cb: lista){
            montoTotal += cb.getSaldoactual();//da el monto total
            if(cb.getSaldoactual()>mayorSaldo){
                mayorSaldo = cb.getSaldoactual();
                ctaMayorSaldo = cb;
            }
        }
    }
        //cb es el objeto en cuestion
        //qda
}
