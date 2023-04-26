package Dirigida1;

public class Ejecutar {
    public static void main(String[] args) {
        Producto p1 = new Producto();

        p1.setNombre("Morochas");
        p1.setCodigo("Mor001");
        p1.setMonto(0.8d);
        p1.setCantidad(1);

        Producto p2 = new Producto("Casino","cas001",0.9d,2);
        Producto p3 = new Producto("Margarita","mar001",0.6d,1);
        Producto p4 = new Producto("Sodafield","sod001",0.5d,4);
        Producto p5 = new Producto("Glacitas","glad001",0.9d,2);

        Producto[] producto3 = {p2,p4,p5};
        Venta v2 = new Venta("v002",producto3);
        Venta v3 = new Venta("0003",producto3);
        Venta [] ventas = {v2,v3};

        for(Venta  v: ventas){
            System.out.println(v.getCodigo());
            for(Producto p: v.getProductos())
                System.out.println(p);
        }

        Double montototal = 0.0d;
        //overridde
        // string formulas
        // sobreescrivir redifinir el nombre del padre
        // override
        // public strin toString()

    }
}
