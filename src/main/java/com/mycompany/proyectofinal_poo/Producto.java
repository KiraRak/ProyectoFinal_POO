/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Leonardo.colmenares
 */
public interface Producto {
    public String forma = "Redondo";
    public int cantidad = 5;
    
    default String forma(){
        return forma;
    }
    
    default int cantidad(){        
        return cantidad;
    }
    
}
 