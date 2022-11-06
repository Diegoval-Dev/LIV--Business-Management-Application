/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface DAO {
    /**
     * Funcion para enlistar todos los objetos de la base de datos
     * @return ArrayList con todos los objetos
     */
    public ArrayList<Object> lista();
    /**
     * Funcion para consultar un objeto en la base de datos
     * @param consulta parametro de consulta 
     * @return Arraylist con los objtos consultados
     */
    public ArrayList<Object> consultar(int consulta);
    /**
     * Metodo para guardar objetoss en la base de datos
     * @param object objeto a guardar en la base de datos
     */
    public void guardar(Object object);
    /**
     * Metodo para Actualizar un objeto en la base de datos
     * @param objeto Objeto a actualizar en la base de datos
     */
    public void actualizar(Object objeto);
    /**
     * Metodo para eliminar un objeto
     * @param eliminar parametro del objeto a eliminar
     */
    public void eliminar(String eliminar);
    
}
