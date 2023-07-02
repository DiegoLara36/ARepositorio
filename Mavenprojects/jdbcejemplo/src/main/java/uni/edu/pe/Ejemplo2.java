package uni.edu.pe;


import java.sql.*;

public class Ejemplo2 {

    //mi ejemplo
    public static void main(String[] args) throws  SQLException, ClassNotFoundException{
        ConsultarRegistros();
       // Callableejemplo();        consulta registrada en la base de ddatos
       // StatementEjemplo();       consultas individuales
        //InsertarDatos();//funciona
        System.out.println("........................");
        InsertarRegistros("FUEN008","fuente","fuente modular",145.f); //funciona
       // ModificarDatos(); ///       REVISAR
        ConsultarRegistros();
        //DELETE                    FALTA
    }

    public static  void ConsultarRegistros(){
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

    public static void  Callableejemplo(){
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
            //.........................ESTABLECER LA CONEXION........................
            //   LLAMANDO CALL GetNombres
                cst = conn.prepareCall("{call GetNombres()}");
                //funciono
                Boolean hasResult = cst.execute();
                if(hasResult){
                    ResultSet res = cst.getResultSet();

                    while(res.next()){
                        System.out.println(res.getString("nombre"));
                    }
                }

            System.out.println("\n");
            //   LLAMANDO al otro
             cst= conn.prepareCall("{call GetDatospornombre('teclado')}");
                Boolean hasResult2 = cst.execute();
                //System.out.println("xd"+ cst.execute()); true
                if(hasResult2){
                ResultSet res = cst.getResultSet();

                while(res.next()){
                    System.out.println(res.getString("codigo")+" "+res.getString("descripcion"));
                }
            }

                cst.close();


            // String SQL = "Select codigo, nombre ,descripcion, precioUnitario from producto order by nombre desc";
            /*String SQL = "Select * from producto order by nombre";//funciona
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            //mostrar datos
            while(rs.next()){
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("nombre"));
                System.out.print(" " + rs.getString("descripcion"));
                System.out.print(" " + rs.getFloat("precioUnitario"));
                System.out.println();
            }*/
        }catch (Exception cnfe){
            cnfe.printStackTrace();
            System.out.println("error en la conexion");
        }finally{
            if(cst!=null){
                try{
                    cst.close();
                }catch (SQLException sqle){}
            }
            /*if(stmt!= null){
                try{
                    stmt.close();
                }catch (SQLException sqle){}
            }*/
            if(conn!=null){
                try{
                    conn.close();
                }catch (SQLException sqle){}
            }

        }


    }

    public static void  StatementEjemplo(){
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
            //.........................ESTABLECER LA CONEXION........................
            //   para consultar se llama  EXECUTEQUERY(), retrieve(recuperar??)
            stmt = conn.createStatement();
            String queryString = "select * from producto where nombre = 'monitor'";
            rs = stmt.executeQuery(queryString);

            //Para insert, update y delete EXECUTEUPDATE()


            stmt.close();


            // String SQL = "Select codigo, nombre ,descripcion, precioUnitario from producto order by nombre desc";
            /*String SQL = "Select * from producto order by nombre";//funciona
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            //mostrar datos
            while(rs.next()){
                System.out.print(rs.getString("codigo"));
                System.out.print(" " + rs.getString("nombre"));
                System.out.print(" " + rs.getString("descripcion"));
                System.out.print(" " + rs.getFloat("precioUnitario"));
                System.out.println();
            }*/
        }catch (Exception cnfe){
            cnfe.printStackTrace();
            System.out.println("error en la conexion");
        }finally{
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (SQLException sqle){}
            }
            /*if(stmt!= null){
                try{
                    stmt.close();
                }catch (SQLException sqle){}
            }*/
            if(conn!=null){
                try{
                    conn.close();
                }catch (SQLException sqle){}
            }

        }


    }


    public static void InsertarDatos(){


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
            pst.setString(1,"PROC002");
            pst.setString(2,"Procesador");
            pst.setString(3,"Intel i9");
            pst.setFloat(4,139.95f);
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
    public static void InsertarRegistros(String codigo, String nombre, String descripcion, float precioUnitario){
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
    public static void ModificarDatos(){


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        PreparedStatement pst = null; //Se utiliza cuando la consulta SQL debe ejecutarse varias veces.
        CallableStatement cst = null; //para ejecutar los procedimientos ya almacenados.
        //Custom ???
        //corrio , funziono

        try{
     //UPDATE producto AS p SET  p.precioUnitario=25.00 WHERE p.nombre = 'teclado';
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/lab07";
            //proteocolo:subprotocolo(postgress,mariadb):localhost:numero/nombretabla";
            String dbusername = "root";
            String dbPwd = "12345678";
            //para establecer la conexion....:
            conn=DriverManager.getConnection(url,dbusername,dbPwd);
            String SQL = "update producto set nombre = ? where codigo = ?";
            //UPDATE producto SET descripcion = 'monitor hd 4k' WHERE codigo = 'MONI001';
            pst=conn.prepareStatement(SQL);

            pst.setString(1,"PROC002");
            pst.setString(2,"Microprocesador");

            pst.executeUpdate();

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
