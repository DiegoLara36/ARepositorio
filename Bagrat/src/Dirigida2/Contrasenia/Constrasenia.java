package Dirigida2.Contrasenia;

public class Constrasenia extends Usuario {
    private int longitud= 8;


    public Constrasenia(String nombre, String apellido, int edad, String DNI, String contrasenia, int longitud) {
        super(nombre, apellido, edad, DNI, contrasenia);
        this.longitud = longitud;
        this.contrasenia = contrasenia;
    }
    public Constrasenia(String nombre, String apellido, int edad, String DNI, String contrasenia) {
        super(nombre, apellido, edad, DNI, contrasenia);
        this.contrasenia = contrasenia;
    }

   /* public Constrasenia(String clave) {
        this.clave = clave;
    }

    public Constrasenia(int longitud, String clave) {
        //si se desea cambiar la ocntraseña
        this.longitud = longitud;
        this.clave = clave;
    }*/
    //clave fuerte 2 mayusculas, 2 minusculas, 6 numero, boolean true
    //generarclave = genera una contraseña del objeto en base a la
    //longitud que guarda en el objeto

    //visualizar : ver toda la informacion de la contraseña??
    //paos a char cada una con un contador y me dicen cuantas masyusculas
    //hay, como tambien numeros

    private int cont=0;
    private int cont2=0;
    private int cont3=0;
    public boolean esClaveFuerte(){

        for(int i=0;i<contrasenia.length();i++){
            if((((int)contrasenia.charAt(i))>=48)&&(((int)contrasenia.charAt(i))<=57)){
                cont++;
            }
        }
        for(int i=0;i<contrasenia.length();i++){

            if((((int)contrasenia.charAt(i))>=97)&&(((int)contrasenia.charAt(i))<=122)){
                cont2++;
            }
        }
        for(int i=0;i<contrasenia.length();i++){

            if(((int)(contrasenia.charAt(i)))>=65&&((int)(contrasenia.charAt(i)))<=90){
                cont3++;
            }
        }

        if((cont>=2)&&(cont2>=2)&&(cont3>=2)){
            return true;
        }else{
            return false;
        }
    }

        public void VisualizarTodo(){
            System.out.println("la contraseña es de: "+contrasenia.length()+ " diguitos");
            System.out.println("la contraseña tiene "+cont+" numeros");
            System.out.println("la contraseña tiene "+cont2+" minusculas");
            System.out.println("la contraseña tiene "+cont3+" mayusculas");

        }

}
