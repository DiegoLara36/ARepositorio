package Ejercicios.Pelota;

public class Pelota {
    static int golpes=0;
    //s un static osea si le pongo la clase pelota.golpes=8;
    //pelota.golpes=6;
    //el valor de golpes se reemplza por 6
    //el valor le pertenece a la clase

    //el atirbuto golpes le pertenece a la clase golpes
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        //entreagar a 10 objetos futbolsita
        //entragar a un objeto arquero
        Arquero a = new Arquero();
        Futbolista f1 = new Futbolista();
        Futbolista f2 = new Futbolista();
        Futbolista f3 = new Futbolista();
        Futbolista f4 = new Futbolista();
        Futbolista f5 = new Futbolista();
        Futbolista f6 = new Futbolista();
        Futbolista f7 = new Futbolista();
        Futbolista f8 = new Futbolista();
        Futbolista f9 = new Futbolista();
        Futbolista f10 = new Futbolista();
        f1.Patear(pelota);
        f2.Patear(pelota);
        f3.Patear(pelota);
        f4.Patear(pelota);
        f5.Patear(pelota);
        f6.Patear(pelota);
        f7.Patear(pelota);
        f8.Patear(pelota);
        f9.Patear(pelota);
        f10.Patear(pelota);
        a.Agarrar(pelota);
        System.out.println("numero de golpes: "+pelota.golpes);
    }


}
