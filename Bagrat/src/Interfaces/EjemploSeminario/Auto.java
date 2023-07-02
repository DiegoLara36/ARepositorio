package Interfaces.EjemploSeminario;

public abstract class Auto {
    private String placa ;
    private String moedelo;

    public abstract  void girar();
    //si a un metodo no le pones abstracto vas a tener que implementarlo
    //no puedes poner un metodo abastracto en una clase que no es abstracta
    public void rotar(){
        System.out.println("rotar el auto");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMoedelo() {
        return moedelo;
    }

    public void setMoedelo(String moedelo) {
        this.moedelo = moedelo;
    }
}
