package Hoja_Interactiva_1.HojaInt_1.Aplicacion_StringOrdenBuffermas;

public class Registro extends Datos{

   //estado: casado, nombre: luisa loana lizandro lazares, edad 14
   //ordenar nombres
        //registro con: id,
        private String id;

        private double saldo;//saldo al azar???
        private double monto;//dinero a retirar
        //oid de banco,


    public Registro(String nombre, int edad, String id) {
        super(nombre, edad);
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getNombre(){
        return super.nombre;

    }
    public int getEdad(){
        return super.edad;
    }

    public void setcasado(){
        estado=true;
    }
    public void setId(String id) {
        this.id = id;
    }

    //




    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //loop en reitrar, desear retirar mas??
    public void retirar(){
        /*if(super.estado==true){
            if(saldo<monto){
                System.out.println("no puedes retirar");
            }else{
                System.out.println("puedes retirar");
                saldo = saldo-monto;
                System.out.println("tu saldo es"+saldo);
            }
            if(super.estado==false){
                if(saldo<monto+20){
                    System.out.println("no puedes retirar");
                }else{/*
                    System.out.println("puedes retirar, con descuento");
                    saldo = saldo-monto-20;
                    System.out.println("tu saldo es"+saldo);

                }*/

            if(saldo<monto){
                System.out.println("no se puede retirar");
            }else{
                saldo=saldo-monto;
                System.out.println("su saldo es :" +saldo);
    }

    }





}
