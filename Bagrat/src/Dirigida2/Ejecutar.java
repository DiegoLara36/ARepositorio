package Dirigida2;

public class Ejecutar {
    public static void main(String[] args) {



        CuentaBancaria usuario1 = new CuentaBancaria();

        usuario1.setDni(123334);
        usuario1.setNumerodecuenta(123456);
        usuario1.setIngresar(1200);
        usuario1.getSaldoactual();
        usuario1.setRetirar(1000);
        usuario1.getSaldoactual();
        usuario1.formatearDNI();
    }

}
