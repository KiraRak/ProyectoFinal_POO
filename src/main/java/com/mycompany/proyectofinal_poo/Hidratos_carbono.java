/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo.colmenares
 */
public class Hidratos_carbono extends Alimentos {
    double contenidoCarbohidratos;

    public Hidratos_carbono(String nombre, double contenidoCarbohidratos) {
        super(nombre);
        this.contenidoCarbohidratos = contenidoCarbohidratos;
    }

    public double getContenidoCarbohidratos() {
        return contenidoCarbohidratos;
    }
}
