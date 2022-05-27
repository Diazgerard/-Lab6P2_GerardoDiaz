/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_nombre;

/**
 *
 * @author gerar
 */
public class Casa {
    
    private String nombre;
    private Object tamanio;
    private Object costo;
    private Object xOrdenado;
    private Object yOrdenado;

    public Casa() {
    }

    public Casa(String nombre, Object tamanio, Object costo, Object xOrdenado, Object yOrdenado) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.costo = costo;
        this.xOrdenado = xOrdenado;
        this.yOrdenado = yOrdenado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getTamanio() {
        return tamanio;
    }

    public void setTamanio(Object tamanio) {
        this.tamanio = tamanio;
    }

    public Object getCosto() {
        return costo;
    }

    public void setCosto(Object costo) {
        this.costo = costo;
    }

    public Object getxOrdenado() {
        return xOrdenado;
    }

    public void setxOrdenado(Object xOrdenado) {
        this.xOrdenado = xOrdenado;
    }

    public Object getyOrdenado() {
        return yOrdenado;
    }

    public void setyOrdenado(Object yOrdenado) {
        this.yOrdenado = yOrdenado;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
