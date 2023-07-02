package Ejercicios.Parcial20202.Hospital;

public class Paciente {
    private String nombre;
    private String apellido;
    private String NUSS;//2 primeros numeros de 10
    private int anio;

    //anio de nacimiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNUSS() {
        return NUSS;
    }

    public void setNUSS(String NUSS) {
        this.NUSS = NUSS;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    int aux=0;
    //48-57;
    boolean flag = true;
    public void extrayendo(){
        //pasando a char
        for(int i=0;i<9;i++){
            //(int)(NUSS.charAt(i))-48;
            aux=aux*10+((int)(NUSS.charAt(i))-48);
        if(i==3){
            int cont1 = aux;
        }
        if(i==6){
            int cont2 = aux%((int)Math.pow(10,6));
        }
            //aux%
        }

    }
}
