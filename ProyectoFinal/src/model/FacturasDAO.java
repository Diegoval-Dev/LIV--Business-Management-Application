/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Controller.ControllerFactura;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author diego
 */
public class FacturasDAO extends Conexion{
    private String instruccionSQL;
    private PreparedStatement ms;
    /**
     * Este metodo Jala los datos de la tabla y los convierte en objetos de tipo factura
     * @return Arraylist con todos los objetos de tipo factura
     */
    public ArrayList<Factura> lista() {
     ArrayList<Factura> lista = null; 
     ResultSet resultado;
     try{
         this.conectar();
         instruccionSQL = "SELECT * FROM facturas";
         ms = this.conectar.prepareStatement(instruccionSQL);
         resultado = ms.executeQuery();
         lista = new ArrayList();
         while(resultado.next()){
             int id = resultado.getInt("id");
             String nit = resultado.getString("nit");
             String producto = resultado.getString("producto");
             String fecha = resultado.getString("fecha");
             int total = resultado.getInt("total");
             Factura factura = new Factura(id,producto,nit,total,fecha);
             lista.add(factura);
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
         this.cerrarConex();
        }
     return lista;
    }
    /**
     * Metodo para consultar un dato especifico en la tabla
     * @param nit no. del dato a buscar
     * @return Arraylist con los datos encontrados
     */
    public ArrayList<Factura> consultar(String nit){
        ArrayList<Factura> lista = null; 
        ResultSet resultado;
        try{
            this.conectar();
            lista = new ArrayList();
            instruccionSQL ="SELECT * FROM `facturas` WHERE nit = ?;";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, nit);
            resultado = ms.executeQuery();
            if (resultado.next()) {
                int id = resultado.getInt("id");
                String producto = resultado.getString("producto");
                int total = resultado.getInt("total");
                String fecha = resultado.getString("fecha");
                Factura fc = new Factura(id,producto,nit,total,fecha);
                lista.add(fc);
                return lista;
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado!!"); 
                ControllerFactura.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
        return lista;
    }
    /**
     * Metodo para guardar nuevos registrso de facturas en la base de datos
     * @param factura objeto factura a guardar
     */
    public void guardar(Factura factura){
         try{
            this.conectar();
            instruccionSQL = "INSERT INTO `facturas` (nit,producto,fecha,total) VALUES(?,?,?,?)";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, factura.getNIT());
            ms.setString(2, factura.getProductos());
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            ms.setDate(3, d);
            ms.setInt(4, factura.getTotal());
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "fatura registrada");
                ControllerFactura.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
         this.cerrarConex();
        }
    }
    /**
     * metodo para actualizar datos de una factura
     * @param factura factura a actualizar datos
     */
    public void actualizar(Factura factura){
        try {
            this.conectar();
            long time = System.currentTimeMillis();
            java.sql.Date d = new java.sql.Date(time);
            instruccionSQL = "UPDATE `facturas` SET `producto`= '"+factura.getProductos()+"',`fecha` ='"+d+"',`total` ='"+factura.getTotal()+"' WHERE nit = ?";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, factura.getNIT());
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "FACTURA ACTUALIZADA");
                ControllerFactura.limpiar();
              }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
    }
    /**
     * Metodo para eliminar una factura de la base de datos
     * @param nit nit de la factura a aeliminar
     */
    public void eliminar(String nit){
        try {
            this.conectar();
            instruccionSQL ="DELETE FROM facturas WHERE nit=?";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setString(1, nit);
            int n = ms.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "FACTURA ELIMINADA"); 
                ControllerFactura.limpiar();
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
    }
}
