package Exproblemas.Mioproblemo.Parcial;




import java.util.Comparator;
import java.util.Objects;

public class ProgramasTV implements  Comparable<ProgramasTV>
{
    private String nombredelprograma;
    private Hora horainicioprog;
    private int duracion;//minutos de duracion


    public ProgramasTV(){

    }
    public ProgramasTV(String nombredelprograma, Hora horainicioprog, int duracion) {
        valida(nombredelprograma,horainicioprog,duracion);
        this.nombredelprograma = nombredelprograma;
        this.horainicioprog = horainicioprog;
        this.duracion = duracion;
    }
    private void valida(String nombredelprograma, Hora hora, int duracion) {
        if(nombredelprograma==null|| hora==null || duracion < 0 )
            throw new GuiaException("el nombre no puede ser nulo o vacio, ni la duracion negativa");
    }

    public String getNombredelprograma() {
        return nombredelprograma;
    }

    public void setNombredelprograma(String nombredelprograma) {
        this.nombredelprograma = nombredelprograma;
    }

    public Hora getHorainicioprog() {
        return horainicioprog;
    }

    public void setHorainicioprog(Hora horainicioprog) {
        this.horainicioprog = horainicioprog;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Hora getHoraFin(){

        Hora horafin = new Hora(horainicioprog.getHora(),horainicioprog.getMinuto());
        horafin.incrementar(duracion);
        return horafin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramasTV that = (ProgramasTV) o;
        return duracion == that.duracion && Objects.equals(nombredelprograma.toUpperCase(), that.nombredelprograma.toUpperCase()) && Objects.equals(horainicioprog, that.horainicioprog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombredelprograma, horainicioprog, duracion);
    }

    //comaprator de cualquier array de programastv

    public int compareTo(ProgramasTV o) {
        //edad de
        //coparacion por nombrereturn
        //si no son el mismo,retorna el comparator
        if (this.horainicioprog.compareTo(o.horainicioprog) != 0) {
            return this.horainicioprog.compareTo(o.horainicioprog);
            //si tienen lo mismo compara por edad
        }
        if ((this.horainicioprog.compareTo(o.horainicioprog) == 0)) {
            return (this.duracion - o.getDuracion());
        } else {
            return this.nombredelprograma.toUpperCase().compareTo(o.getNombredelprograma().toUpperCase());
        }
        //sit eienen el mismo nombre ordenalos por dead
    }
    //comparator

    // hora de Inicio en orden creciente. Si la
    //hora de inicio coincide se ordenan en base a la duración (en orden creciente). Si la duración
    //también coincide se ordenan en orden alfabético
   /* public static Comparator<ProgramasTV> comparacion_horainicio_duracion_ordenalfabetico = new Comparator<ProgramasTV>() {
        @Override
        public int compare(ProgramasTV o1, ProgramasTV o2) {
            if(o1.getHorainicioprog().compareTo(o2.getHorainicioprog())!=0){
                return (int)(o1.getHorainicioprog().compareTo(o2.horainicioprog));
            } else if(o1.getHorainicioprog().compareTo(o2.getHorainicioprog())==0){
                return -(o1.duracion-o2.duracion);
            }
            if(o1.getHorainicioprog().compareTo(o2.getHorainicioprog())==0&&(o1.duracion-o2.duracion==0)){
                return (int)(o1.getNombredelprograma().compareTo(o2.getNombredelprograma()));
            }
            else{
                return (((int)(o1.getNombredelprograma().toUpperCase().compareTo(o2.getNombredelprograma().toUpperCase()))));
            }
        }
    };*/

    public static Comparator<ProgramasTV> comparacion_alfabetico_duracion_horainicio = new Comparator<ProgramasTV>() {
        @Override
        public int compare(ProgramasTV o1, ProgramasTV o2) {
            if((o1.getNombredelprograma().compareTo(o2.getNombredelprograma()))!=0){
                return (o1.getNombredelprograma().toUpperCase().compareTo(o2.getNombredelprograma().toUpperCase()));
            } else if(o1.getNombredelprograma().compareTo(o2.getNombredelprograma())==0){
                return -(o1.duracion-o2.duracion);
            }
           /* if(o1.getHorainicioprog().compareTo(o2.getHorainicioprog())==0&&(o1.duracion-o2.duracion==0)){
                return (int)(o1.getNombredelprograma().compareTo(o2.getNombredelprograma()));
            }*/
            else{
                return (o1.getHorainicioprog().compareTo(o2.getHorainicioprog()));
            }
        }
    };


    @Override
    public String toString() {
        return nombredelprograma.toUpperCase() + "@" + "[" + horainicioprog.getHora() + ":" + horainicioprog.getMinuto() + "-" + "]" + duracion;
    }
    //comparator
}
