/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Factura;
import model.ProductosDAO;

/**
 *
 * @author Jose Gramajo
 */
public class ControllerEmpleado {
    
    ProductosDAO fc = new ProductosDAO();
    /**
     * Metodo para llenar tabla al inicio del programa;
     * @param tabla 
     */
    public static void llenarTabla(JTable tabla){
    
    }
    public static DefaultTableModel tabla(ArrayList<Factura> arr){
        DefaultTableModel myModel = new DefaultTableModel();
        
        
        return myModel;
    }
    /**
     * Metodo para limpiar los campos de texto
     */
    public static void limpiar(){
        
    }
    /**
     * Metodo para guardar empleados
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param telefono telefono del empleado
     * @param puesto puesto del empleado
     */
    public static void guardar(String nombre, int edad, String telefono, String puesto){
        
    }
    /**
     * Metodo para consultar un dato
     * @param tabla tabla de empleados
     */
    public static void consultar(JTable tabla){
        
    }
    /**
     * Metodo para actualizar un producto
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param telefono telefono del empleado
     * @param puesto puesto del empleado
     */
    public static void actualizar(String nombre, int edad, String telefono, String puesto){
        
    }
    /**
     * Metodo para eliminar un dato
     * @param nombre nombre del empleado a eliminar
     */
    public static void eliminar(String nombre){
        
    }

}
