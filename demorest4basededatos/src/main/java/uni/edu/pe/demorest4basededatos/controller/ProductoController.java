package uni.edu.pe.demorest4basededatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.demorest4basededatos.dto.Producto;
import uni.edu.pe.demorest4basededatos.services.ProductoService;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService service;
    @RequestMapping(value="/consultarRegistros2",method = RequestMethod.GET)
    public List<Producto> consultarRegistro(){
        return service.consultarRegistro();
    }
}
