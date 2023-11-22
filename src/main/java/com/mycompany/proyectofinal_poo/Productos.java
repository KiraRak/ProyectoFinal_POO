/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Leonardo.colmenares
 */
public class Productos {

    public static void main(String[] args) {
       Frutas_verduras manzana = new Frutas_verduras("Manzana", "Rojo");
       Grasas mantequilla = new Grasas("Mantequilla", 82.5);
       Hidratos_carbono arroz = new Hidratos_carbono("Arroz", 78.2);

       System.out.println("Fruta: " + manzana.getNombre() + ", color: " + manzana.getColor());
       System.out.println("Grasa: " + mantequilla.getNombre() + ", contenido de grasa: " + mantequilla.getContenidoGrasa() + "%");
       System.out.println("Hidrato de carbono: " + arroz.getNombre() + ", contenido de carbohidratos: " + arroz.getContenidoCarbohidratos() + "%"); 
        
    }
    
}
