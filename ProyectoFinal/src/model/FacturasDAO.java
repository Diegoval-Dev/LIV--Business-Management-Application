/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class FacturasDAO extends Conexion{
    private String instruccionSQL;
    private PreparedStatement ms;
    
    public ArrayList<Factura> listaFactura(){
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
    
}
