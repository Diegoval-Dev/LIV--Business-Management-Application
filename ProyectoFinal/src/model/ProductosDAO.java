package model;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author Roberto
 */
public class ProductosDAO extends Conexion {
    
    private String intruccionSQL;
    private PreparedStatement ms;
    
    /**
     * @autor josue :)
     * Funcion para jala todos los datos de la tabla Inventario
     * @return Arraylist con los objetos Producto
     */
    
    public ArrayList<Producto> listaProductos(){
     
        ArrayList<Producto> listaProductos = null;
        ResultSet resultado;
        
        try{
            System.out.println("Dsds");
            this.conectar();
            intruccionSQL = "SELECT * FROM productos";
            ms = this.conectar.prepareStatement(intruccionSQL);
            resultado = ms.executeQuery();
    
            while(resultado.next()){
                
                int id = resultado.getInt("id");
                float precio = resultado.getFloat("precio");
                int cantidad = resultado.getInt("cantidad");
                String marca = resultado.getString("marca");
                String fabricacion = resultado.getString("fabricacion");
                int lote = resultado.getInt("lote");
                String descripcion = resultado.getString("descripcion");
               
                Producto producto = new Producto(id,precio,cantidad,marca,fabricacion,lote,descripcion);
                listaProductos.add(producto);         
            }
                   
            
            
              
        }
        catch(Exception a){
            System.out.println(a.getMessage());
    
        }
        finally{
            this.cerrarConex();
        }
        return listaProductos;
    }
    
    /**
     * @author josue :)
     * Metodo para realizar una consulta a la base de datos
     * @param id id del objeto a realizar una consulta
     * @return Arraylist con el objeto que devolvio la consulta
     */
     public ArrayList<Producto> consultar(int id){
         ArrayList<Producto> lista = null;
         ResultSet resultado;
         
         try{
            this.conectar();
            lista = new ArrayList();
             String instruccionSQL = "SELECT * FROM `productos` WHERE id = ?;";
            
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setInt(1,id);
            
            resultado = ms.executeQuery();
            if (resultado.next()) {
                id = resultado.getInt("id");
                float precio = resultado.getFloat("precio");
                int cantidad = resultado.getInt("cantidad");
                String marca = resultado.getString("marca");
                String fabricacion = resultado.getString("fabricacion");
                int lote = resultado.getInt("lote");
                String descripcion = resultado.getString("descripcion");
                
                Producto producto = new Producto(id,precio,cantidad,marca,fabricacion,lote,descripcion);
                lista.add(producto);  
                
            }
            else{
                System.out.println("Not found");
                //JOptionPane.showMessageDialog(null, "Registro no encontrado!!"); 
                //ControllerFactura.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
         return lista;
     }
    
     /**
      * @author :)
      * Guarda objetos Producto en la base de datos
      * @param producto Producto a guardar en la base de datos
      */
     public void guardar(Producto producto){
         try{
            this.conectar();
            String instruccionSQL = "INSERT INTO `productos` (id,precio,cantidad,marca,fabricacion,lote,descripcion) VALUES(?,?,?,?)";
            ms = this.conectar.prepareStatement(instruccionSQL);
            
            ms.setInt(1,producto.getID());
            ms.setFloat(2, producto.getPrecio());
            ms.setInt(3, producto.getCantidad());
            ms.setString(4, producto.getMarca());
            ms.setString(5,producto.getFrabricacion());
            ms.setInt(6,producto.getLote());
            ms.setString(7, producto.getDescricion());
            
            int n = ms.executeUpdate();
            if(n>0){
                System.out.println("GUI lets know user");
            }
          
   
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
         this.cerrarConex();
        }
     }
     
     /**
      * @author josue :)
      * Metodo para actualizar un producto
      * @param producto Producto actualizado
      */
     public void actualizar(Producto producto){
                 
        System.out.println("Update pending"); 
     
     }
     /**
      * @author josue :)
      * Metodo para eliminar un producto
      * @param id id del producto a eliminar
      */
     public void eliminar(int id){
         
         
         try {
            this.conectar();
            String instruccionSQL ="DELETE FROM productos WHERE id=?";
            ms = this.conectar.prepareStatement(instruccionSQL);
            ms.setInt(1, id);
            int n = ms.executeUpdate();
            if (n>0) {
                System.out.println("GUI pops up");
                //JOptionPane.showMessageDialog(null, "FACTURA ELIMINADA"); 
               //ControllerProducto.limpiar();
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
         
         
     
     }
}
