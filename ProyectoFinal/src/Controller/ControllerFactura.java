/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import UI.FacturasMenu;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Conexion;

/**
 *
 * @author Jose Gramajo
 * @author Diego Valenzuela
 */
public class ControllerFactura {
    
    public static FacturasMenu ui = new FacturasMenu();
    public static void tabla(String valor){
        try{
            String titulos[] = {"NO.","NIT","Producto","Fecha","Total"};
            String registros[] = new String[5];
            FacturasMenu.model = new DefaultTableModel(null, titulos);
            Conexion conectar = new Conexion();
            Connection cn = conectar.conectar();
            String instruccionSQL  = "SELECT * FROM facturas WHERE nit LIKE '%" +valor+ "%'";
            PreparedStatement ms = cn.prepareStatement(instruccionSQL); 
           ResultSet rs = ms.executeQuery(instruccionSQL);
           while(rs.next()){
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("nit");
                registros[2] = rs.getString("producto");
                registros[3] = rs.getString("fecha");
                registros[4] = rs.getString("total");
                FacturasMenu.model.addRow(registros); 
           }
           FacturasMenu.tableFactura.setModel(FacturasMenu.model);
            System.out.println("SET");
            conectar.cerrarConex();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void limpiar(){
        ui.txtNIT.setText("");
        ui.txtProducto.setText("");
        ui.txtTotal.setText("");
        ui.txtNIT.requestFocus();
    }
    public static void guardar(String nit, String producto, String total){
        try{
            Conexion conectar = new Conexion();
            Connection cn = conectar.conectar();
            String instruccionSQL = "INSERT INTO facturas (nit,producto,fecha,total) VALUES(?,?,?,?)";
            PreparedStatement ms = cn.prepareStatement(instruccionSQL);
            ms.setString(1, nit);
            ms.setString(2, producto);
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            ms.setDate(3, d);
            ms.setString(4, total);
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "fatura registrada");
                limpiar();
                tabla("");
            }
            conectar.cerrarConex();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void consultar(String nit){
        try{
            Conexion conectar = new Conexion();
            Connection cn = conectar.conectar();
            String instruccionSQL ="select * from productos where nit=?";
            PreparedStatement ms = cn.prepareStatement(instruccionSQL);
            ms.setString(1, nit);
            ResultSet rs = ms.executeQuery();
            if (rs.next()) {
                ui.txtNIT.setText(rs.getString("nit"));
                ui.txtProducto.setText(rs.getString("producto"));
                ui.txtTotal.setText(rs.getString("total"));
                long time = System.currentTimeMillis();
                java.sql.Date d = new java.sql.Date(time);
                ms.setDate(4, d);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado!!"); 
                limpiar();
               tabla("");
            }
            conectar.cerrarConex();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static  void actualizar(String nit, String producto, String total){
        try {
            Conexion conectar = new Conexion();
            Connection cn = conectar.conectar();
            String instruccionSQL ="UPDATE facturas SET producto=?, fecha=?, total=? WHERE nit=?;";
            PreparedStatement ms = cn.prepareStatement(instruccionSQL);
            ms.setString(2, producto);
            ms.setString(4, total);
            //Date date = (Date) txtFecha.getDate();
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            ms.setDate(3, d);
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "FACTURA ACTUALIZADA");
               limpiar();
               tabla("");
              }
            conectar.cerrarConex();
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
    public static void eliminar(String nit){
        try {
            Conexion conectar = new Conexion();
            Connection cn = conectar.conectar();
            String instruccionSQL ="DELETE FROM facturas WHERE nit=?";
            PreparedStatement ms = cn.prepareStatement(instruccionSQL);
            ms.setString(1, nit);
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "FACTURA ELIMINADA"); 
                limpiar();
                tabla("");
              }
            conectar.cerrarConex();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
