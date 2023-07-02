package Exproblemas.Auto.autos;

import java.util.Objects;

public class Auto implements Comparable<Auto>{
    private final String modelo;
    private final String nivel;//numero de identificacion del vehiculo
    private final int mes;
    private final int dia ;
    private final int anio;// no se pueden modificar

    public Auto(String modelo, String nivel, int mes, int dia, int anio) {
        ValidaCampos(modelo,nivel, mes,dia, anio);
        this.modelo = modelo;
        this.nivel = nivel;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    public void ValidaCampos(String modelo,String nivel,int mes,int dia, int anio) {
        ValidaFecha(mes, dia, anio);
        ValidaModelo(modelo);
        ValidaNivel(nivel);

    }
    public void ValidaFecha(int mes, int dia, int anio){
        if((mes<=0||mes>12)){
            throw new AutosException("el mes no puede ser negativo");
        }//?-> usar
        if(dia<=0||dia>31){
            throw new AutosException("los dias deben estar entre 1 y 31");
        }
        if(anio<0){
            throw new AutosException("el anio debe ser positivo");
        }
       /* if(mes==2&&dia>28&&anio%4==0){//año no bisiesto
            throw new AutosException("max 29 dias en bisiestos, 2012, 2016, 2020, etc");
        }else if(mes==2&&(dia>29)&anio%4==0){
            throw new AutosException("febrero solo tiene 28 dias");
        }
        if(mes%2==0&&mes!=2&&mes<=6&&dia>30){
            throw new AutosException("mes par menos de 6, menos de 30 dias");
        }
        if(((mes%2!=0)&&(mes<=7))&&dia>31){
            throw new AutosException("los meses son de menos de 31 dias");
        }
        if((mes==9||mes==11)&&dia>30){
            throw new AutosException("los meses tienen menos de 30 dias");
        }
        if(dia<=0||dia>31){
            throw new AutosException("el dia debe estar entre 1 y 31");
        }
        if(anio<0){
            throw new AutosException("el auto no puede ser negativo");
        }*/
    }
    public void ValidaModelo(String modelo){
        //no ses nulo no vacio
        if(modelo==null||"".equalsIgnoreCase(modelo)){
            throw new AutosException("el modelo no puede ser nulo");
        }
    }
    public void ValidaNivel(String nivel){
        //ni o, i , q ,, tampoco 0,1,9 cantidad de diguitos 17 caraterres
        //if(nivel)
        if(nivel.length()!=17||nivel.contains("[oOiIqQ]")){
            throw new AutosException("la longitud debe ser de 17 caracteres, sin los diguitos mencionados") ;
        }/*else if(nivel.contains("[oOiIqQ]"));{
            throw new AutosException("el nivel no es correcto");
        }*/
        //aceptado
    }

    public String getModelo() {
        return modelo;
    }

    public String getNivel() {
        return nivel;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAnio() {
        return anio;
    }
    //valida String void
    //validafecha int int int void
    //valida modelo Strin void

    //compare y comparator
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return mes == auto.mes && dia == auto.dia && anio == auto.anio && Objects.equals(nivel.toUpperCase(), auto.nivel.toUpperCase());
    }
    //auto mayor , si fecha es anterior o si fecha caso iguales nombre mas grande
    @Override
    public int hashCode() {
        return Objects.hash(modelo, nivel, mes, dia, anio);
    }
    //comparable
    @Override
    public int compareTo(Auto o) {
        //int fechaap = (o.anio)*365+o.mes*30+o.dia; //en dias
        if((((this.anio)*365+this.mes*30+this.dia)-((o.getAnio())*365+o.getMes()*30+o.getDia()))!=0){
            return (((this.anio)*365+this.mes*30+this.dia)-((o.getAnio())*365+o.getMes()*30+o.getDia()));
        }
        //de mayor a menor
        else {
            return this.nivel.compareTo(o.nivel);
        }
        //si no es por antiguedad, es por orden de nivel(strin17)

    }

    @Override
    public String toString() {
        return "["+this.nivel+","+this.dia+"/"+this.mes+"/"+this.anio+"]";
    }
    //return (this.age-o.getAge())
}
