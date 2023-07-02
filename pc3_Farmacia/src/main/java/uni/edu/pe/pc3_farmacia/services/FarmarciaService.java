package uni.edu.pe.pc3_farmacia.services;

import uni.edu.pe.pc3_farmacia.dto.Cliente;
import uni.edu.pe.pc3_farmacia.dto.Detalle_pedido;
import uni.edu.pe.pc3_farmacia.dto.Producto;

import java.util.List;

public interface FarmarciaService {

    List<Producto> consultarRegistrosProductos();
    Cliente registrarCliente(Cliente cliente);
    Detalle_pedido actualizarDetalle_pedido(Detalle_pedido detalle_pedido);
}
