package model;
public class Producto {
    private int ID;
    private String nombre;
    private float precio;
    private int cantidad;
    private String marca;
    private String frabricacion;
    private String lote;
    private String descricion;
/**
 * Constructor producto
 * @param ID id del producto
 * @param nombre nombre del producto
 * @param precio precio del producto
 * @param cantidad cantidad del producto
 * @param marca marca del producto
 * @param frabricacion fabricacion del producto
 * @param lote lote del producto
 * @param descricion descripcion el producto
 */
    public Producto(int ID,String nombre ,float precio, int cantidad, String marca, String frabricacion, String lote, String descricion) {
        this.ID = ID;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
        this.frabricacion = frabricacion;
        this.lote = lote;
        this.descricion = descricion;
        this.nombre = nombre;
    }
    /**
     * get Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Sert nombre
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la descripcion del producto
     * @return descipcion producto
     */
    public String getDescricion() {
        return descricion;
    }
    /**
    * Modifica la descripcion del producto la descripcion.
    * @param descricion descripcion del producto
    */
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }
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
    public String getLote() {
        return lote;
    }
    /**
     * Setter para el lote
     * @param lote 
     */
    public void setLote(String lote) {
        this.lote = lote;
    }
}
