package uni.edu.pe.pc3_farmacia.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.pc3_farmacia.dto.Cliente;
import uni.edu.pe.pc3_farmacia.dto.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteDaoImpl implements  ClienteDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Connection conn;

    private void obtenerConexion(){
        try {
            conn = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cerrarConexion() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Cliente registrarCliente(Cliente cliente ) {

        //CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.


        try{
            obtenerConexion();

            //para establecer la conexion....:
                                        /*  private String dni;
                                            private String nombres;
                                            private String apellidos;
                                            private String telefono;
    */
            String SQL = "INSERT INTO cliente(dni,nombres,apellidos,telefono) VALUES (?,?,?,?);";

            // String SQL = "Select * from producto order by nombre";//funciona
           // pst=conn.prepareStatement(SQL);
           // rs = stmt.executeQuery(SQL);
            //mostrar datos
             ; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
            PreparedStatement pst=conn.prepareStatement(SQL);

            pst.setString(1,cliente.getDni());
            pst.setString(2,cliente.getNombres());
            pst.setString(3,cliente.getApellidos());
            pst.setString(4,cliente.getTelefono());
            pst.executeUpdate();
            pst.close();
            cerrarConexion();
        }catch (SQLException e){
            e.printStackTrace();
            //System.out.println("error en la conexion");
        }
        return  cliente;
    }


}
