/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *@author Jorge Gramajo
 *@author diego
 */
public class EmpleadoDAO extends Conexion{
    private String intruccionSQL;
    private PreparedStatement ms;
    
    /**
     * Funcion para jala todos los datos de la tabla Empleados
     * @return Arraylist con los objetos Producto
     */
    
    public ArrayList listaProductos(){
        ArrayList<Empleado> listaProductos = null;
        ResultSet resultado;
        
        try{
            
            
            
                  
        }
        catch(Exception a){
            System.out.println(a.getMessage());
    
        }
        finally{
         this.cerrarConex();
        }

        
        return listaProductos;
    }
    /**
     * Metodo para realizar una consulta a la base de datos
     * @param id id del objeto a realizar una consulta
     * @return Arraylist con el objeto que devolvio la consulta
     */
     public ArrayList<Empleado> consultar(int id){
         
         
         return null;
     }
     /**
      * Guarda objetos Producto en la base de datos
      * @param empleado empleado a guardar en la base de datos
      */
     public void guardar(Empleado empleado){
     
     
     }
     /**
      * Metodo para actualizar un producto
      * @param empleado empleado actualizado
      */
     public void actualizar(Empleado empleado){
     
     }
     /**
      * Metodo para eliminar un empleado
      * @param id id del empleado a eliminar
      */
     public void eliminar(int id){
     
     }
    
}
