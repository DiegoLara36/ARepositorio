package uni.edu.pe.demorest4basededatos.dao;

import uni.edu.pe.demorest4basededatos.dto.Producto;

import java.util.List;

public interface ProductoDao {

    List<Producto> consultarRegistro();
}
