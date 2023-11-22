
package com.mycompany.proyectofinal_poo.Clases;

public class Foods {
    protected String nombre;
    protected String tipo;
    protected String forma;
    protected Integer peso;
    protected String tamano;
    protected String textura;
    protected String calorias;
    protected int proteinas;
    protected String color;
    
    public Foods(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getName(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getForma(){
        return forma;
    }
    
    public String getTamano(){
        return tamano;
    }
    
    public String getTextura(){
         return textura;
    }
    
    public String Calorias(){
        return calorias;
    }
    
    public int proteinas(){
        return proteinas;
    }
    
    public Integer peso(){
        return peso;
    }
    
    public String color(){
        return color;
    }
}
