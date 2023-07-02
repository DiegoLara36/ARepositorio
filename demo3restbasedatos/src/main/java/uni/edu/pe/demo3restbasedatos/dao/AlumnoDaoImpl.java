package uni.edu.pe.demo3restbasedatos.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.demo3restbasedatos.dto.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoDaoImpl implements AlumnoDao{
    @Override
    public List<Alumno> consultarRegistros() {
        List<Alumno> lista = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        PreparedStatement pst = null; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
        CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.
        //Custom ???
        //corrio , funziono

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/jdbc2023i";
            //proteocolo:subprotocolo(postgress,mariadb):localhost:numero/nombretabla";
            String dbusername = "root";
            String dbPwd = "12345678";
            //para establecer la conexion....:
            conn=DriverManager.getConnection(url,dbusername,dbPwd);

            String SQL = "Select codigo, clave, edad from alumno";
           // String SQL = "Select * from producto order by nombre";//funciona
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            //mostrar datos
            while(rs.next()) {/*
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("nombre"));
                System.out.print(" " + rs.getInt("edad"));
                System.out.println();*/
                Alumno a1 = new Alumno(rs.getString("codigo"), rs.getString("clave"), rs.getInt("edad"));
                lista.add(a1);
            }
        }catch (Exception cnfe){
            cnfe.printStackTrace();
            System.out.println("error en la conexion");
        }finally{
            if(rs!=null){
                try{
                    rs.close();
                }catch (SQLException sqle){}
            }
            if(stmt!= null){
                try{
                    stmt.close();
                }catch (SQLException sqle){}
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch (SQLException sqle){}
            }

        }
        return lista;
    }
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        //establece la conexion

        //ya no es necesario (antes...: se puede obviar, igual corre);
        Class.forName("org.mariadb.jdbc.Driver");
        //direccion de la base de datos
        //3306,(nombre de la tabla: jdbc2023i)
        String url = "jdbc:mariadb://localhost:3306/jdbc2023i";
        //url:protocolo de inicio de transmision de datos de ordenadores
        //nombre de ususario, clave
        String dbUsername = "root";
        String dbPwd = "12345678";
        return DriverManager.getConnection(url, dbUsername, dbPwd);
        //sigue pedir sql

    }
}
