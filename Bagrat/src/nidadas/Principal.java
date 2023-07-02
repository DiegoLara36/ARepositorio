package nidadas;

public class Principal {
    //clases anidadas no viene en el examen( no lo va a tomar)
    class Secundaria{
        int edad=18;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

      /*  public  static void main(String[] args) {
            Principal p = new Principal();
            Principal.Secundaria s = p.new Secundaria();

            Secundaria s2= new Principal().new Secundaria();
            System.out.println(s.getEdad());
            System.out.println(s2.getEdad());

        }*/
    }
}
