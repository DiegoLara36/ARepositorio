package Exproblemas.Mioproblemo.Pan1.PanaderiaM;


public class Sistema {
    /*private Maestro maestro;

    public Sistema(Maestro maestro) {
        this.maestro = maestro;
    }
    public Sistema(){

    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public float Aporte(){
        //retorna una lista
        float aux =0;
        for(Productos s: maestro.getProductos()){
            aux = (aux + s.getPrecio());

        }
            return aux;
    }
    */
    public static float Aporte(Maestro maestro) {
        //retorna una lista
        float aux = 0;
        for (Productos s : maestro.getProductos()) {
            aux = (aux + s.getPrecio());

        }
        return aux;
    }


      /*  public static Comparator<Admin> comparacionferia= new Comparator<Admin>() {
            @Override
            public int compare(Admin o1, Admin o2) {
                return  (int)(o1.getNombredeeventos().compareTo(o2.getNombredeeventos()));
            }// no se puede comparar un float??
        };
*/

}
