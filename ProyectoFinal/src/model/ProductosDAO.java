package model;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author Roberto
 */
public class ProductosDAO extends Conexion {
    
    private String intruccionSQL;
    private PreparedStatement ms;
    
    /**
     * @autor josue :)
     * Funcion para jala todos los datos de la tabla Inventario
     * @return Arraylist con los objetos Producto
     */
    
    public ArrayList listaProductos(){
       
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
    /**
     * Metodo para realizar una consulta a la base de datos
     * @param id id del objeto a realizar una consulta
     * @return Arraylist con el objeto que devolvio la consulta
     */
     public ArrayList<Producto> consultar(int id){
         
         
         return null;
     }
     /**
      * Guarda objetos Producto en la base de datos
      * @param producto Producto a guardar en la base de datos
      */
     public void guardar(Producto producto){
     
     
     }
     /**
      * Metodo para actualizar un producto
      * @param producto Producto actualizado
      */
     public void actualizar(Producto producto){
     
     }
     /**
      * Metodo para eliminar un producto
      * @param id id del producto a eliminar
      */
     public void eliminar(int id){
     
     }
}
