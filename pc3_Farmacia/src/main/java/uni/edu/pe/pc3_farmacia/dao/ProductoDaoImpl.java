package uni.edu.pe.pc3_farmacia.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.pc3_farmacia.dto.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDaoImpl implements ProductoDao {



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
    public List<Producto> consultarRegistrosProductos() {
        List<Producto> listap = new ArrayList<>();


        PreparedStatement pst = null; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
        CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.
        ResultSet rs = null;
        //Custom ???
        //corrio , funziono

        try{
           obtenerConexion();
            //para establecer la conexion....:
                                        /* private String id_producto;
                                            private String nombre;
                                            private String descripcion;
                                            private float precio;
                                            private int stock;
                                            private int id_categoria;*/
            String SQL = "Select id_producto, nombre, descripcion,precio,stock,id_categoria from producto;";
            // String SQL = "Select * from producto order by nombre";//funciona
            pst = conn.prepareStatement(SQL);
            rs = pst.executeQuery();
            //mostrar datos
            while(rs.next()) {/*
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("nombre"));
                System.out.print(" " + rs.getInt("edad"));
                System.out.println();*/
                Producto a1 = new Producto(rs.getInt("id_producto"),
                                        rs.getString("nombre"),
                                        rs.getString("descripcion"),
                                        rs.getFloat("precio"),
                                        rs.getInt("stock"),
                                        rs.getInt("id_categoria"));
                listap.add(a1);
            }
            rs.close();
            pst.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return listap;
    }

}

