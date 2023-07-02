package uni.edu.pe.controller;

import uni.edu.pe.service.ProductoService;
import uni.edu.pe.service.ProductoServiceImpl;

public class ProductoControlador {

    public static void main(String[] args) {
        ProductoService service = new ProductoServiceImpl();
        service.ConsultarRegistros();
        service.InsertarRegistros("FUEN008", "fuente", "fuente modular", 145.f); //funciona
   }

}
