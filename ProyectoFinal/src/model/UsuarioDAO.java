/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;




/**
 *
 * @author Ruth
 */
public class UsuarioDAO extends Conexion{
    
    private String instruccionSQL;
    private PreparedStatement preSta;
    
   public void datosSave (Usuario usuario){
       try{
           this.conectar();
           String instruccionSQL = "insert into `usuarios` (user, contra) Values (?,?)";
           preSta = this.conectar.prepareStatement(instruccionSQL);
           preSta.setString(1, usuario.user);
           preSta.setString(2, usuario.contra);
           long time = System.currentTimeMillis();
                   
            int update = preSta.executeUpdate();
            if (update>0) {
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
                
            }
            
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }finally{
           this.cerrarConex();
        }
       
   } 
   
      
   public void obtenerDatos (){
       ArrayList <Usuario> datos = new ArrayList<>();
   } 
   
}
