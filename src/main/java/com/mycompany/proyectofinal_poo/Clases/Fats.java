package com.mycompany.proyectofinal_poo.Clases;
import com.mycompany.proyectofinal_poo.Nutritionalinfo;

public class Fats extends Foods implements Nutritionalinfo{
    public Fats(String nombre){
        super(nombre, "Grasas");
    }
    
    @Override
    public void showNutriInfo(){
        System.out.println("Informacion nutricional para " + nombre + ":");
    }
}
