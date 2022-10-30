/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author diego
 */
public class Conexion {
    String url = "jdbc:mysql://localhost/prueba1";
    String user = "root";
    String cn = "";
    Connection conectar = null;
    public Connection conectar(){
        try {     
           conectar = (Connection)DriverManager.getConnection(url, user, cn);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        return conectar;
    }
}
