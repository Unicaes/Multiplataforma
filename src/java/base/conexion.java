/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author bryan
 */
public class conexion {
    Connection conexion=null;
    static String url="jdbc:mysql://localhost:3306/bpLaboratorio";
    static String Usuario="root";
    static String contrasena="root";
    public conexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conexion=DriverManager.getConnection(url,Usuario,contrasena);
        }catch(SQLException e){
            
        }   
    }
    public ResultSet consultar(String campos,String tabla) throws SQLException{
           String sql="SELECT "  + campos + " FROM " + tabla;
           Statement cons=this.conexion.createStatement();
           return cons.executeQuery(sql);
    }
    public ResultSet DoQuery(String query) throws SQLException{
        Statement cons=this.conexion.createStatement();
        return cons.executeQuery(query);
    }
    public ResultSet consultar(String campos,String tabla, String condicion) throws SQLException{
           String sql="SELECT "  + campos + " FROM " + tabla + " where "+ condicion ;
           Statement cons=this.conexion.createStatement();
           return cons.executeQuery(sql);
    }
    
    
    public int agregar(String sqlInsert){
        try{
            Statement add=this.conexion.createStatement();
            return add.executeUpdate(sqlInsert);    
        }catch(Exception e){
            return -5;
        }
        
    }
    
     public int eliminar(String tabla, String condicion) throws SQLException{
        
         String sql="delete from " + tabla + " where " + condicion;
         Statement del=this.conexion.createStatement();
        return del.executeUpdate(sql);
    }
}
