/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardotoledo
 */
public class Coneccion {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Coneccion() {

        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/javaee";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            System.out.println("Error de conexion!!" + ex.getMessage());
        }
    }
    //select * from ciudad
    public void setConsulta(String sql) {
        try {
            stmt = con.createStatement();
            stmt.executeQuery(sql);
            rs = stmt.getResultSet();
        } catch (SQLException ex) {
     
        }
    }
    //devolver el listado de ciudades
    public ResultSet getResultado(){
        return rs;
    }
    
    public void setInsertar(String sql){
        try {
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
        }
      
    }

}
