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
public class ControllerInventario {
    
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
     * Metodo para guardar
     * @param precio precio del producto
     * @param marca marca del producto
     * @param cantidad cantidad del producto
     * @param fabricacion fabricacion del producto
     * @param lote lote del producto
     */
    public static void guardar(int precio,String marca,int cantidad, String fabricacion,String lote){
        
    }
    /**
     * Metodo para consultar un dato
     * @param tabla tabla de productos
     */
    public static void consultar(JTable tabla){
        
    }
    /**
     * Metodo para actualizar un producto
     * @param precio nuevo precio
     * @param marca nueva marca
     * @param cantidad nueva cantidad
     * @param fabricacion nueva fabriacion
     * @param lote nuevo lote
     */
    public static void actualizar(int precio,String marca,int cantidad, String fabricacion,String lote){
        
    }
    /**
     * Metodo para eliminar un dato
     * @param id id del dato a eliminar
     */
    public static void eliminar(int id){
        
    }

    
}
