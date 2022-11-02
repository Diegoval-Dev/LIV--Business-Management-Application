/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Controller.ControllerEmpleado;
import Controller.ControllerFactura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *@author Jorge Gramajo
 *@author diego
 */
public class EmpleadoDAO extends Conexion{
    private String instruccionSQL;
    private PreparedStatement ms;
    
    /**
     * Funcion para jala todos los datos de la tabla Empleados
     * @return Arraylist con los objetos Producto
     */
    
    public ArrayList listaEmpleados(){
        ArrayList<Empleado> listaEmpleados = null;
        ResultSet resultado;
        
        try{
            this.conectar();
            instruccionSQL = "SELECT * FROM empleados";
            ms = this.conectar.prepareStatement(instruccionSQL);
            resultado = ms.executeQuery();
            listaEmpleados = new ArrayList();
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                String numero = resultado.getString("numero");
                String puesto = resultado.getString("puesto");
                Empleado empleado = new Empleado(id,nombre,edad,numero,puesto);
                listaEmpleados.add(empleado);
         }
            
            
            
                  
        }
        catch(Exception a){
            System.out.println(a.getMessage());
    
        }
        finally{
         this.cerrarConex();
        }

        
        return listaEmpleados;
    }
    
    /**
     * Metodo para realizar una consulta a la base de datos
     * @param nombre id del objeto a realizar una consulta
     * @return Arraylist con el objeto que devolvio la consulta
     */
     public ArrayList<Empleado> consultar(String nombre){
        ArrayList<Empleado> listaEmpleados = null; 
        ResultSet resultado;
        try{
            this.conectar();
            listaEmpleados = new ArrayList();
            instruccionSQL ="SELECT * FROM `empleados` WHERE nombre = ?;";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, nombre);
            resultado = ms.executeQuery();
            if (resultado.next()) {
                int id = resultado.getInt("id");
                int edad = resultado.getInt("edad");
                String numero = resultado.getString("numero");
                String puesto = resultado.getString("puesto");
                Empleado ep = new Empleado(id,nombre,edad,numero,puesto);
                listaEmpleados.add(ep);
                return listaEmpleados;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Empleado no encontrado!!"); 
                ControllerFactura.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
        return listaEmpleados;
     }
     
     /**
      * Guarda objetos Empleado en la base de datos
      * @param empleado empleado a guardar en la base de datos
      */
     public void guardar(Empleado empleado){
         try{
            this.conectar();
            String instruccionSQL = "INSERT INTO `empleados` (nombre,edad,numero,puesto) VALUES(?,?,?,?)";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, empleado.getNombre());
            ms.setInt(2, empleado.getEdad());
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            ms.setString(3, empleado.getNumero());
            ms.setString(4, empleado.getPuesto());
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Empleado registrado");
                ControllerEmpleado.limpiar();
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
         this.cerrarConex();
        }
     }
     
     /**
      * Metodo para actualizar un producto
      * @param empleado empleado actualizado
      */
     public void actualizar(Empleado empleado){
         try {
            this.conectar();
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, empleado.getNombre());
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "EMPLEADO ACTUALIZADO");
                ControllerFactura.limpiar();
              }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
     }
     
     /**
      * Metodo para eliminar un empleado
      * @param id id del empleado a eliminar
      */
     public void eliminar(String nombre){
         try {
            this.conectar();
            String instruccionSQL ="DELETE FROM empleados WHERE nombre=?";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, nombre);
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO"); 
                ControllerFactura.limpiar();
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
     }
    
}
