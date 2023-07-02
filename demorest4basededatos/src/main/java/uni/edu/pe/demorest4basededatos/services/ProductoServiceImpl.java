package uni.edu.pe.demorest4basededatos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.demorest4basededatos.dao.ProductoDao;
import uni.edu.pe.demorest4basededatos.dto.Producto;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> consultarRegistro() {
        return productoDao.consultarRegistro();
    }
}
