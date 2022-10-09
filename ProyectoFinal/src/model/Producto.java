package model;


public class Producto {
    private int ID;
    private float precio;
    private int cantidad;
    private String marca;
    private String frabricacion;
    private int lote;
    
    /**
     * Getter para ID
     * @return ID
     */
    public int getID() {
        return ID;
    }
    
    /**
     * Setter para ID
     * @param ID 
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     * Getter para precio
     * @return  float precio
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * Setter para el precio
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * Getter para la cantidad
     * @return  int cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * Setter par la cantidad
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Getter para la cantidad del producto
     * @return string marca
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Setter para la marca del producto
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Getter para el fabricante
     * @return String fabricante
     */
    public String getFrabricacion() {
        return frabricacion;
    }
    
    /**
     * Setter para el fabricante
     * @param frabricacion 
     */
    public void setFrabricacion(String frabricacion) {
        this.frabricacion = frabricacion;
    }
    /**
     * Getter para el lote
     * @return int lote
     */
    public int getLote() {
        return lote;
    }
    
    /**
     * Setter para el lote
     * @param lote 
     */
    public void setLote(int lote) {
        this.lote = lote;
    }
    
    
    /**
     * Contructor con parametros
     * @param ID
     * @param precio
     * @param cantidad
     * @param marca
     * @param frabricacion
     * @param lote 
     */
    public Producto(int ID, float precio, int cantidad, String marca, String frabricacion, int lote) {
        this.ID = ID;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
        this.frabricacion = frabricacion;
        this.lote = lote;
    }  
    
    /**
     * Contructor sin parametros
     * void
     */
    public Producto(){
        ID = 0;
        precio = 0;
        cantidad = 0;
        marca = null;
        frabricacion = null;
        lote = 0;
    }
    
}
