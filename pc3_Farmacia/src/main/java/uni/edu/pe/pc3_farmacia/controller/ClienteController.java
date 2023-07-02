package uni.edu.pe.pc3_farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.pc3_farmacia.dto.Cliente;
import uni.edu.pe.pc3_farmacia.dto.Producto;
import uni.edu.pe.pc3_farmacia.services.FarmarciaService;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private FarmarciaService service;
    @RequestMapping(value="/registrarCliente",method = RequestMethod.POST)
    public Cliente registrarCliente(@RequestBody Cliente cliente){
        return service.registrarCliente(cliente);
    }
    //registrar cliente
   /* @RequestMapping(value="/consultarRegistrosCliente",method = RequestMethod.POST)
    public List<Producto> consultarRegistrosCliente(){
        return service.consultarRegistrosCliente();
    }*/
}
