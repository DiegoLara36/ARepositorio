package uni.edu.pe.pc3_farmacia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.pc3_farmacia.dao.ClienteDao;
import uni.edu.pe.pc3_farmacia.dao.Detalle_pedidoDao;
import uni.edu.pe.pc3_farmacia.dao.ProductoDao;
import uni.edu.pe.pc3_farmacia.dto.Cliente;
import uni.edu.pe.pc3_farmacia.dto.Detalle_pedido;
import uni.edu.pe.pc3_farmacia.dto.Producto;

import java.util.List;

@Service
public class FarmaciaServiceImpl implements FarmarciaService{

    @Autowired
    private ProductoDao productoDao;
    @Autowired
    private ClienteDao clienteDao;

    @Autowired
    private Detalle_pedidoDao detalle_pedidoDao;

    @Override
    public List<Producto> consultarRegistrosProductos() {
        return productoDao.consultarRegistrosProductos();
    }
    @Override
    public Cliente registrarCliente(Cliente cliente){
        return clienteDao.registrarCliente(cliente);
    }

    @Override
    public Detalle_pedido actualizarDetalle_pedido(Detalle_pedido detalle_pedido) {
        return detalle_pedidoDao.actualizarDetalle_pedido(detalle_pedido);
    }


}
