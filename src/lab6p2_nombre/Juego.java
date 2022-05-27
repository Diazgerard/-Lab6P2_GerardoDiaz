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
public class Juego {
    private String nombre;
    private Object costo;
    private Object recompensas;
    private Object porcentaje;

    public Juego() {
    }

    public Juego(String nombre, Object costo, Object recompensas, Object porcentaje) {
        this.nombre = nombre;
        this.costo = costo;
        this.recompensas = recompensas;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getCosto() {
        return costo;
    }

    public void setCosto(Object costo) {
        this.costo = costo;
    }

    public Object getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(Object recompensas) {
        this.recompensas = recompensas;
    }

    public Object getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Object porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
