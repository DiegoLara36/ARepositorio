package uni.edu.pe.dao;

import java.sql.*;

public class ProductoDaoImpl implements  ProductoDAO{

        //inceccesario
    public  Connection obtenerConexion() throws SQLException, ClassNotFoundException {
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
    public   void ConsultarRegistros(){
        //establecer conexion
        //con trycatch
        //consultar, insertar, ¿modificar?, borrar??, borrartodo??,


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        PreparedStatement pst = null; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
        CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.
        //Custom ???
        //corrio , funziono

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/lab07";
            //proteocolo:subprotocolo(postgress,mariadb):localhost:numero/nombretabla";
            String dbusername = "root";
            String dbPwd = "12345678";
            //para establecer la conexion....:
            conn=DriverManager.getConnection(url,dbusername,dbPwd);


            // String SQL = "Select codigo, nombre ,descripcion, precioUnitario from producto order by nombre desc";
            String SQL = "Select * from producto order by nombre";//funciona
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            //mostrar datos
            while(rs.next()){
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("nombre"));
                System.out.print(" " + rs.getString("descripcion"));
                System.out.print(" " + rs.getFloat("precioUnitario"));
                System.out.println();
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
    }




    public  void InsertarRegistros(String codigo, String nombre, String descripcion, float precioUnitario){
        //codigom nombre descripcion preciounitariao

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        PreparedStatement pst = null; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
        CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.
        //Custom ???
        //corrio , funziono

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/lab07";
            //proteocolo:subprotocolo(postgress,mariadb):localhost:numero/nombretabla";
            String dbusername = "root";
            String dbPwd = "12345678";
            //para establecer la conexion....:
            conn=DriverManager.getConnection(url,dbusername,dbPwd);
            String SQL = "insert into producto (codigo,nombre,descripcion,precioUnitario)"+" values (?,?,?,?) ";
            pst=conn.prepareStatement(SQL);
            pst.setString(1,codigo);
            pst.setString(2,nombre);
            pst.setString(3,descripcion);
            pst.setFloat(4,precioUnitario);
            pst.execute();

        }catch (Exception cnfe){
            cnfe.printStackTrace();
            System.out.println("error en la conexion");
        }finally{
            if(pst!=null){
                try{
                    pst.close();
                }catch (SQLException sqle){}
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch (SQLException sqle){}
            }

        }
    }



}
