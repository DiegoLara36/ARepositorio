package Dirigida2;

public class CuentaBancaria {

    private static long numerodecuenta=123456789;
    private long dni;
    private double saldoactual;
    private double interesanual; // porcentaje

    private int dia;
    private long numerocuentadeobjeto;

    public CuentaBancaria(long dni, double saldoactual, double interesanual) {
        this();
        this.dni = dni;
        this.saldoactual = saldoactual;
        this.interesanual = interesanual;
    }

    public CuentaBancaria(){
        this.numerocuentadeobjeto=CuentaBancaria.numerodecuenta;
        CuentaBancaria.numerodecuenta++;
    }

    public long getNumerodecuenta() {
        return numerocuentadeobjeto;
    }

  /*  public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }*/

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public double getInteresanual() {
        return interesanual;
    }

    public void setInteresanual(double interesanual) {
        this.interesanual = interesanual;
    }

    //metodo actualizarSaldo()??? cuantos dias fechas ????

    // metodo Ingresar(dobule) ingresar cantidad a la cueta
   public void setDia(int dia){
        this.dia=dia;
    }
    public int getDia(){
        return dia;
    }
    public void actualizarSaldo(){
        saldoactual=saldoactual*((interesanual/360)*(double)dia+1);
   }

    public void setIngresar(double abono){
       saldoactual=saldoactual+abono;//abono pos
    }

    //MEtodo Retirar(double) permitira sacar una cantidad de la cuenta (si hay saldo)
    public void setRetirar(double retiro){
        if(retiro<=saldoactual){
            saldoactual=saldoactual-retiro;
        }else{
            System.out.println("no puedes retirar mas de lo que tienes ");
        }
    }


    //metodo imprimirDetalle() nos permiet mostrar todos los datos de la cuenta
    /*public void impremirDetalle() {
        System.out.println("sus datos de cuenta son\n" + numerodecuenta + "\t" + dni + "\t" + saldoactual);
    }*/


    public void imprimirDetalle() {
        System.out.println( "CuentaBancaria{" +
                "dni=" + dni +
                ", saldoactual=" + saldoactual +
                ", interesanual=" + interesanual +
                ", dia=" + dia +
                ", numerocuenta=" + numerocuentadeobjeto +
                '\'' +
                '}'
   );

         }

    //metodo actualizar saldo
    private int aux;

    //metodo formatear ddni:  resto = dni - dni/23, para cada caso una letra)
    //son 22 xD
    private String letter;
    public String  formatearDNI(){
        //muestra el dni formateado
        //8 digitos un guion
        aux=((int)(dni%23));

       switch (aux){
            case 0:
                letter="T";
                break;
            case 1:
                letter="R";
                break;
            case 2:
                letter="W";
                break;
            case 3:
                letter="A";
                break;
            case 4:
                letter="G";
                break;
            case 5:
                letter="M";
                break;
            case 6:
                letter="Y";
                break;
            case 7:
                letter="F";
                break;
            case 8:
                letter="P";
                break;
            case 9:
                letter="D";
                break;
            case 10:
                letter="X";
                break;
            case 11:
                letter="B";
                break;
            case 12:
                letter="N";
                break;
            case 13:
                letter="J";
                break;
            case 14:
                letter="Z";
                break;
            case 15:
                letter="S";
                break;
            case 16:
                letter="Q";
                break;
            case 17:
                letter="V";
                break;
            case 18:
                letter="H";
                break;
            case 19:
                letter="L";
                break;
            case 20:
                letter="C";
                break;
            case 21:
                letter="K";
                break;
            case 22:
                letter="E";
                break;
        }
       return (dni+"-"+letter);
    }
    //metodo retirar (double)  permite sacar siempre que haya saldo


    // dos cuentas son iguales si teien el mismo deni y el mismo saldo
        //meter dos ifs of ver el objeto???

    //debo aprender a verificar si dos objetos son iguales

    //generar n instancias de cuantas bancarias
    //


}
