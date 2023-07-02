package TestConstructorCallOrder;
class SuperParent{
    public SuperParent(){
        System.out.println("Superparent....");
    }

}
 class Parent extends SuperParent{

    public Parent(){
        System.out.println("Parent()...");
    }
    public Parent(String mensaje){
        System.out.println(mensaje);
    }
}
class Child extends Parent{
    public Child(){

        super("bienvenua");
        System.out.println("Child...");
    }

    public static void main(String[] args) {
    // new ejecuta el cosntructor y si el invocado hereda de alguien
        // el constructor que hereda tambien
        //pero antes del constructor del hijo
        //1ro constructor padre
        //2do cosntructor hijo

        //si el constructor padre lo sobreescribo
        //lo nombrara si lo invoco con super en ves del anterior
        new Child();


    }
}
