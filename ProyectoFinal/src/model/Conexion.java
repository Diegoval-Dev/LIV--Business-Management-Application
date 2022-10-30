/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Conexion {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost/liv";
    String user = "root";
    String cn = "";
    Connection conectar = null;
    public Connection conectar(){
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {     
           
           conectar = (Connection)DriverManager.getConnection(url, user, cn);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        return conectar;
    }
    public void cerrarConex(){
      try {
          if (conectar != null) {
              if (conectar.isClosed() == false) {
                  conectar.close();
              }
          }
      } catch (Exception e) {
          System.out.println(e);
      }
    
    }
}
