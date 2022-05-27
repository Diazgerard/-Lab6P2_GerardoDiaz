/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_nombre;

import java.awt.Color;

/**
 *
 * @author gerar
 */
public class Puffle {
    
    private String nombre;
    private Color color;
    private Object precio;

    public Puffle() {
    }

    public Puffle(String nombre, Color color, Object precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object getPrecio() {
        return precio;
    }

    public void setPrecio(Object precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
    
}
