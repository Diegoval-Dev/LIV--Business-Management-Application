/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import model.Cifrado;
import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import UI.RegistroLiv;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControllerRegistro {
    public static void registar(){
        try{
            Cifrado cice = new Cifrado(7);
            Conexion conectar = new Conexion();
            Connection connection = conectar.conectar();
            String instruccionSQL = "insert into usuarios (user, contra) values (?,?);";
            PreparedStatement preSta = connection.prepareStatement(instruccionSQL);
            preSta.setString(1, RegistroLiv.txtUsername.getText());
            preSta.setString(2, cice.encriptar(RegistroLiv.txtPassWord.getText()));
            
            int update = preSta.executeUpdate();
            if (update>0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
            
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    } 
}
