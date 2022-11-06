/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import UI.InventarioMenu;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Producto;
import model.ProductosDAO;

/**
 *
 * @author Jose Gramajo
 */
public class ControllerInventario {
    
    public static ProductosDAO fc = new ProductosDAO();
    /**
     * Metodo para llenar tabla al inicio del programa;
     * @param tabla 
     */
    public static void llenarTabla(JTable tabla){
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Producto> arr = new ArrayList();
        
        try {
            arr = fc.listaProductos();
            myModel = tabla(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        tabla.setModel(myModel);
    }
    public static DefaultTableModel tabla(ArrayList<Producto> arr){
        DefaultTableModel myModel = new DefaultTableModel();
        myModel.addColumn("NO.");
        myModel.addColumn("Nombre");
        myModel.addColumn("Precio");
        myModel.addColumn("Cantidad");
        myModel.addColumn("Marca");
        myModel.addColumn("Fabricacion");
        myModel.addColumn("lote");
        myModel.addColumn("Descripcion");
        Object[] columna = new Object[8];
        for(Producto fact : arr ){
            columna[0] = fact.getID();
            columna[1] = fact.getNombre();
            columna[2] = fact.getPrecio();
            columna[3] = fact.getCantidad();
            columna[4] = fact.getMarca();
            columna[5] = fact.getFrabricacion();
            columna[6] = fact.getLote();
            columna[4] = fact.getDescricion();
            myModel.addRow(columna);
        }
        
        
        return myModel;
    }
    /**
     * Metodo para limpiar los campos de texto
     */
    public static void limpiar(){
        InventarioMenu.txtIDInven.setText("");
        InventarioMenu.txtNombreInven.setText("");
        InventarioMenu.txtMarcaInven.setText("");
        InventarioMenu.txtYearInven.setText("");
        InventarioMenu.txtTipoInven.setText("");
        InventarioMenu.txtCategoriaInven.setText("");
        InventarioMenu.txtNombre.setText("");
    }
    /**
     * Metodo para guardar
     * @param descripcion descripcion del prodcuto
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param marca marca del producto
     * @param cantidad cantidad del producto
     * @param fabricacion fabricacion del producto
     * @param lote lote del producto
     */
    public static void guardar(String nombre,int precio,String marca,int cantidad, String fabricacion,String lote, String descripcion){
        Producto pro = new Producto(0,nombre ,precio,cantidad,marca, fabricacion,lote,descripcion);
        fc.guardar(pro);
        llenarTabla(InventarioMenu.TablaInven);
    }
    /**
     * Metodo para consultar un dato
     * @param tabla tabla de productos
     */
    public static void consultar(JTable tabla){
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Producto> arr = new ArrayList();
        
        try {
            int id = Integer.parseInt(InventarioMenu.txtIDInven.getText());
            arr = fc.consultar(id);
            myModel = tabla(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        tabla.setModel(myModel);
    }
    /**
     * Metodo para actualizar un producto
     * @param desc descripcion del prodcuto
     * @param nombre nombre del producto
     * @param precio nuevo precio
     * @param marca nueva marca
     * @param cantidad nueva cantidad
     * @param fabricacion nueva fabriacion
     * @param lote nuevo lote
     */
    public static void actualizar(String nombre,int precio,String marca,int cantidad, String fabricacion,String lote,String desc){
        Producto pro = new Producto(0,nombre ,precio,cantidad,marca, fabricacion,lote,desc);
        fc.actualizar(pro);
        llenarTabla(InventarioMenu.TablaInven);
    }
    /**
     * Metodo para eliminar un dato
     * @param id id del dato a eliminar
     */
    public static void eliminar(int id){
        fc.eliminar(id);
        llenarTabla(InventarioMenu.TablaInven);
    }

    
}
