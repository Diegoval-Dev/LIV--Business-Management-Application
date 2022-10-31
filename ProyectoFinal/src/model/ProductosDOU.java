package model;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductosDOU extends Conexion {
    
    private String intruccionSQL;
    private PreparedStatement ms;
    
    /**
     * @autor josue :)
     * El metodo retornara un arrayList de clase Producto
     */
    
    public static ArrayList listaProductos(){
       
        ArrayList<Producto> listaProductos = null;
        
        ResultSet resultado;
        
        try{
            System.out.println("Dsds");
            //this.conectar();
            //instruccion.conectar
            
            
                  
        }
        catch(Exception a){
            
            System.out.println(a.getMessage());
          
              
        }
        
        
 
        
        
        return listaProductos;
    }
    
    
}
