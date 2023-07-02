package Interfaces.DemoInterfase;

public interface Consumible {

   void CalcularCombustible();

   default void recargarCombustible(){
        System.out.println("<==== Consumible: recargarCombustible ====>");
    }
    //defailt me permite implementar dentro de una interface, no es obligtoria

}
