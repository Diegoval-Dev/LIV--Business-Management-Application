/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import UI.FacturasMenu;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import model.Factura;
import model.FacturasDAO;
import javax.swing.JTable;

/**
 *
 * @author Jose Gramajo
 * @author Diego Valenzuela
 */
public class ControllerFactura {
    
    public static FacturasDAO fc = new FacturasDAO();
    /**
     * Metodo para llenar la tabla con los datos obtenidos del DAO
     * @param tabla tabla a llenar
     */
    public static void llenarTabla(JTable tabla){
        
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Factura> arr = new ArrayList();
        
        try {
            arr = fc.listaFactura();
            myModel = tabla(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        tabla.setModel(myModel);
    }
     /**
      * Funcion para llenar la tabla con un arraylist 
      * @param arr arraylist de las facturas a llenar en la tabla
      * @return modelo de la tabla
      */
    public static DefaultTableModel tabla(ArrayList<Factura> arr){
        DefaultTableModel myModel = new DefaultTableModel();
        myModel.addColumn("NO.");
        myModel.addColumn("NIT");
        myModel.addColumn("Producto");
        myModel.addColumn("Fecha");
        myModel.addColumn("Total");
        Object[] columna = new Object[5];
        for(Factura fact : arr ){
            columna[0] = fact.getID();
            columna[1] = fact.getNIT();
            columna[2] = fact.getProductos();
            columna[3] = fact.getFecha();
            columna[4] = fact.getTotal();
            myModel.addRow(columna);
        }
        
        
        return myModel;
    }
    /**
     * Metodo para limpiar los campos de textos
     */
    public static void limpiar(){
        FacturasMenu.txtNIT.setText("");
        FacturasMenu.txtProducto.setText("");
        FacturasMenu.txtTotal.setText("");
        FacturasMenu.txtNIT.requestFocus();
    }
    /**
     * Metodo para guardar datos
     * @param nit nit de la factura
     * @param producto producto de la factura
     * @param total total de la factura
     */
    public static void guardar(String nit, String producto, int total){
        Factura factura = new Factura(0,producto,nit,total,"");
        fc.guardar(factura);
        llenarTabla(FacturasMenu.tableFactura);
    }
    /**
     * Metodo para consultar un dato
     * @param tabla tabla de facturas
     */
    public static void consultar(JTable tabla){
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Factura> arr = new ArrayList();
        
        try {
            String nit = FacturasMenu.txtNIT.getText();
            arr = fc.consultar(nit);
            myModel = tabla(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        tabla.setModel(myModel);
    }
    /**
     * Metodo para actualizar datos
     * @param nit nit de la factura
     * @param producto prodcuto de la factura
     * @param total todal de la factura
     */
    public static  void actualizar(String nit, String producto, int total){
        Factura factura = new Factura(0,producto,nit,total,"");
        fc.actualizar(factura);
        llenarTabla(FacturasMenu.tableFactura);
    }
    /**
     * Metodo para eliminar un dato en la base de datos
     * @param nit nit del dato a eliminar
     */
    public static void eliminar(String nit){
        fc.eliminar(nit);
        llenarTabla(FacturasMenu.tableFactura);
    }
}
