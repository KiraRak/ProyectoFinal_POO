package com.mycompany.proyectofinal_poo.Clases;
import com.mycompany.proyectofinal_poo.Nutritionalinfo;

public class Carbohydrates extends Foods implements Nutritionalinfo{
    public Carbohydrates(String nombre){
        super(nombre, "Carbohidratos");
    }
    
    @Override
    public void showNutriInfo(){
        System.out.println("Informacion nutricional para " + nombre + ":");
    }
}
