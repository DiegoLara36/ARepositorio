package uni.edu.pe.service;

import uni.edu.pe.dao.ProductoDAO;
import uni.edu.pe.dao.ProductoDaoImpl;

public class ProductoServiceImpl implements  ProductoService {

    ProductoDAO productoDAO = new ProductoDaoImpl();
    @Override
    public void InsertarRegistros(String codigo, String nombre, String descripcion, float precioUnitario) {
        productoDAO.InsertarRegistros(codigo, nombre, descripcion, precioUnitario);
    }

    @Override
    public void ConsultarRegistros() {
        productoDAO.ConsultarRegistros();
    }
}
