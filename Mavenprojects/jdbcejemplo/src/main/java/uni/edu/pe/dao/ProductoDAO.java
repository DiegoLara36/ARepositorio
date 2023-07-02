package uni.edu.pe.dao;

public interface ProductoDAO {

    void InsertarRegistros(String codigo, String nombre, String descripcion, float precioUnitario);
    void ConsultarRegistros();
    //insertar registro
    //consultar registro
}
