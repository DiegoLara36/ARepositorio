package Exproblemas.Mioproblemo.Pan1.NatacionL;
enum tipoEstilo{
   PECHO,MARIPOSA,ESPALDA,LIBRE;
}
public abstract class Estilo {
    //flecha negra llama a la clase, flecha blanca hereda, flecha branca punteada inplementa
    public tipoEstilo tipoestilo;

    public  abstract  void movimientoBrazos();
    public abstract  void movimientoPiernas();
    public abstract  void respiracion();

    @Override
    public String toString() {
        return "Estilo{" +
                "tipoestilo=" + tipoestilo +
                '}';
    }

}
