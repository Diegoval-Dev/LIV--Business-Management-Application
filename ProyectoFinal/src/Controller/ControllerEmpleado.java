/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import UI.EmpleadosMenu;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import model.EmpleadoDAO;

/**
 *
 * @author Jose Gramajo
 */
public class ControllerEmpleado {
    
    public static EmpleadoDAO fc = new EmpleadoDAO();
    /**
     * Metodo para llenar tabla al inicio del programa;
     * @param tabla 
     */
    public static void llenarTabla(JTable tabla){
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Empleado> arr = new ArrayList();
        
        try {
            arr = fc.listaEmpleados();
            myModel = tabla(arr);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        tabla.setModel(myModel);
    }
    /***
     * Funcion para llenar la tabla con un arraylist
     * @param arr arraylist de los empleados en la tabla
     * @return modelo de la tabla
     */
    public static DefaultTableModel tabla(ArrayList<Empleado> arr){
        DefaultTableModel myModel = new DefaultTableModel();
        myModel.addColumn("ID");
        myModel.addColumn("Nombre");
        myModel.addColumn("Edad");
        myModel.addColumn("Numero");
        myModel.addColumn("Puesto");
        Object[] columna = new Object[5];
        for(Empleado fact : arr){
            columna[0] = fact.getId();
            columna[1] = fact.getNombre();
            columna[2] = fact.getEdad();
            columna[3] = fact.getNumero();
            columna[4] = fact.getPuesto();
            myModel.addRow(columna);
        }
        return myModel;
    }
    
    /**
     * Metodo para limpiar los campos de texto
     */
    public static void limpiar(){
        EmpleadosMenu.txtNombredelEmpleado.setText("");
        EmpleadosMenu.txtEdad.setText("");
        EmpleadosMenu.txtPhone.setText("");
        EmpleadosMenu.txtPuesto.setText("");
        EmpleadosMenu.txtNombredelEmpleado.requestFocus();
    }
    
    /**
     * Metodo para guardar empleados
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param telefono telefono del empleado
     * @param puesto puesto del empleado
     */
    public static void guardar(String nombre, int edad, String telefono, String puesto){
        Empleado empleado = new Empleado (0,nombre,edad,numero,puesto);
        fc.guardar(empleado);
        llenarTabla(EmpleadosMenu.TablaEmpleados);
    }
    
    /**
     * Metodo para consultar un dato
     * @param tabla tabla de empleados
     */
    public static void consultar(JTable tabla){
        DefaultTableModel myModel = new DefaultTableModel();
        ArrayList<Empleado> arr = new ArrayList();
        
        try {
            String nombre = EmpleadosMenu.txtNombredelEmpleado.getName();
            arr = fc.consultar(nombre);
            myModel = tabla(arr);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        tabla.setModel(myModel);
        
    }
    
    /**
     * Metodo para actualizar un producto
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param telefono telefono del empleado
     * @param puesto puesto del empleado
     */
    public static void actualizar(String nombre, int edad, String telefono, String puesto){
        Empleado empleado = new Empleado (0,nombre,edad,numero,puesto);
        fc.actualizar(empleado);
        llenarTabla(EmpleadosMenu.TablaEmpleados);
    }
    
    /**
     * Metodo para eliminar un dato
     * @param nombre nombre del empleado a eliminar
     */
    public static void eliminar(String nombre){
        fc.eliminar(nombre);
        llenarTabla(EmpleadosMenu.TablaEmpleados);
    }

}
