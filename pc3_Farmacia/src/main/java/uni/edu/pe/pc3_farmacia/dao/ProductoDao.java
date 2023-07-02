package uni.edu.pe.pc3_farmacia.dao;

import uni.edu.pe.pc3_farmacia.dto.Producto;

import java.util.List;

public interface ProductoDao {

    List<Producto> consultarRegistrosProductos();
}
