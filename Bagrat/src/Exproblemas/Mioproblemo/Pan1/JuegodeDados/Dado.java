package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

public class Dado {
    private int cara;
    //generado automaticamente de 1 a 6
    private int aleatorio;
    //la clase dado funciona
        public int generaAleatorio (){
            return (int)Math.floor( (Math.random()*(6-1+1)) +1);
            //funciona me devuelve un valor entre uno y seis
        }
        public void agita(){
            this.aleatorio=generaAleatorio();
        }
        public int getCara() {
          return this.cara;
        }
    public Dado(){
            //cada vez que llame al constructor genera un dado nuevo
            this.aleatorio=generaAleatorio();
            this.cara = aleatorio;
        }
    @Override
    public String toString() {
            //valor de la cara en string
        return '"'+String.valueOf(getCara())+ '"';
    }
}


