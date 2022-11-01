/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author diego
 * @author Ruth
 */
public class ControllerLogin {
    public static UsuarioDAO fc = new UsuarioDAO();
    public boolean datosSafe(String usuario, String password){
        Usuario safe = new Usuario("","");
        try{
            String contra = fc.obtenerDatos(usuario);
            safe.setUser(usuario);
            safe.setContra(contra);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if(safe.getContra().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
