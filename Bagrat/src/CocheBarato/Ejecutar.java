package CocheBarato;
public class Ejecutar {

    public  static  int menorkm(Coche coche[]){

        //porq tengo que meterle statci q necesidad existe
        int menor = coche[0].getKilometraje() ;
        int aux=0;
        //iteracion para consegir el menor km
        //luego consigo el numero del arreglo en el cual esta el menor
        //retorno este valor
        //   imrpimo abajo , fin
        for(int i=0;i<coche.length;i++){
            if(coche[i].getKilometraje()<menor){
                menor = coche[i].getKilometraje();
                aux=i;
            }

        }

        return aux;
    }

    public static void main (String [] args) {


        Coche coche[]= new Coche[5];
        //para 5 coches

        coche[0]= new Coche("1212",1521,"wolkswagem","blanco");
        coche[1]= new Coche("4535",7521,"dodge","verde");
        coche[2]= new Coche("7678",4554,"chevrolet","amarillo");
        coche[3]= new Coche("9898",1444,"audi","plomo");
        coche[4]= new Coche("3333",6777,"subaru","azul");
        int aux;
        aux = menorkm(coche);
        System.out.println("el coche de menor quilometraje y sus cualidades son: " );
        System.out.println(coche[aux].getColor()+", "+coche[aux].getMarca()+", "+coche[aux].getPlaca()+" y "+coche[aux].getKilometraje());
    }
    //funciono xD
}

