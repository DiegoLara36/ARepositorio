package uni.edu.pe.pc3_farmacia.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.pc3_farmacia.dto.Detalle_pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class Detalle_pedidoDaoImpl implements  Detalle_pedidoDao{

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
    public Detalle_pedido actualizarDetalle_pedido(Detalle_pedido detalle_pedido) {

        //CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.


        try{
            obtenerConexion();

            //para establecer la conexion....:
                                        /*  private String dni;
                                            private String nombres;
                                            private String apellidos;
                                            private String telefono;
    */
            String SQL = "UPDATE Detalle_pedido dp SET dp.estado = ? WHERE dp.id_detalle = ?";

            // String SQL = "Select * from producto order by nombre";//funciona
            // pst=conn.prepareStatement(SQL);
            // rs = stmt.executeQuery(SQL);
            //mostrar datos
            ; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
            PreparedStatement pst=conn.prepareStatement(SQL);

            pst.setString(1, "E");
            pst.setString(2,detalle_pedido.getId_detalle());

            pst.executeUpdate();
            pst.close();
            cerrarConexion();
        }catch (SQLException e){
            e.printStackTrace();
            //System.out.println("error en la conexion");
        }
        return  detalle_pedido;
    }
}
