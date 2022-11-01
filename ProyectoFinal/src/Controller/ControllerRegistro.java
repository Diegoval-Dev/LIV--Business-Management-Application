/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Ruth
 */
public class ControllerRegistro {
    
    public static UsuarioDAO UDAO = new UsuarioDAO();
    
    
    
    public static void registrar(String user, String contra){
       Usuario usuario = new Usuario(user, contra);
       UDAO.datosSave(usuario);
       
        
        
    } 

    
}
