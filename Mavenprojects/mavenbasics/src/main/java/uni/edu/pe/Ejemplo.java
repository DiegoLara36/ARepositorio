package uni.edu.pe;

import java.sql.*;

public class Ejemplo {

    public static void main(String[] args)  {
        consultarRegistros();
       //insertarRegistros("OC06","pas6", 27);
        //consultarRegistros();
        //insertarRegistros("OC05","pas5", 18);
        //insertarRegistros("OC07","pas7", 22);

    }

    /**
     * Metodo para consultar los registros
     */
    public static void consultarRegistros()  {
        //conection interface , lanza sql exception
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = obtenerConexion();
            String SQL = "Select codigo, clave, edad from alumno";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("clave"));
                System.out.print(" " + rs.getInt("edad"));
                System.out.println();
            }
        }catch(Exception cnfe){
            cnfe.printStackTrace();
            System.out.println("Error en la conexion");
        }finally{
            if(rs != null){
                try {
                    rs.close();
                }
                catch (SQLException sqle) {}
            }
            if(stmt != null){
                try {
                    stmt.close();
                }
                catch (SQLException sqle) {}
            }
            if(conn != null){
                try {
                    conn.close();
                }
                catch (SQLException sqle) {}
            }
        }
    }

    /**
     * Metodo para insertar registros
     */
    public static void insertarRegistros(String codigoAlumno, String claveAlumno, int edadAlumno){
        Connection conn = null;
        PreparedStatement pst = null;
        try{
            conn = obtenerConexion();

            String SQL = "insert into alumno(codigo, clave, edad)" +
                    " values(?, ?, ?)";
            pst = conn.prepareStatement(SQL);
            pst.setString(1, codigoAlumno);
            pst.setString(2, claveAlumno);
            pst.setInt(3, edadAlumno);
            pst.execute();
        }catch(Exception cnfe){
            cnfe.printStackTrace();
        }finally{
            if(pst != null){
                try {
                    pst.close();
                }
                catch (SQLException sqle) {}
            }
            if(conn != null){
                try {
                    conn.close();
                }
                catch (SQLException sqle) {}
            }
        }
    }

    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
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