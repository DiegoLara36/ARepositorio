package uni.edu.pe.pc3_farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.pc3_farmacia.dto.Detalle_pedido;
import uni.edu.pe.pc3_farmacia.services.FarmaciaServiceImpl;
import uni.edu.pe.pc3_farmacia.services.FarmarciaService;

@RestController

public class Detalle_pedidoController {
    @Autowired
    private FarmarciaService service;
    @RequestMapping(value = "actualizarDetalle_pedido", method = RequestMethod.POST)
    public Detalle_pedido actualizarDetalle_pedido(@RequestBody Detalle_pedido detalle_pedido){
        return service.actualizarDetalle_pedido(detalle_pedido);
    }

}
