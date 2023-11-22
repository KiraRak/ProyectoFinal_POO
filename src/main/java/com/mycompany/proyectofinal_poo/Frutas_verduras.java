/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo.colmenares
 */
public class Frutas_verduras extends Alimentos {
    String color;

    public Frutas_verduras(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}