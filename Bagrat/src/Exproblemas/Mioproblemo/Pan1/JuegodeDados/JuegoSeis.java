package Exproblemas.Mioproblemo.Pan1.JuegodeDados;

public class JuegoSeis extends  Juego{

    private int n;//numero de dados
    private int numSeis; // numero de seises a conseguir

    public JuegoSeis(int n, int numSeis) {
        this.n = n;
        this.numSeis = numSeis;
    }

    @Override
    public int simula() {
        Cachito cachito2 = new Cachito(n);
        return 0;
    }
}
