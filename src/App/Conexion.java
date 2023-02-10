/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.sql.Connection;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author ortiz
 */
public class Conexion {
    private String usuario;
    private String password;
    private String puerto;
    private String nombreBd;
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Conexion(){
        this.usuario ="sa";
        this.password = "1234";
        this.puerto = "1433";
        this.nombreBd = "Conexion";
    }
    
    public void ConexionSQLSERVER(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:"+puerto+";databaseName="+nombreBd+";user="+usuario+"password="+password+";";
        con = DriverManager.getConnection(connectionUrl);
        System.out.println("conexion exitosa");
        
    }catch(Exception e){
        System.out.println("Error" + e.toString());
    
    }
    
    }
    
}
