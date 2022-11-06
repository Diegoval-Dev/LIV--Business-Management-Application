package model;
/**
 * Clase que almacenará la información importante de la factura con los productos adquiridos como: ID, productos, NIT, total y fecha.
 * @author jm, dv, rl
 */
public class Factura {
    private int ID;
    private String productos;
    private String NIT;
    private int total;
    private String fecha;
    /**
     * Constructor
     * @param ID
     * @param productos
     * @param NIT
     * @param total
     * @param fecha 
     */
    public Factura(int ID, String productos, String NIT, int total, String fecha) {
        this.ID = ID;
        this.productos = productos;
        this.NIT = NIT;
        this.total = total;
        this.fecha = fecha;
    }     
    /**
     * Getter para ID de la factira
     * @return int ID
     */
    public int getID() {
        return ID;
    } 
    /**
     * Setter para el ID de la factura
     * @param ID 
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Getter para la lista de productos en la lista.
     * @return ArrayList de la clase Producto
     */
    public String getProductos() {
        return productos;
    }    
    /**
     * Setter para la lista de producto en la factura.
     * @param productos 
     */
    public void setProductos(String productos) {
        this.productos = productos;
    }    
    /**
     *Getter para el NIT de la factura
     * @return String NIT
     */
    public String getNIT() {
        return NIT;
    }      
    /**
     * Setter para el  NIT de la factura
     * @param NIT 
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    } 
    /**
     * Getter para el toda
     * @return float toral
     */
    public int getTotal() {
        return total;
    }    
    /**
     * Setter para el tota de la factura.
     * @param total 
     */
    public void setTotal(int total) {
        this.total = total;
    }        
    /**
     * Getter par para la fecha
     * @return String fecha
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Setter para la fecha
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Metodo toString()
     * @return 
     */
    @Override
    public String toString() {
        return "Factura{" + "ID=" + ID + ", productos=" + productos + ", NIT=" + NIT + ", total=" + total + ", fecha=" + fecha + '}';
    }
}
