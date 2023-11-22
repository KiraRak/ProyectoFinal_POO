
package com.mycompany.proyectofinal_poo.Clases;
import com.mycompany.proyectofinal_poo.Nutritionalinfo;

public class FruitsnVegetables extends Foods implements Nutritionalinfo{
    public FruitsnVegetables(String nombre){
        super(nombre, "Frutas y Verduras");
    }
    
    @Override
    public void showNutriInfo(){
        System.out.println("Informacion nutricional para " + nombre + ":");
    }
}
