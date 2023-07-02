package uni.edu.pe.pc3_farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.pc3_farmacia.dto.Producto;
import uni.edu.pe.pc3_farmacia.services.FarmarciaService;

import java.util.List;

@RestController
public class ProductoController {
    //primero el producto
    @Autowired
    private FarmarciaService service;
    @RequestMapping(value="/consultarRegistrosProductos",method = RequestMethod.POST)
    public List<Producto> consultarRegistrosProductos(){
        return service.consultarRegistrosProductos();
    }

}
