/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import model.Cifrado;
import model.Usuario;
import java.sql.ResultSet;




/**
 *
 * @author Ruth
 */
public class UsuarioDAO extends Conexion{
    
    private String instruccionSQL;
    private PreparedStatement preSta;
    
    
   public void datosSave (Usuario usuario){
       try{
           String encriContra;
           Cifrado cifrarContra = new Cifrado(7);
           encriContra = cifrarContra.encriptar(usuario.contra);
           this.conectar();
           String instruccionSQL = "insert into `usuarios` (user, contra) Values (?,?)";
           preSta = this.conectar.prepareStatement(instruccionSQL);
           preSta.setString(1, usuario.user);
           preSta.setString(2, encriContra);
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
   
      
   public Usuario obtenerDatos (String user){
       Usuario data = new Usuario("","");
       ResultSet respond;
       
       try{
           
           Cifrado cifrarContra = new Cifrado(7);
           this.conectar();
           instruccionSQL = "SELECT * FROM `usuarios` WHERE user = ?;";
           respond = preSta.executeQuery();
           if (respond.next()){
               String userBase = respond.getString("user");
               String contraBase = respond.getString("contra");
               String desencripContra = cifrarContra.desencriptar(contraBase);
               data.setContra(contraBase);
               data.setUser(user);
            }
           
            else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }

       }catch(Exception exc){
           System.out.println(exc.getMessage());
       }finally{
           this.cerrarConex();
       }
       return data;   
   }
   
    
   
}
