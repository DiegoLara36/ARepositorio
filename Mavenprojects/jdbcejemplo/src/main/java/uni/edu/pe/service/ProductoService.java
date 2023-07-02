package uni.edu.pe.service;

public interface ProductoService {

    void InsertarRegistros(String codigo, String nombre, String descripcion, float precioUnitario);
    void ConsultarRegistros();
}
