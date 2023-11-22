
package com.mycompany.proyectofinal_poo.Clases;

public class Foods {
    protected String nombre;
    protected String tipo;
    
    public Foods(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    
}
