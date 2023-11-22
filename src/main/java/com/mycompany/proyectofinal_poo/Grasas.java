/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo.colmenares
 */
public class Grasas extends Alimentos {
    double contenidoGrasa;

    public Grasas(String nombre, double contenidoGrasa) {
        super(nombre);
        this.contenidoGrasa = contenidoGrasa;
    }

    public double getContenidoGrasa() {
        return contenidoGrasa;
    }
}
